import data.set
import tactic

open set

-- universo de discurso
variable {U : Type}

-- garantindo que o universo é não vazio
variable x : U

-- definindo dois conjuntos.
variables A B : set U

-- definindo uma família 

variable F : set (set U)

-- definindo a união de famílias

def Union (G : set (set U)) : set U :=
    {x | ∃ X, X ∈ G ∧ x ∈ X}

-- exercício 1.

theorem ex1 : A ∈ F → A ⊆ Union F := sorry

-- exercício 2.

theorem ex2 : A = Union (𝒫(A)) :=

    ext (assume x,
         iff.intro 
                (assume (H1: x ∈ A),
                 have H2: x ∈ Union 𝒫(A),
                     
                     show x ∈ Union 𝒫(A), from H2,
                 have H3: x ∈ A,
                     show x ∈ A, from H3 
                 )
                ()).

-- exercicío 3.

theorem ex3
  : (A ∪ B) ∩ A = A := sorry

-- exercício 4.

theorem ex4
  : 𝒫(A) ∪ 𝒫(B) ⊆ 𝒫(A ∪ B) := sorry