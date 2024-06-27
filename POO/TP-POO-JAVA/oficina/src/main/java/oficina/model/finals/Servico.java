/*
 * Classe final Servico
 * Abstrai servicos do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iServico;
import oficina.model.abstracts.ItemVenda;

public class Servico extends ItemVenda implements iServico
{
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Servico(String nome, double preco, double quantidade)
        {
            super(nome, preco, quantidade);
        }
}
