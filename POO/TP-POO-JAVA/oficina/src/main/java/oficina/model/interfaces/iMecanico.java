/*
 * Interface iMecanico
 * Abstrai a interação com mecanico.
*/
package oficina.model.interfaces;

import java.util.*;
import oficina.model.finals.OrdemServico;

public interface iMecanico
{
    /*
     * Metodos especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public ArrayList<OrdemServico> getListOrdemServico();
        public int getPosListOrdemServico();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setlistOrdemServico(ArrayList<OrdemServico> listOrdemServico);
        public void setPosListOrdemServico(int pos);
}
