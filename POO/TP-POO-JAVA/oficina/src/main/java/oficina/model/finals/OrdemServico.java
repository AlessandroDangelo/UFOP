/*
 * Classe Final OrdemServico
 * Abstrai as ordem de servico dos sistema.
*/
package oficina.model.finals;

import java.util.*;

import oficina.model.interfaces.iOrdemServico;

public class OrdemServico implements iOrdemServico
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */  
        /*
         * id
         * Identificador chave primaria da OrdemServico.
        */
        private int id;
    
        /*
         * status
         * Verifica se a ordem esta aberta = 0, fechada = 1, pendente = 2, aprovada = 3.
        */
        private int status;
        
        /*
         * preco
         * Armazena o preco da ordem de servico
        */
        private double preco;
        
        /*
         * veiculo
         * Armazena a referencia ao veiculo da ordem de servico.
        */
        private Veiculo veiculo;
        
        /*
         * cliente
         * Armazena a referencia ao cliente da ordem de servico.
        */
        private Cliente cliente;
        
        /*
         * vendedor
         * Armazena a referencia ao vendedor que vendeu a ordem de servico.
        */
        private Vendedor vendedor;
        
        /*
         * mecanico
         * Armazena a referencia o mecanico da ordem de servico
        */
        private Mecanico mecanico;
        
        /*
         * listProdutos
         * Ammazena a lista de produtos envolvidos na ordem.
        */
        private ArrayList<Produto> listProdutos;
        int posProduto;
        boolean cicloProduto;
        
        /*
         * listServicos
         * Armazena a lista de servicos evolvidos na ordem.
        */
        private ArrayList<Servico> listServicos;
        int posServico;
        boolean cicloServico;
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public OrdemServico(int id, Veiculo veiculo, Cliente cliente, Vendedor vendedor)
        {   
            this.id = id; // numero da ordem
            this.status = 0; // ordem aberta
            this.preco = 0; // nenhum produto ou servico cadastrado
            this.veiculo = veiculo;
            this.cliente = cliente;
            this.vendedor = vendedor;
            this.mecanico = null;
            this.listProdutos = new ArrayList<>();
            this.listServicos = new ArrayList<>();
            this.posProduto = 0;
            this.posServico = 0;
            this.cicloProduto = false;
            this.cicloServico = false;
        }
        
        /*
         * Metodos adicionais
         * Recursos adicionais a classe.
        */
            /*
             * calculaPreco()
             * Calcula o preco da ordem com base nos produtos e servicos inseridos.
            */
            @Override
            public void calculaPreco()
            {   
                // variaveis auxiliares
                double preco = 0;
                
                // percorre a lista de produtos
                for(int i = 0; i< this.getListProdutos().size(); i++){
                   preco += 
                        this.getListProdutos().get(i).getPreco() * this.getListProdutos().get(i).getQuantidade();
                }
                
                // precorre a lista de servicos
                for(int i = 0; i < this.getListServicos().size(); i++ ){
                    preco += 
                        this.getListServicos().get(i).getPreco() * this.getListServicos().get(i).getQuantidade();
                }
                
                // atualiza o novo preco
                this.setPreco(preco);
            }
        
        /*
         * Metodos especiais
         * Getteres e Setters.
        */
            /*
             * Getters
             * Metodos acessores de atributos.
            */
            @Override
            public int getId()
            {
                return this.id;
            }
            @Override
            public int getStatus()
            {
                return this.status;
            }
            @Override
            public double getPreco()
            {
                return this.preco;
            }
            @Override
            public Veiculo getVeiculo()
            {
                return this.veiculo;
            }
            @Override
            public Cliente getCliente()
            {
                return this.cliente;
            }
            @Override
            public Vendedor getVendedor()
            {
                return this.vendedor;
            }
            @Override
            public Mecanico getMecanico()
            {
                return this.mecanico;
            }
            @Override
            public ArrayList<Produto> getListProdutos()
            {
                return this.listProdutos;
            }
            @Override
            public ArrayList<Servico> getListServicos()
            {
                return this.listServicos;
            }
            @Override
            public int getPosProduto()
            {
                return this.posProduto;
            }
            @Override
            public int getPosServico()
            {
                return this.posServico;
            }
            @Override
            public boolean getCicloProduto()
            {
                return this.cicloProduto;
            }
            @Override
            public boolean getCicloServico()
            {
                return this.cicloServico;
            }
        
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setId(int id)
            {
                this.id = id;
            }
            @Override
            public void setStatus(int status)
            {
                this.status = status;
            }
            @Override
            public void setPreco(double preco)
            {
                this.preco = preco;
            }
            @Override
            public void setVeiculo(Veiculo veiculo)
            {
                this.veiculo = veiculo;
            }
            @Override
            public void setCliente(Cliente cliente)
            {
                this.cliente = cliente;
            }
            @Override
            public void setVendedor(Vendedor vendedor)
            {
                this.vendedor = vendedor;
            }
            @Override
            public void setMecanico(Mecanico mecanico)
            {
                this.mecanico = mecanico;
            }
            @Override
            public void setListProdutos(ArrayList<Produto> listProdutos)
            {
                this.listProdutos = listProdutos;
            }
            @Override
            public void setListServicos(ArrayList<Servico> listServicos)
            {
                this.listServicos = listServicos;
            }
            @Override
            public void setPosProduto(int pos)
            {
                this.posProduto = pos;
            }
            @Override
            public void setPosServico(int pos)
            {
                this.posServico = pos;
            }
            @Override
            public void setCicloProduto(boolean cicloProduto)
            {
                this.cicloProduto = cicloProduto;
            }
            @Override
            public void setCicloServico(boolean cicloServico)
            {
                this.cicloServico = cicloServico;
            }
}
