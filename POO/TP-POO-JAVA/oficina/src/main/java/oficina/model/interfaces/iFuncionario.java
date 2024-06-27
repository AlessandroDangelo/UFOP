/*
 * Interface iFuncionario
 * Abstrai a interação com funcionarios do sistema.
*/
package oficina.model.interfaces;

import oficina.model.finals.Usuario;

public interface iFuncionario
{
    /*
     * Metodos especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public Usuario getUsuario();
        public double getSalario();
        public int getRegime();
    
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setUsuario(Usuario usuario);
        public void setSalario(double salario);
        public void setRegime(int regime);
        
}
