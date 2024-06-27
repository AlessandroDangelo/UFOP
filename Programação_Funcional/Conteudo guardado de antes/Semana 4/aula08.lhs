Exercício
=========

- Reimplemente a função `bin2Int` utilizando `foldr`.

- Um inconveniente da solução de serialização é a utilização
do tipo `Bit` como um sinônimo. Idealmente, deveríamos utilizar
um novo tipo, como se segue.

```haskell
data Bit = O | I deriving Show
```
Modifique a implementação da serialização para utilizar essa
versão do tipo `Bit`.
\begin{code}
bin2intFR :: [Bit] -> Int
bin2intFR bs = sum (foldr step [] (zip (iterate (* 2) 1) bs))
  where
    step (a, b) acc = (a*b):acc
\end{code}
\begin{code}
data Bit_ = O | I deriving (Show, Eq)
bin2Int_Bit_ :: [Bit_] -> Int
bin2Int_Bit_ bs = sum [if b == O then w * 0 else w * 1 | (w,b) <- zip weights bs]
  where
    weights = iterate (* 2) 1
int2Bin_Bit_ :: Int -> [Bit_]
int2Bin_Bit_ 0 = []
int2Bin_Bit_ n = (if (n `mod` 2) == 0 then O else I) : int2Bin_Bit_ (n `div` 2)
make8_Bit_ :: [Bit_] -> [Bit_]
make8_Bit_ bs = take 8 (bs ++ repeat O)
chop8_Bit_ :: [Bit_] -> [[Bit_]]
chop8_Bit_ [] = []
chop8_Bit_ bs = take 8 bs : chop8_Bit_ (drop 8 bs)
encode_Bit_ :: String -> [Bit_]
encode_Bit_ = concat . map (make8_Bit_ . int2Bin_Bit_ . ord)
decode_Bit_ :: [Bit_] -> String
decode_Bit_ = map (chr . bin2Int_Bit_) . chop8_Bit_
\end{code}