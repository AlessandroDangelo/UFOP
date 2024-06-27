/*
 * Interface iOrdemServico
 * Abstrai a interação com ordens de serviços.
*/
package oficina.model.interfaces;

import oficina.model.finals.Cliente;
import oficina.model.finals.Vendedor;
import oficina.model.finals.Mecanico;
import oficina.model.finals.Produto;
import oficina.model.finals.Servico;
import oficina.model.finals.Veiculo;

import java.util.*;

public interface iOrdemServico
{   
    /*
     * Metodos adicionais
     * Recursos adicionais a classe.
    */
        /*
         * calculaPreco()
         * Calcula o preco da ordem com base nos produtos e servicos cadastrados.
        */
        public void calculaPreco();
    
    /*
     * Metodos especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos
        */
        public int getId();
        public int getStatus();
        public double getPreco();
        public Veiculo getVeiculo();
        public Cliente getCliente();
        public Vendedor getVendedor();
        public Mecanico getMecanico();
        public ArrayList<Produto> getListProdutos();
        public ArrayList<Servico> getListServicos();
        public int getPosProduto();
        public int getPosServico();
        public boolean getCicloProduto();
        public boolean getCicloServico();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setId(int id);
        public void setStatus(int status);
        public void setPreco(double preco);
        public void setVeiculo(Veiculo veiculo);
        public void setCliente(Cliente cliente);
        public void setVendedor(Vendedor vendedor);
        public void setMecanico(Mecanico mecanico);
        public void setListProdutos(ArrayList<Produto> listProdutos);
        public void setListServicos(ArrayList<Servico> listServicos);
        public void setPosProduto(int pos);
        public void setPosServico(int pos);
        public void setCicloProduto(boolean cicloProduto);
        public void setCicloServico(boolean cicloServico);
}
