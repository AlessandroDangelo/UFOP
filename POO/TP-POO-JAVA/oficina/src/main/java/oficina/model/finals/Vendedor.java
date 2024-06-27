/*
 * Classe final Vendedor
 * Abstrai vendedor do sistema.
*/
package oficina.model.finals;

import oficina.model.abstracts.Funcionario;

public class Vendedor extends Funcionario
{
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Vendedor(String nome, String endereco, String telefone, String cpf, Data dataNascimento, Usuario usuario, double salario, int regime)
        {
            super(nome, endereco, telefone, cpf, dataNascimento, usuario, salario, regime);
        }
        
}