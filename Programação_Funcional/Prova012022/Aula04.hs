módulo  Aula04  onde

importar  Prelude  ocultando ( comprimento
                      , replicar
                      , soma
                      , reverter
                      , elemento
                      , pegue
                      , (++)
                      , zip
                      )

comprimento  :: [ a ] ​​->  Int
comprimento  []        =  0
comprimento (_ : xs) =  1  +  comprimento xs

incAll  :: [ Int ] -> [ Int ]
incTodos xs = [x +  1  | x <- xs]

sumEvens  :: [ Int ] ->  Int
somaEvens xs =  soma [x | x <- xs, mesmo x]

head  :: [[ a ]] -> [ a ]
cabeças xss = [x | (x : _) <- xss]

primos  ::  Int  -> [ Int ]
primos n = [x | x <- [ 2  .. n], é Primo x]
    Onde
      isPrime x = ( comprimento (fatores x)) ==  2
      fatores x = [ y | y <- [ 1  .. x]
                      , x `mod` y ==  0 ]

qsort  :: [ Int ] -> [ Int ]
qsort []        =  []
qsort (pivot : xs) = menor ++ [pivot] ++ maior
     Onde
       menor = qsort[y | y <- xs, y <= pivô]
       maior = qsort[y | y <- xs, y > pivô]

soma  ::  Num  a  => [ a ] ​​->  a
soma  []        =  0
soma (x : xs) = x +  soma xs

elem  ::  Eq  a  =>  a  -> [ a ] ​​->  Bool
elem _ []        =  Falso
elem x (y : ys) = x == y ||  elem x ys

(++)  :: [ a ] ​​-> [ a ] ​​-> [ a ]
[]        ++ sim = sim
(x : xs) ++ ys = x : (xs ++ ys)

pegue  ::  Int  -> [ a ] ​​-> [ a ]
tomar  0 _         =  []
pegue _ []        =  []
tome n (x : xs) = x :  tome (n -  1 ) xs

sorted  ::  Ord  a  => [ a ] ​​->  Bool
ordenado []            =  Verdadeiro
ordenado [_]           =  Verdadeiro
ordenado (x : y : ys)
     | x <= y        = ordenado (y : ys)
     |  caso contrário     =  falso

zip  :: [ a ] ​​-> [ b ] -> [( a , b )]
zip  []        _         =  []
zip_ [         ]        =  []
zip (x : xs) (y : ys) = (x,y) :  zip xs ys

inverter  :: [ a ] ​​-> [ a ]
reverso  []        =  []
reverso (x : xs) =  reverso xs ++ [x]

rev  :: [ a ] ​​-> [ a ]
rev xs = revAcc xs []
  Onde
   revAcc []        ac = ac
   revAcc (y : ys) ac = revAcc ys (y : ac)