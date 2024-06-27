Set Implicit Arguments.

From Coq Require Import Arith.Compare_dec.
From Coq Require Import Arith.Arith_base.
From Coq Require Import Bool.
From Coq Require Import Lia.
From Coq Require Import List.
 
Import ListNotations.
Import Nat.

(** Questão 1.
  
  Prove a seguinte propriedade envolvendo booleanos.

  Sua demonstração deve envolver apenas os comandos:
     - intros.
     - destruct.
     - reflexivity.
*)

Theorem exercise1
  : forall (b1 b2 : bool), negb (b1 && b2) = negb b1 || negb b2.
Proof.
  intros A B.
  destruct A.
  destruct B.
  reflexivity.
  reflexivity.
  reflexivity.

Qed.

Print exercise1.

(** Questão 2.

A função a seguir conta o número de ocorrências
de um valor em uma lista fornecida como entrada.

*)

Fixpoint num_occ (x : nat)(xs : list nat) : nat :=
  match xs with
  | [] => 0
  | (y :: ys) => if eq_dec x y
               then 1 + num_occ x ys
               else num_occ x ys
  end.

(**
   Prove o seguinte resultado que relaciona a
   função e o número de elementos de uma lista:
*)
 
Theorem exercise2
  : forall x xs, num_occ x xs <= length xs.
Proof.
   intros x xs. induction xs; simpl.
    - reflexivity.
    - destruct (eq_dec x a).
      + lia.
      + lia.

Qed.

Print exercise2.

(** Na solução do exercício 2, você deve:
    - Utilizar o comando destruct para dividir
      a demonstração nos dois casos envolvendo
      a condição da expressão if.
    - Desigualdades podem ser demonstradas utilizando
      o comando lia.
*)

(** Questão 3
A função a seguir produz uma lista contendo
_n_ cópias de um valor x fornecido como argumento:
 *)

Fixpoint n_copies (n x : nat) : list nat :=
  match n with
  | 0 => []
  | S n' => x :: n_copies n' x
  end.

(** Prove o seguinte resultado: *)

Theorem exercise3
  : forall x n, num_occ x (n_copies n x) = n.
Proof.
  intros x n.
  induction n.
   - simpl. reflexivity.
   - simpl. destruct eq_dec.
      + simpl. rewrite IHn. reflexivity.
      + simpl. rewrite IHn. congruence.
Qed.

(** Na solução deste exercício, você poderá
    encontrar uma desigualdade que é obviamente
    uma contradição. Nesta situação, você poderá
    utilizar o comando _congruence_ para concluir
    a demonstração.
 *)

Print exercise3.

(** Questão 4.

Prove o seguinte resultado que relaciona a função
n_copies e o tamanho da lista produzida:
*)

Theorem exercise4
  : forall x n, length (n_copies n x) = n.
Proof.
  intros x n. 
  induction n.
    - simpl. reflexivity.
    - simpl. rewrite IHn. reflexivity.

Qed.

Print exercise4.