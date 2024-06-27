variables P Q S T R : Prop. 

lemma exA (H1 : (P ∧ Q) ∧ R)
          (H2 : S ∧ T) : Q ∧ S :=
  and.intro -- Q ∧ S
    (and.elim_right --Q
        (and.elim_left H1))              
    (and.elim_left H2). -- S


                
lemma exC (H1 : P)
          (H2 : P →(P → Q)) : Q :=
    show Q,
    from (H2 H1 (show P,
                from (H1))).


lemma exD : (P ∧ Q) → P :=
      assume H : P ∧ Q,
      (and.elim_left H).



lemma exE (H : P) : Q → P ∧ Q :=
      assume H1 : Q,
      and.intro
      H -- P
      H1. -- Q
      