/*
 * Classe final Veiculo
 * Abstrai veiculo do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iVeiculo;

public class Veiculo implements iVeiculo
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * placa
         * Armazena a placa do veiculo.
        */
        private String placa;
        
        /*
         * marca
         * Armazena a marca do veiculo.
        */
        private String marca;
        
        /*
         * modelo
         * Armazena o modelo do veiculo.
        */
        private String modelo;
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Veiculo(String placa, String marca, String modelo)
        {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
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
            public String getPlaca()
            {
                return placa;
            }
            @Override
            public String getMarca()
            {
                return marca;
            }
            @Override
            public String getModelo()
            {
                return modelo;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setPlaca(String placa)
            {
                this.placa = placa;
            }
            @Override
            public void setMarca(String marca)
            {
                this.marca = marca;
            }
            @Override
            public void setModelo(String modelo)
            {
                this.modelo = modelo;
            }
}
