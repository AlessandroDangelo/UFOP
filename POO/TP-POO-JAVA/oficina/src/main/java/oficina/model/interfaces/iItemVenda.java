/*
 * Interface iItemVenda
 * Abstrai a interação com itens de venda.
*/
package oficina.model.interfaces;
public interface iItemVenda
{
   /*
    * Metodos especiais
    * Getters e Setters.
   */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public String getNome();
        public double getPreco();
        public double getQuantidade();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setNome(String nome);
        public void setPreco(double preco);
        public void setQuantidade(double quantidade);
}
