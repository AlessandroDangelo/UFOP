variables A B : Prop.

-- substitua o comando sorry pelo texto
-- de sua demonstração.

lemma ex3a (H : ¬ (A ∨ B)) : ¬ A ∧ ¬ B :=
  and.intro (assume H1: A,
            show false, from (H)(or.intro_left B (show A, from (H1))))
                        
            (assume H2: B, 
            show false, from (H)(or.intro_right A (show B, from (H2)))).