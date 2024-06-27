/*
 * Classe final Administrador
 * Abstrai administrador do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iAdministrador;
import oficina.model.abstracts.Funcionario;

public class Administrador extends Funcionario implements iAdministrador
{
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Administrador(String nome, String endereco, String telefone, String cpf, Data dataNascimento, Usuario usuario, double salario, int regime)
        {
            super(nome, endereco, telefone, cpf, dataNascimento, usuario, salario, regime);
        }
}
