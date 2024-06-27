/*
 * Classe final Data
 * Abstrai data do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iData;

public class Data implements iData
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * dia
         * Armazena o dia da data.
        */
        private int dia;
        
        /*
         * mes
         * Armazena o mes da data.
        */
        private int mes;
        
        /*
         * ano
         * Armazena o ano da data.
        */
        private int ano;
        
    /*
     * Metodos
     * Rotinas da classe.
    */  
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Data(int dia, int mes, int ano)
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
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
            public int getDia()
            {
                return dia;
            }
            @Override
            public int getMes()
            {
                return mes;
            }
            @Override
            public int getAno()
            {
                return ano;
            }
        
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setDia(int dia)
            {
                this.dia = dia;
            }
            @Override
            public void setMes(int mes)
            {
                this.mes = mes;
            }
            @Override
            public void setAno(int ano)
            {
                this.ano = ano;
            }
}