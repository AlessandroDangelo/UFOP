Exercício
=========

- Dizemos que um número $n$ é primo se ele é divisível por 1 e por
ele mesmo. Crie uma função Haskell que retorne todos os números
primos em um dado intervalo. _Dica_: use a função `factors`.

~~~~~{.haskell}
primes :: Int -> Bool
~~~~~~~

\begin{code}
primes :: Int -> [Int]
primes n = [x | x <- [1..n], length(fatores (x)) == 2]
    where
        fatores :: Int -> [Int]
        fatores n = [x | x <- [1..n], n `mod` x == 0]
\end{code}

Exercício
=========

- Defina a função

~~~~{.haskell}
max3 :: Int -> Int -> Int -> Int
~~~~~
que a partir de 3 números inteiros fornecidos como entrada,
retorna o maior deles.

\begin{code}
max3 :: Int -> Int -> Int -> Int
max3 num1 num2 num3 = 
    if (num1 >= num2 && num1 >= num3)
        then num1
        else if (num2 >= num1 && num2 >= num3)
            then num2
            else num3
\end{code}

Exercício
=========

- Dado um vetor $\overrightarrow{v} = (x,y)$,
sua versão normalizada é calculada da seguinte forma:

$$
\left( \frac{x}{\|v\|}, \frac{y}{\|v\|} \right)
$$
em que $\|\overrightarrow{v}\|$ é dado por:
$$
\|\overrightarrow{v}\| = \sqrt{x^2 + y^2}
$$

\begin{code}
normalizaVetor :: (Double, Double) -> (Double, Double)
normalizaVetor (x, y) = ((x / (sqrt (x^2 + y^2))), (y / (sqrt (x^2 + y^2))))
\end{code}

Exercício
=========

- Defina uma função para testar se uma lista possui 2 elementos ou menos.
Faça isso de duas formas: 1) usando casamento de padrão, com uma equação
para cada possibilidade e 2) usando a função `length`, de tipo:

~~~~~{.haskell}
length :: [a] -> Int
~~~~~~

\begin{code}
-- Quetão 5 - a
menorIgualDois_a :: [a] -> Bool
menorIgualDois_a [] = True
menorIgualDois_a [_] = True
menorIgualDois_a [_, _] = True
menorIgualDois_a _ = False
-- Quetão 5 - b
menorIgualDois_b :: [a] -> Bool
menorIgualDois_b [] = True
menorIgualDois_b (x:xs)
    | length((x:xs)) <= 2 = True
    | otherwise = False
\end{code}