/*
 * Interface iOficina
 * Abstrai a interação com oficinas
*/
package oficina.model.interfaces;

import java.util.*;
import oficina.model.finals.Administrador;
import oficina.model.finals.Vendedor;
import oficina.model.finals.Mecanico;
import oficina.model.finals.Cliente;
import oficina.model.finals.Usuario;
import oficina.model.finals.OrdemServico;

public interface iOficina
{   
    /*
     * Busca
     * Busca elementos a partir de chaves.
    */
    public Administrador buscaAdministradorCpf(String cpf);
    public Administrador buscaAdministradorEmail(String email);
    public Vendedor buscaVendedorCpf(String cpf);
    public Vendedor buscaVendedorEmail(String email);
    public Mecanico buscaMecanicoCpf(String cpf);
    public Mecanico buscaMecanicoEmail(String email);
    public Cliente buscaClienteCpf(String cpf);
    public OrdemServico buscaOrdemServicoId(int id);
    public ArrayList<OrdemServico> buscaOrdemServicoPendenteClienteCpf(String cpf);
    public ArrayList<OrdemServico> buscaOrdemServicoPendentes();
    
    /*
     * Insersao
     * Insire elementos novos.
    */
    public int inserirAdministrador(Administrador a);
    public int inserirVendedor(Vendedor v);
    public int inserirMecanico(Mecanico m);
    public int inserirCliente(Cliente c);
    public int inserirOrdemServico(OrdemServico o);
    
    /*
     * Remove elementos
     * Remove os elementos antigos.
    */
    public boolean removerAdministradorCpf(String cpf);
    public boolean removerVendedorCpf(String cpf);
    public boolean removerMecanicoCpf(String cpf);
    public boolean removerClienteCpf(String cpf);
    
    
    /*
     * Metodos Especiais
     * Getters e Setters.
    */
        /*
         * Getters
         * Metodos acessores de atributos.
        */
        public ArrayList<Administrador> getListAdministradores();
        public Administrador getAdministrador();
        public ArrayList<Vendedor> getListVendedores();
        public Vendedor getVendedor();
        public ArrayList<Mecanico> getListMecanicos();
        public Mecanico getMecanico();
        public ArrayList<Cliente> getListClientes();
        public Cliente getCliente();
        public Usuario getUsuarioLogado();
        public ArrayList<OrdemServico> getListOrdemServico();
        public OrdemServico getOrdemServico();
        public ArrayList<OrdemServico> getListOrdemServicoPendentes();
        public int getPosListOrdemServicoPendentes();
        
        /*
         * Setters
         * Metodos modificadores de atributos.
        */
        public void setListAdministradores(ArrayList<Administrador> listAdministradores);
        public void setAdministrador(Administrador administrador);
        public void setListVendedores(ArrayList<Vendedor> listVendedores);
        public void setVendedor(Vendedor vendedor);
        public void setListMecanicos(ArrayList<Mecanico> listMecanicos);
        public void setMecanico(Mecanico mecanico);
        public void setListClientes(ArrayList<Cliente> listClientes);
        public void setCliente(Cliente cliente);
        public void setUsuarioLogado(Usuario usuarioLogado);
        public void setListOrdemServico(ArrayList<OrdemServico> listOrdemServico);
        public void setOrdemServico(OrdemServico ordemServico);
        public void setListOrdemServicoPendentes(ArrayList<OrdemServico> listOrdemServicoPendentes);
        public void setPosListOrdemServicoPendentes(int pos);
}
