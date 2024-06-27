Exercícios
==========
- Escreva definições que possuam os seguintes tipos. Não se
preocupe se seu código faz ou não sentido desde que ele
seja aceito pelo compilador.
```haskell
bools :: [Bool]
nums  :: [[Int]]
add   :: Int -> Int -> Int -> Int
copy  :: a -> (a, a)
apply :: (a -> b) -> a -> b
swap  :: (a,b) -> (b,a)
```
\begin{code}
bools::[Bool]
bools = [True, False]
nums::[[Int]]
nums = [[1, 2], [3, 4]]
add::Int -> Int -> Int -> Int
add a b c = a + b + c
copy::a -> (a, a)
copy a = (a, a)
apply::(a -> b) -> a -> b
apply f x = f x
swap::(a,b) -> (b,a)
swap (a, b) = (b, a)
\end{code}