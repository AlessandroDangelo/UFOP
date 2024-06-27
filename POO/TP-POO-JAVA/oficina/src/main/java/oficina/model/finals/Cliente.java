/*
 * Classe final Cliente
 * Abstrai cliente do sistema.
*/
package oficina.model.finals;

import oficina.model.abstracts.Pessoa;
import oficina.model.interfaces.iCliente;
import java.util.ArrayList;

public class Cliente extends Pessoa implements iCliente
{   
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * listVeiculos
         * Armazena a lista de veiculos do cliente.
        */
        private ArrayList<Veiculo> listVeiculos;
        
        /*
         * veiculo
         * Armazena veiculo em uso pelo cliente
        */
        private Veiculo veiculo;
        
    
    /*
     * Metodos
     * Rotinas da classe.
    */  
        /*
         * Construtor
         * Prepara instancia da classe.
        */
        public Cliente(String nome, String endereco, String telefone, String cpf, Data dataNascimento)
        {
            super(nome, endereco, telefone, cpf, dataNascimento);
            this.listVeiculos = new ArrayList<>();
        }
        
        /*
         * Busca
         * Procuram por elementos da classe.
        */
        @Override
        public Veiculo buscaVeiculoPlaca(String placa)
        {
            for(int i = 0; i< this.getListVeiculos().size(); i++){
                if( this.getListVeiculos().get(i).getPlaca().compareTo(placa) == 0 )
                    return this.getListVeiculos().get(i);
            }
            return null;
        }
        
        /*
         * Insersao
         * Inserem elementos na classe.
        */
        @Override
        public int inseririVeiculo(Veiculo v)
        {
            // o veiculo existe?
            if( this.buscaVeiculoPlaca( v.getPlaca() ) != null )
                return 0;
            
           
            // insere o novo veiculo
            if( this.getListVeiculos().add(v) ){
                
                // veiculo inserido com sucesso
                return 1;
                
            } else {
                
                // falha ao inserir veiculo
                return 2;
            }
        }
        
        /*
         * Remocao
         * Removelem elementos da classe.
        */
        @Override
        public boolean removerVeiculo(String placa)
        {
            Veiculo veiculo = this.buscaVeiculoPlaca(placa);
            
            if( veiculo == null)
                return false;
            
            return this.getListVeiculos().remove( veiculo );
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
            public ArrayList<Veiculo> getListVeiculos()
            {
                return this.listVeiculos;
            }
            @Override
            public Veiculo getVeiculo()
            {
                return this.veiculo;
            }
        
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setListVeiculos(ArrayList<Veiculo> listVeiculos)
            {
                this.listVeiculos = listVeiculos;
            }
            @Override
            public void setVeiculo(Veiculo veiculo)
            {
                this.veiculo = veiculo;
            }
            

}
