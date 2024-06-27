/*
 * Interface iData
 * Abstrai a interação com datas do sistema.
*/
package oficina.model.interfaces;

public interface iData
{
    /*
     * Metodos especiais
     * Getters e Setters
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public int getDia();
        public int getMes();
        public int getAno();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setDia(int dia);
        public void setMes(int mes);
        public void setAno(int ano);
}
