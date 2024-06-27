/*
 * Interface iPessoa
 * Abstrai a interação com pessoas.
*/
package oficina.model.interfaces;

import oficina.model.finals.Data;

public interface iPessoa
{
    /*
     * Metodos Especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public String getNome();
        public String getEndereco();
        public String getTelefone();
        public String getCpf();
        public Data getDataNascimento();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setNome(String nome);
        public void setEndereco(String endereco);
        public void setTelefone(String telefone);
        public void setCpf(String cpf);
        public void setDataNascimento(Data dataNascimento);
}
