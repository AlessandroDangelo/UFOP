módulo  Aula06  onde

importar  Prelude  ocultando ( foldr
                      , dobrar
                      , soma
                      , concatenar
                      , e
                      , comprimento
                      , mapa
                      , reverter
                      , filtro
                      , (++)
                      )

foldr  :: ( a  ->  b  ->  b ) ->  b  -> [ a ] ​​->  b
pasta _ v []        = v
pastar fv (x : xs) = x `f`  pastar fv xs

soma  =  pasta  (+)  0

concat  =  pasta  (++)  []

e  =  foldr  (&&)  Verdadeiro

comprimento  :: [ a ] ​​->  Int
comprimento  =  dobra passo 0
   Onde
     passo _ ac =  1  + ac

mapa  :: ( a  ->  b ) -> [ a ] ​​-> [ b ]
mapa f =  passo de dobra []
   Onde
     passo x ac = fx : ac

foldl  :: ( b  ->  a  ->  b ) ->  b  -> [ a ] ​​->  b
foldl _ v []        = v
foldl fv (x : xs) =  foldl f (fvx) xs

reverso  =  passo de dobra []
   Onde
     passo ac x = x : ac

filter  :: ( a  ->  Bool ) -> [ a ] ​​-> [ a ]
filtro p =  passo de dobra []
   Onde
     passo x ac =  se px então x : ac else a
     