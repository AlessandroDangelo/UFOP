/*
 * Classe final Mecanico
 * Abstrai mecanico do sistema.
*/
package oficina.model.finals;

import java.util.*;
import oficina.model.abstracts.Funcionario;
import oficina.model.interfaces.iMecanico;

public class Mecanico extends Funcionario implements iMecanico
{   
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * listOrdemServico
         * Armazena a lista de orndes de servico com que o mecanico esta trabalhando.
        */
        ArrayList<OrdemServico> listOrdemServico;
        int posListOrdemServico;
    
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public Mecanico(String nome, String endereco, String telefone, String cpf, Data dataNascimento, Usuario usuario, double salario, int regime)
        {
            super(nome, endereco, telefone, cpf, dataNascimento, usuario, salario, regime);
            this.listOrdemServico = new ArrayList<>();
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
            public ArrayList<OrdemServico> getListOrdemServico()
            {
                return this.listOrdemServico;
            }
            @Override
            public int getPosListOrdemServico()
            {
                return this.posListOrdemServico;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setlistOrdemServico(ArrayList<OrdemServico> listOrdemServico)
            {
                this.listOrdemServico = listOrdemServico;
            }
            @Override
            public void setPosListOrdemServico(int pos)
            {
                this.posListOrdemServico = pos;
            }
}
