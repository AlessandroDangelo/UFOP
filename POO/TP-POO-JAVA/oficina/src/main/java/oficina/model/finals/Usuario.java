/*
 * Classe final Usuario
 * Abstrai usuarios do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iUsuario;

public class Usuario implements iUsuario
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * email
         * Armazena o email do usuario.
        */
        private String email;
        
        /*
         * senha
         * Armazena a senha do usuario.
        */
        private String senha;
        
        /*
         * tipo
         * Armazena o tipo do usuario.
        */
        private int tipo;
    
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara uma instancia da classe.
        */
        public Usuario(String email, String senha, int tipo)
        {
            this.email = email;
            this.senha = senha;
            this.tipo = tipo;
        }
        
        /*
         * Metodos Especiais
         * Getters e Setters.
        */
            /*
             * Getters
             * Metodos acessores de atributos.
            */
            @Override
            public String getEmail()
            {
                return email;
            }
            @Override
            public String getSenha()
            {
                return senha;
            }
            @Override
            public int getTipo()
            {
                return tipo;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setEmail(String email)
            {
                this.email = email;
            }
            @Override
            public void setSenha(String senha)
            {
                this.senha = senha;
            }
            @Override
            public void setTipo(int tipo)
            {
                this.tipo = tipo;
            }
}
