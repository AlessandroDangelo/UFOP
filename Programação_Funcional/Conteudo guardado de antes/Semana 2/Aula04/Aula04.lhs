Exercício
=========
- Defina a função `minList` que retorna o menor inteiro de uma lista
de números fornecida como entrada. Siga cada um dos passos anteriores
para sua solução.
\begin{code}
-- Questao 1
minList :: [Int] -> Int
minList [] = 0
minList [x] = x
minList (x:xs)
     | x <= minList xs = x
     | otherwise = minList xs
\end{code}
Exercício
=========
- Implemente a função `andList` que produz a conjunção
de uma lista de booleanos fornecida como entrada.
- Implemente a função `orList` que produz a disjunção
de uma lista de booleanos fornecida como entrada.
\begin{code}
-- Questao 2
andList :: [Bool] -> Bool
andList a = andList' a True
     where
          andList' [] y = y
          andList' [x] y = x && y
          andList' (x:xs) y = andList' xs (x && y)
orList :: [Bool] -> Bool
orList a = orList' a False
     where
          orList' [] y = y
          orList' [x] y = x || y
          orList' (x:xs) y = orList' xs (x || y)
\end{code}
Exercício
=========
- Implemente a função `indexOf` que, a partir de um inteiro `x`
e uma lista de inteiros `xs`, retorna a posição de `x` na lista `xs`.
Caso `x` não pertença a lista, o valor -1 deve ser retornado.
\begin{code}
-- Questao 3
indexOf :: Int -> [Int] -> Int
indexOf a xs = indexOf' a xs 0
     where
          indexOf' a [] c = -1
          indexOf' a [x] c =
               if (a == x)
                    then c + 1
                    else indexOf' a [] (c+1)
          indexOf' a (x:xs) c = 
               if (a == x)
                    then c + 1
                    else indexOf' a xs (c+1)
\end{code}
Exercício
=========
- A função `takeList` recebe como entrada um número inteiro $n$
e uma lista $xs$ e retorna, como resultado, uma lista contendo os
primeiros $n$ de $xs$. Implemente `takeList` seguindo os passos apresentados
para definir uma função recursiva.
\begin{code}
-- Questao 4
takeList :: Int -> [a] -> [a]
takeList num [] = []
takeList num (x:xs) = takeList' num (x:xs) []
     where
          takeList' 0 (x:xs) acc = reverse acc
          takeList' num (x:xs) acc = takeList' (num - 1) xs (x:acc)
\end{code}
Exercício
=========
- A função `dropList` recebe como entrada um número inteiro $n$
e uma lista $xs$ e remove os $n$ primeiros elementos de $xs$.
Implemente `dropList` seguindo os passos apresentados
para definir uma função recursiva.
\begin{code}
-- Questao 5
dropList :: Int -> [a] -> [a]
dropList num [] = []
dropList num (x:xs) = dropList' num (x:xs)
     where
          dropList' 0 (x:xs) = (x:xs)
          dropList' _ [] = []
          dropList' num (x:xs) = dropList' (num - 1) xs
\end{code}
Exercício
=========
- Implemente a função `removeAll` que, a partir de um inteiro `x` e
uma lista de inteiros `xs`, remove todas as ocorrências de `x` da lista `xs`.
Apresente duas implementações: 1) usando recursividade e 2) usando list comprehensions.
\begin{code}
-- Questao 6
removeAll :: Int -> [Int] -> [Int]
removeAll num [] = []
removeAll num [x] = 
     if (num == x)
          then []
          else [x]
removeAll num (x:xs) = removeAll' num (x:xs) []
     where
          removeAll' num [] list = list
          removeAll' num [x] list =
               if (num == x)
                    then list
                    else list++[x]
          removeAll' num (x:xs) list = 
               if (num == x)
                    then removeAll' num xs list
                    else removeAll' num xs list++[x]
removeAllListComprehensions :: Int -> [Int] -> [Int]
removeAllListComprehensions num xs = [x | x <- xs, x /= num]
\end{code}
Exercício
=========
- Implemente a função `countPos` que, a partir de uma lista de números inteiros,
retorna a sua quantidade de números positivos.
\begin{code}
-- Questao 7       
countPos :: [Int] -> Int
countPos [] = 0
countPos [x] =
     if (x > 0)
          then 1
          else 0
countPos x = countPos' x 0
     where
          countPos' [] z = z
          countPos' [x] z =
               if(x > 0)
                    then z+1
                    else z
          countPos' (x:xs) z =
               if(x >= 1)
                    then countPos' xs z+1
                    else countPos' xs z
\end{code}