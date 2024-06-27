Exercício
=========

- Implemente um parser que calcula o número de pares de
parêntesis balanceados em uma string de entrada.

\begin{code}

sat' :: (s -> Bool) -> Parser s Int
sat' p = Parser (\ inp -> case inp of
                           [] -> []
                           (x : xs) -> if p x
                                       then [(1, xs)]
                                       else [(0, xs)])
open' :: Char -> Bool
open' c 
  | c == '('  = True
  | otherwise = False
close' :: Char -> Bool
close' c 
  | c == ')'  = True
  | otherwise = False
pairs :: Parser Char Int
pairs = (f <$> (sat' open') <*> pairs <*> (sat' close') <*> pairs)
         <|> succeed 0
         where
           f _ a _ a' = 1 + a + a'
\end{code}

~~~~{.haskell}
pairs :: Parser Char Int
~~~~~

Mais combinadores
================

- O parser `option p d` reconhece a entrada aceita por `p`
ou retorna o valor padrão `d`.

\begin{code}
option :: Parser s a -> a -> Parser s a
option p d = p <|> succeed d
\end{code}

Mais combinadores
=================

- Repetindo a execução de um parser.

\begin{code}
many :: Parser s a -> Parser s [a]
many p = ((:) <$> p <*> many p) <|> succeed []
many1 :: Parser s a -> Parser s [a]
many1 p = (:) <$> p <*> many p
\end{code}

Natural
=======

\begin{code}
natural :: Parser Char Int
natural = foldl f 0 <$> many digit
     where
       f ac d = ac * 10 + d
\end{code}

Combinadores
============

- Descartando resultados intermediários.

\begin{code}
first :: Parser s a -> Parser s a
first (Parser p)
   = Parser (\ inp -> let r = p inp
                      in if null r then []
                         else [head r])
\end{code}

Combinadores
============

\begin{code}
greedy :: Parser s a -> Parser s [a]
greedy = first . many
greedy1 :: Parser s a -> Parser s [a]
greedy1 = first . many1
\end{code}


Identificadores
===============

\begin{code}
identifier :: Parser Char String
identifier
   = (:) <$> letter <*> greedy (sat isAlphaNum)
     where
       letter = sat isLetter
\end{code}

Separadores
===========

- Parser `listOf p sep` processa elementos usando `p`
usando como separador `sep`.

\begin{code}
listOf :: Parser s a -> Parser s b -> Parser s [a]
listOf p sep
   = (:) <$> p <*> many ((\ x y -> y) <$> sep <*> p)
\end{code}


Separadores
===========

- Parser `pack p q r` processa o parser `q` usando os separadores
`p` e `r`, descartando-os.

\begin{code}
pack :: Parser s a -> Parser s b ->
        Parser s c -> Parser s b
pack p q r = (\ _ x _ -> x) <$> p <*> q <*> r
\end{code}

Exemplo
=======

- Processando conteúdo entre parêntesis.

\begin{code}
parenthesized :: Parser Char a -> Parser Char a
parenthesized p = pack (symbol '(') p (symbol ')')
\end{code}


Separadores
===========

- O parser `endBy p q` processa listas de elementos
reconhecidos por `p` usando como separadores o que
é processado por `q`.

\begin{code}
endBy :: Parser s a -> Parser s b -> Parser s [a]
endBy p sep = greedy ((\ x _ -> x) <$> p <*> sep)
\end{code}

Exemplo
=======

- Processando arquivos CSV

- Arquivos CSV: representação textual de dados
em tabelas (planilhas)
    - Dados representados como strings.
    - Separadores para dividir colunas.
    - Linhas no arquivo denotam linhas na tabela.


Modelagem
=========

- Tipos para representar dados CSV.

\begin{code}
type CSV = [Line]
type Line = [Cell]
type Cell = String
\end{code}

Células
=======

- Qualquer string sem `\n` e `,`.

\begin{code}
cellParser :: Parser Char Cell
cellParser = greedy valid
    where
       valid = sat (\ c -> notElem c ",\n")
\end{code}

Linhas
======

- Usaremos o parser `listOf`, seperando colunas

\begin{code}
lineParser :: Parser Char Line
lineParser = listOf cellParser (symbol ',')
\end{code}

CSV
===

\begin{code}
csvParser :: Parser Char CSV
csvParser = endBy lineParser eol
   where
     eol = symbol '\n'
\end{code}


Exemplo
=======

\begin{code}
parseCSV :: FilePath -> IO ()
parseCSV file
   = do
       content <- readFile file
       print (runParser csvParser content)
\end{code}


Separadores
===========

- No que vimos, separadores não possuem significado.

- Mas, seperadores podem possuir significado?
    - Sim! Expressões com operadores binários.


Chainr
======

- Operador associativo a direita

\begin{code}
chainr :: Parser s a ->             -- expressão
          Parser s (a -> a -> a) -> -- operador
          Parser s a
chainr pe po
   = h <$> many (j <$> pe <*> po) <*> pe
     where
       j x op = op x
       h fs x = foldr ($) x fs
\end{code}

Chainl
======

- Operador associativo a esquerda

\begin{code}
chainl :: Parser s a ->             -- expressão
          Parser s (a -> a -> a) -> -- operador
          Parser s a
chainl pe po
   = h <$> pe <*> many (j <$> po <*> pe)
     where
       j op x = \ y -> op y x
       h x fs = foldl (flip ($)) x fs
\end{code}

Exemplo
=======

- Processando expressões.
- Sintaxe de expressões:

$$
\begin{array}{lcl}
e & \to  & t + e \\
  & \mid & t \\
t & \to & f * t \\
  & \mid & f \\
f & \to & n \\
  & \mid & (e)\\
\end{array}
$$

Sintaxe
=======

- Tipo de dados para representar a árvore de sintaxe
de expressões.

\begin{code}
--data Exp
--   = Const Int
--   | Exp :+: Exp
--   | Exp :*: Exp
--   deriving (Eq, Ord, Show)
\end{code}

Parser
======

- Regras $f \to n \mid (e)$:

\begin{code}
factorParser :: Parser Char Exp
factorParser
   =  parenthesized (expParser) <|>
      (Const <$> natural)
\end{code}

Parser
======

- Regras $t \to f + t \mid t$:

\begin{code}
termParser :: Parser Char Exp
termParser
   = chainr factorParser pmult
     where
       pmult = const (:*:) <$> symbol '*'
\end{code}


Parser
======

- Regras $e \to t * e \mid t$:

\begin{code}
--expParser :: Parser Char Exp
--expParser
--  = chainr termParser pplus
--    where
--      pplus = const (:+:) <$> symbol '+'
\end{code}


Exercício
=========

- Implemente um parser para strings da forma:

$$
(id_1, ... , id_n)
$$

em que cada $id_i$ é um identificador. Note que a lista
de identificadores usa como separador o caractere ','.

\begin{code}
--idListParser :: Parser Char [String]
--idListParser = listOf identifier (symbol ',')
idListParser :: Parser Char [String]
idListParser = listOf identificador (symbol ',')
  where
    identificador = greedy (notSymbol ',')
notSymbol :: Char -> Parser Char Char
notSymbol p1
  = Parser (\ inp -> case inp of
                       [] -> []
                       (x : xs) -> if x /= p1
                                   then [(x,xs)]
                                   else [])
\end{code}


Exercício
=========

- Modifique o tipo de dados `Exp` para incluir
a operação de subtração. Altere o parser de forma
a reconhecer expressões evolvendo subtração.

\begin{code}
data Exp
   = Const Int
   | Exp :+: Exp
   | Exp :-: Exp
   | Exp :*: Exp
   deriving (Eq, Ord, Show)
expParser :: Parser Char Exp
expParser
  = chainr termParser (pplus <|> pminus)
    where
      pplus = const (:+:) <$> symbol '+'
      pminus = const (:-:) <$> symbol '-'
\end{code}

Exercício
=========

- O parser de expressões utiliza a função `natural`
que reconhece um número natural qualquer. Implemente um
parser `integer :: Parser Char Int` que seja capaz de
reconhecer números negativos. _Dica_: Use o combinador
`option`.

\begin{code}
integer :: Parser Char Int
integer = option2 
option2 :: Parser Char Int
option2 = ((\ x y -> y) <$> (symbol '-') <*> negativo) <|> natural
negativo :: Parser Char Int
negativo = foldl f 0 <$> many digit
     where
       f ac d = ac * 10 - d
\end{code}