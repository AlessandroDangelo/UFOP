Exercícios
==========

- Apresente a derivação de tipo da expressão `not (not True)`

$$
\frac{not :: Bool \to Bool\:\:\:\:\:\:True : Bool}{not\:True :: Bool}
$$

Exercícios
==========

1. Implemente uma função que, a partir de
3 números inteiros, retorne a soma dos quadrados
dos dois maiores números.

\begin{code} 
absolute :: Int -> Int -> Int -> (Int)
absolute x y z = n3
     where 
          n1 
               | x > y = x * x
               | otherwise = y * y

          n2 
               | y > z = y * y
               | otherwise = z * z

          n3 = n1 + n2

\end{code}

Exercícios
==========

1. A função de Fibonacci pode ser definida como:

$$
F(n) = \left\{
         \begin{array}{ll}
           0 & \textit{se } n = 0\\
           1 & \textit{se } n = 1 \\
           F(n - 1) + F(n - 2) & \textit{caso contrário.}
         \end{array}
       \right.
$$

Implemente uma função em Haskell para calcular `F(n)`.

\begin{code}
fib :: Int -> Int
fib 0 = 0
fib 1 = 1
fib x = fib (x-1) + fib (x-2)
\end{code}


Exercícios
==========

2. A função de Fibonacci, implementada de acordo com
a definição anterior, realiza um número exponencial de
chamadas recursivas. Implemente uma função que calcule
`F(n)` fazendo um número linear de chamadas recursivas.

\begin{code}
fibLinear :: Int -> Int
fibLinear x = round ( ((1 + (sqrt 5))^x - (1 - (sqrt 5))^x)/(2^x * (sqrt 5)) ) :: Int
\end{code}
