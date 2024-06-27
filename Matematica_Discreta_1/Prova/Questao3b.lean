-- questão 3 b.

variable U : Type.         -- universo de discurso
variable a : U.            -- garante que o universo é não vazio.


-- predicados

variables P Q : U → Prop.

-- substitua o comando sorry pelo texto
-- de sua demonstração.

lemma ex3b (H : ¬ (∃ x, P x ∧ Q x)) :  ∀ x, P x → ¬Q x := 
  assume x, 
  show P x → ¬Q x, 
    from 
      assume H1: P x, 
        show ¬Q x, from 
          assume H2 : Q x,
            show false,
              from (H)
                   (exists.intro x $
                      and.intro(H1)(H2)).
