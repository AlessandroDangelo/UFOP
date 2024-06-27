/*
 * Classe Abstrata Item de Venda
 * Abstrai um item de venda do sistema.
*/
package oficina.model.abstracts;

import oficina.model.interfaces.iItemVenda;

public abstract class ItemVenda implements iItemVenda
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * nome
         * Armazena o nome do item de venda.
        */
        private String nome;
        
        /*
         * preco
         * Armzena o preco do item de venda.
        */
        private double preco;
        
        /*
         * quantidade
         * Armazena a quantidade do item de venda.
        */
        private double quantidade;
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public ItemVenda(String nome, double preco, double quantidade)
        {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
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
            public String getNome()
            {
                return this.nome;
            }
            @Override
            public double getPreco()
            {
                return this.preco;
            }
            @Override
            public double getQuantidade()
            {
                return this.quantidade;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setNome(String nome)
            {
                this.nome = nome;
            }
            @Override
            public void setPreco(double preco)
            {
                this.preco = preco;
            }
            @Override
            public void setQuantidade(double quantidade)
            {
                this.quantidade = quantidade;
            }
}
