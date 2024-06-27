módulo  Aula05  onde

importar  Prelude  ocultando ( mapa
                      , filtro
                      , dobra
                      , dobrar
                      )

mapa  :: ( a  ->  b ) -> [ a ] ​​-> [ b ]
mapa _ []        =  []
map f (x : xs) = fx :  map f xs

doubleList  :: [ Int ] -> [ Int ]
doubleList xs =  mapear double xs
     Onde
       duplo x =  2  * x

notList  :: [ Bool ] -> [ Bool ]
notList xs =  map  não xs

filter  :: ( a  ->  Bool ) -> [ a ] ​​-> [ a ]
filtro _ []  =  []
filtro p (x : xs)
  | px = x :  filtro p xs
  |  caso contrário  =  filtro p xs

diminui  ::  String  ->  String
diminui xs =  filtro éBaixo xs

pares  :: [ Int ] -> [ Int ]
par xs =  filtrar  par xs