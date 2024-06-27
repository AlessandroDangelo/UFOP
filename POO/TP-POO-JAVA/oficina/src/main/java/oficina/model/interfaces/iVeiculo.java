/*
 * Interface iVeiculo
 * Abstrai a interação com veiculos do sistema.
*/
package oficina.model.interfaces;
public interface iVeiculo
{
    /*
     * Metodos especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public String getPlaca();
        public String getMarca();
        public String getModelo();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setPlaca(String placa);
        public void setMarca(String marca);
        public void setModelo(String modelo);
}
