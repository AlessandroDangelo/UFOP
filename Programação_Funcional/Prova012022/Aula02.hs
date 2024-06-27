módulo  Aula02  onde
importar  Prelude  ocultando ( replicar
                      , nulo
                      )

média vs =  soma vs comprimento `div`  ns

add1  ::  Int  ->  Int
adicionar 1 x = x +  1

mediana  ::  Flutuante  ->  Flutuante  ->  Flutuante
mediana xy = (x + y) /  2

sum3  ::  Int  ->  Int  ->  Int  ->  Int
soma3 xyz = x + y + z

dist  :: ( Float , Float ) -> ( Float , Float ) ->  Float
dist (x1,y1) (x2,y2)
   =  sqrt ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

abs1  ::  Int  ->  Int
abs1 n =  se n <  0  então ( -  1 ) * n mais n

sinal1  ::  Int  ->  Int
sinal1 n =  se n <  0  então  - 1
            senão  se n ==  0  então  0
                 mais  1

abs2  ::  Int  ->  Int
abs2 n
  | n <  0  = n * ( -  1 )
  |  caso contrário  = n

sinal2  ::  Int  ->  Int
sinal2 n
  | n <  0  =  - 1
  | n ==  0  =  0
  |  caso contrário  =  1

dist1  :: ( Float , Float ) -> ( Float , Float ) ->  Float
dist1 (x1,y1) (x2,y2)
    =  deixe
        dx   = x1 - x2
        dx2 = dx * dx
        dy   = y1 - y2
        dy2 = dy * dy
      em  sqrt ( dx2 + dy2)

dist2  :: ( Float , Float ) -> ( Float , Float ) ->  Float
dist2 (x1,y1) (x2,y2)
  =  sqrt ( dx2 + dy2)
    Onde
     dx   = x1 - x2
     dx2 = dx * dx
     dy   = y1 - y2
     dy2 = dy * dy

-- Constante de Euler
e  ::  Flutuar
e =  2,718

{-
Definindo uma lista vazia
-}
vazio  :: [ a ]
vazio =  []

fac  ::  Int  ->  Int
fac 0  =  1
fac n = n * fac (n -  1 )

replicar  ::  Int  ->  a  -> [ a ]
replicar  0 _ =  []
replicar nx = x :  replicar (n -  1 ) x

conj  ::  Bool  ->  Bool  ->  Bool
conj Falso  Falso  =  Falso
conj Falso  Verdadeiro   =  Falso
conj Verdadeiro   Falso  =  Falso 
conj Verdadeiro   Verdadeiro  =  Verdadeiro

conj1  ::  Bool  ->  Bool  ->  Bool
conj1 Verdadeiro   v = v
conj1 Falso _ =  Falso

null  :: [ a ] ​​->  Bool
null  []       =  Verdadeiro
null (_ : _) =  Falso

trim  ::  String  ->  String
trim ( '  '   : s) = trim s
trim ( ' \t '  : s) = trim s
corte s = s

ambosZero  :: ( Int , Int ) ->  Bool
ambosZero ( 0 , 0 ) =  Verdadeiro
ambosZero _      =  Falso

sumIfThree  :: [ Int ] ->  Int
sumIfThree (a : b : c :  [] ) = a + b + c
somaSeTrês _                 =  0

tamanho  :: [ a ] ​​->  Int
tamanho []        =  0
tamanho (_ : xs) =  1  + tamanho xs