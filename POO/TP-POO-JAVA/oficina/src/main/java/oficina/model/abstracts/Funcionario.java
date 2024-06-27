/*
 * Classe Abstrata Funcionario
 * Abstrai funcionario do sistema.
*/
package oficina.model.abstracts;

import oficina.model.interfaces.iFuncionario;
import oficina.model.finals.Usuario;
import oficina.model.finals.Data;

public abstract class Funcionario extends Pessoa implements iFuncionario
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * usuario
         * Armazena o usuario do funcionario.
        */
        private Usuario usuario;
        
        /*
         * salario
         * Armazena o salario do funcionario.
        */
        private double salario;
        
        /*
         * regime
         * Armazena o regime de trabalho do funcionario.
        */
        private int regime;
        
    /*
     * Metodos
     * Rotinas da classse.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Funcionario(String nome, String endereco, String telefone, String cpf, Data dataNascimento, Usuario usuario, double salario, int regime)
        {
            super(nome, endereco, telefone, cpf, dataNascimento);
            this.usuario = usuario;
            this.salario = salario;
            this.regime = regime;
        }
        
        
        /*
         * Metodos especiais
         * Getters e Setters.
        */
            /*
             * Getters
             * Metodos acessores de atributos.
            */
            @Override
            public Usuario getUsuario()
            {
                return usuario;
            }
            @Override
            public double getSalario()
            {
                return salario;
            }
            @Override
            public int getRegime()
            {
                return regime;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setUsuario(Usuario usuario)
            {
                this.usuario = usuario;
            }
            @Override
            public void setSalario(double salario)
            {
                this.salario = salario;
            }
            @Override
            public void setRegime(int regime)
            {
                this.regime = regime;
            }

}
