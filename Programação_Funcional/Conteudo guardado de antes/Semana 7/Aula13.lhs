Exercícios
==========
- Desenvolva a função
> inRange :: Int -> Int -> [Int] -> [Int]
> inRange num1 num2 list = [x | x <- list, x >= num1 && x <= num2]
que retorna os elementos de uma lista pertencentes
ao intervalo especificado pelos dois primeiros parâmetros
de inRange.
Exercícios
==========
Sua implementação deve atender os testes a seguir:
> inRangeUnit :: TestTree
> inRangeUnit
>    = testCase "inRage test" $
>       inRange 2 5 [1..10] @?= [2,3,4,5]
Evidentemente, como `inRange` não está implementada,
o teste irá falhar.
Exercícios
==========
- Descreva uma propriedade que especifique o resultado
esperado por sua implementação de `inRange`.
> inRangeProperty :: Int -> Int -> [Int] -> Bool
> inRangeProperty num1 num2 [] = (inRange num1 num2 []) == []
> inRangeProperty num1 num2 [x]
>   | x >= num1 && x <= num2 = (inRange num1 num2 [x]) == [x]
>   | otherwise = (inRange num1 num2 [x]) == []
> inRangeProperty num1 num2 (x:xs) = inRangeProperty' num1 num2 (x:xs) (inRange num1 num2 (x:xs))
>   where
>       inRangeProperty' num1 num2 (x:xs) []
>           | (all (outOfRange num1 num2) (x:xs)) = True
>           | otherwise                           = False
>       inRangeProperty' num1 num2 (x:xs) (y:ys)
>           | (num1 < num2)  = (all (>=num1) (y:ys)) && (all (<=num2) (y:ys))
>           | (num1 == num2) = (all (==num1) (y:ys))
>           | otherwise      = (y:ys) == []
> outOfRange :: Int -> Int -> Int -> Bool
> outOfRange num1 num2 x
>   | (x > num2) || (x < num1) = True
>   | otherwise                = False
Agrupando testes
================
> properties :: TestTree
> properties
>    = testGroup "Propriedades"
>        [
>           TQ.testProperty "sort preserves length"
>                sortPreservesLength
>        ,  TQ.testProperty "id preserves length"
>                idPreservesLength
>        ,  TQ.testProperty "sort ensures sorting"
>                sortEnsuresSorted
>        ,  TQ.testProperty "sort permutes input"
>                sortPermutes
>        ,  TQ.testProperty "evil sort ensures sorting"
>                (sorted . evilSort)
>        ,  TQ.testProperty "inRange specification"
>                inRangeProperty
>        ]
Agrupando testes
================
- Testes de unidade
> unitTests :: TestTree
> unitTests = testGroup "Testes de unidade"
>                 [
>                   mkNameTest
>                 , inRangeUnit
>                 ]
Agrupando testes
================
> tests :: TestTree
> tests = testGroup "Testes" [unitTests, properties]
Main
====
> main :: IO ()
> main = defaultMain tests
Listas ordenadas
================
> sorted :: [Int] -> Bool
> sorted []  = True
> sorted [_] = True
> sorted (x : y : ys) = x <= y && sorted (y : ys)
Insertion sort
==============
> sort :: [Int] -> [Int]
> sort [] = []
> sort (x : xs) = insert x (sort xs)
> insert :: Int -> [Int] -> [Int]
> insert x [] = [x]
> insert x (y : ys)
>       | x <= y    = x : y : ys
>       | otherwise = y : insert x ys