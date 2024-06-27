Exercício
=========

- Defina uma instância de Applicative
para listas e árvores binárias.

\begin{code}
{-
============================================================================== 
==============================================================================
============================================================================== 
Essa resposta foi comentada pois ela já está implementada na biblioteca padrão
============================================================================== 
============================================================================== 
==============================================================================
instance Applicative [] where
  pure x = x:[]
  [] <*> _ = []
  _ <*> [] = []
  (x:xs) <*> y = (map x y)++(xs <*> y)
-}
instance Functor Tree where
  fmap _ Leaf         = Leaf
  fmap f (Node x l r) = Node (f x) (f <$> l) (f <$> r)
instance Applicative Tree where
  pure x                            = Node x Leaf Leaf
  Leaf <*> _                        = Leaf
  _ <*> Leaf                        = Leaf
  (Node x l1 r1) <*> (Node y l2 r2) = Node (x y) (l1 <*> l2) (r1 <*> r2)
\end{code}

Exercício
=========

- Qual o kind do tipo a seguir? Apresente uma instância de `Functor`
para esse tipo.

P: Qual o kind do tipo Toy?
R: * -> * -> *

\begin{code}
data Toy a b =
    Output a b
  | Bell b
  | Done
  deriving (Eq, Ord, Show)
instance Functor (Toy a) where
  fmap _ Done         = Done
  fmap f (Output x y) = Output x (f y)
  fmap f (Bell y)     = Bell (f y)
\end{code}