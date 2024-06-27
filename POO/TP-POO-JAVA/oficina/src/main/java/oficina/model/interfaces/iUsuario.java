/*
 * Inteface iUsuario
 * Abstrai a interação com usuarios do sistema.
*/
package oficina.model.interfaces;

public interface iUsuario
{
    /*
     * Metodos Especiais.
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public String getEmail();
        public String getSenha();
        public int getTipo();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setEmail(String email);
        public void setSenha(String senha);
        public void setTipo(int tipo);
}
