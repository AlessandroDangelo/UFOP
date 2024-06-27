/*
 * Classe final Produto
 * Abstrai produto do sistema.
*/
package oficina.model.finals;

import oficina.model.abstracts.ItemVenda;
import oficina.model.interfaces.iProduto;

public class Produto extends ItemVenda implements iProduto
{
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Produto(String nome, double preco, double quantidade)
        {
            super(nome, preco, quantidade);
        }
}
