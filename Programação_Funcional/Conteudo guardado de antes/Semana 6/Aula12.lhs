Exercícios
==========

- Implemente uma instância de Eq para o tipo `Vec3`.

\begin{code}
instance Eq Vec3 where
   (Vec3 a b c) == (Vec3 a' b' c') = a == a' && b == b' && c == c'
   (Vec3 a b c) /= (Vec3 a' b' c') = not ((Vec3 a b c) == (Vec3 a' b' c'))
\end{code}

- Implemente uma instância de Eq para o tipo `Person` que
considere duas pessoas iguais se essas possuírem o mesmo nome.

\begin{code}
data Person
  = Person {
      name :: String
    , age  :: Int
    }
instance Eq Person where
   x == x' = name(x) == name(x')
   x /= x' = not(x == x')
\end{code}

Exercícios
==========

- Implemente uma instância de Show para
`Person` de forma que o resultado
da conversão para string de um valor
de tipo `Person` exiba apenas o
campo name deste registro.

\begin{code}
instance Show Person where
   show x = (name x)
\end{code}