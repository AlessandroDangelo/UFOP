/*
 * Classe abstrata Pessoa
 * Abstrai o conceito de Pessoa.
*/
package oficina.model.abstracts;

import oficina.model.interfaces.iPessoa;
import oficina.model.finals.Data;

public abstract class Pessoa implements iPessoa
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * nome
         * Armazena o nome da pessoa.
        */
        private String nome;
        
        /*
         * endereco
         * Armazena o endereco da pessoa.
        */
        private String endereco;
        
        /*
         * telefone
         * Armazena o telefone da pessoa.
        */
        private String telefone;
        
        /*
         * cpf
         * Armazena o cpf da pessoa.
        */
        private String cpf;
        
        /*
         * dataNascimento
         * Armazena a data de nascimento da Pessoa.
        */
        private Data dataNascimento;
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Pessoa(String nome, String endereco, String telefone, String cpf, Data dataNascimento)
        {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
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
            public String getNome() {
                return nome;
            }
            @Override
            public String getEndereco() {
                return endereco;
            }
            @Override
            public String getTelefone() {
                return telefone;
            }
            @Override
            public String getCpf() {
                return cpf;
            }
            @Override
            public Data getDataNascimento()
            {
                return dataNascimento;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setNome(String nome) {
                this.nome = nome;
            }
            @Override
            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }
            @Override
            public void setTelefone(String telefone) {
                this.telefone = telefone;
            }
            @Override
            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
            @Override
            public void setDataNascimento(Data dataNascimento)
            {
                this.dataNascimento = dataNascimento;
            }
                       
}
