/*
 * Interface iCliente
 * Abstrai a interação com clientes do sistema.
*/
package oficina.model.interfaces;

import oficina.model.finals.Veiculo;
import java.util.ArrayList;

public interface iCliente
{   
    /*
     * Busca
     * Metodos que buscam por elementos.
    */
    public Veiculo buscaVeiculoPlaca(String Placa);
    
    /*
     * Insersao
     * Metodos que inserem elementos;
    */
    public int inseririVeiculo(Veiculo v);
    
    /*
     * Remocao
     * Metodos que removem elementos
    */
    public boolean removerVeiculo(String placa);
    
    /*
     * Metodos Especiais
     * Getters e Setters
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public ArrayList<Veiculo> getListVeiculos();
        public Veiculo getVeiculo();
        
        
        /*
         * Setters
         * Metodos modificadores de atributos
        */
        public void setListVeiculos(ArrayList<Veiculo> listVeiculos);
        public void setVeiculo(Veiculo veiculo);
        
}
