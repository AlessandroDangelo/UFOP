/*
 * Oficina
 * Abstrai oficina do sistema.
*/
package oficina.model.finals;

import oficina.model.interfaces.iOficina;
import oficina.view.telas.*;
import java.util.*;

public class Oficina implements iOficina
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * listAdministradores
         * Armazena a lista de administradores cadastrados no sistema.
        */
        private ArrayList<Administrador> listAdministradores;
        private Administrador administrador;
        
        /*
         * listVendedores
         * Armazena a lista de vendedores cadastrados no sistema.
        */
        private ArrayList<Vendedor> listVendedores;
        private Vendedor vendedor;
        
        /*
         * listMecanicos
         * Armazena a lista de mecanicos cadastrados no sistema.
        */
        private ArrayList<Mecanico> listMecanicos;
        private Mecanico mecanico;
        
        /*
         * listClientes
         * Armazena a lista de clientes cadastrados no sistema.
        */
        private ArrayList<Cliente> listClientes;
        private Cliente cliente;
        
        /*
         * listOrdemServicos
         * Armazena a lista de ordens de servico cadastradas no sistema.
        */
        private ArrayList<OrdemServico> listOrdemServico;
        private OrdemServico ordemServico;
        private ArrayList<OrdemServico> listOrdemServicoPendentes;
        private int posListOrdemServicoPendentes;
        
        /*
         * usuarioLogado
         * Armazena o usuario logado pelo sistema.
        */
        private Usuario usuarioLogado;
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara instancia da classe.
        */
        public Oficina()
        {
            this.listAdministradores = new ArrayList<>();
            this.listVendedores = new ArrayList<>();
            this.listMecanicos = new ArrayList<>();
            this.listClientes = new ArrayList<>();
            this.listOrdemServico = new ArrayList<>();
            this.listOrdemServicoPendentes = new ArrayList<>();
            this.usuarioLogado = null;
            this.main();
        }
        
        /*
         * Principal
         * Linha principal de execucao da oficina.
        */
        private void main()
        {   
            // abre a tela de boas vindas
            BoasVindas boasVindas = new BoasVindas();
            boasVindas.setOficina(this);
            boasVindas.setVisible(true);
        }
        
        /*
         * Busca
         * Busca elementos a partir de chaves.
        */
        @Override
        public Administrador buscaAdministradorCpf(String cpf)
        {   
            for(int i = 0; i< this.getListAdministradores().size() ; i++)
            {
               if( this.getListAdministradores().get(i).getCpf().compareTo(cpf) == 0 )
                   return this.getListAdministradores().get(i);
            }
            return null;
        }
        @Override
        public Administrador buscaAdministradorEmail(String email)
        {
            for(int i = 0; i< this.getListAdministradores().size() ; i++)
            {
               if( this.getListAdministradores().get(i).getUsuario().getEmail().compareTo(email) == 0 )
                   return this.getListAdministradores().get(i);
            }
            return null;
        }
        @Override
        public Vendedor buscaVendedorCpf(String cpf)
        {
            for(int i = 0; i< this.getListVendedores().size() ; i++)
            {
               if( this.getListVendedores().get(i).getCpf().compareTo(cpf) == 0 )
                   return this.getListVendedores().get(i);
            }
            return null;
        }
        @Override
        public Vendedor buscaVendedorEmail(String email)
        {
            for(int i = 0; i< this.getListVendedores().size() ; i++)
            {
               if( this.getListVendedores().get(i).getUsuario().getEmail().compareTo(email) == 0 )
                   return this.getListVendedores().get(i);
            }
            return null;
        }
        @Override
        public Mecanico buscaMecanicoCpf(String cpf)
        {
            for(int i = 0; i< this.getListMecanicos().size() ; i++)
            {
               if( this.getListMecanicos().get(i).getCpf().compareTo(cpf) == 0 )
                   return this.getListMecanicos().get(i);
            }
            return null;
        }
        @Override
        public Mecanico buscaMecanicoEmail(String email)
        {
            for(int i = 0; i< this.getListMecanicos().size() ; i++)
            {
               if( this.getListMecanicos().get(i).getUsuario().getEmail().compareTo(email) == 0 )
                   return this.getListMecanicos().get(i);
            }
            return null;
        }
        @Override
        public Cliente buscaClienteCpf(String cpf)
        {
            for(int i = 0; i< this.getListClientes().size() ; i++)
            {
               if( this.getListClientes().get(i).getCpf().compareTo(cpf) == 0 )
                   return this.getListClientes().get(i);
            }
            return null;
        }
        @Override
        public OrdemServico buscaOrdemServicoId(int id)
        {
            for(int i = 0; i< this.getListOrdemServico().size() ; i++)
            {
               if( this.getListOrdemServico().get(i).getId() == id )
                   return this.getListOrdemServico().get(i);
            }
            return null;
        }
        @Override
        public ArrayList<OrdemServico> buscaOrdemServicoPendenteClienteCpf(String cpf)
        {
            ArrayList<OrdemServico> listOrdemServicoPendenteClienteCpf = new ArrayList<>();
            for(int i = 0; i< this.getListOrdemServico().size() ; i++)
            {   
               // pertencem ao cliente e estao abertas
               if( this.getListOrdemServico().get(i).getCliente().getCpf().compareTo( cpf ) == 0 &&
                   this.getListOrdemServico().get(i).getStatus() == 2  ) {
                   listOrdemServicoPendenteClienteCpf.add(  this.getListOrdemServico().get(i) );
               }
                   
            }
            return listOrdemServicoPendenteClienteCpf;
        }
        @Override
        public ArrayList<OrdemServico> buscaOrdemServicoPendentes()
        {
            ArrayList<OrdemServico> listOrdemServicoPendentes = new ArrayList<>();
            for(int i = 0; i< this.getListOrdemServico().size() ; i++)
            {   
               // estao sem mecanico associado
               if( this.getListOrdemServico().get(i).getMecanico() == null || this.getListOrdemServico().get(i).getStatus() == 0 ) {
                   listOrdemServicoPendentes.add(  this.getListOrdemServico().get(i) );
               }
                   
            }
            return listOrdemServicoPendentes;
        }
        
        /*
         * Insersao
         * Insere elementos novos.
        */
        @Override
        public int inserirAdministrador(Administrador a)
        {   
            // ja existe um administrador cadastrado?
            if( this.buscaAdministradorCpf(a.getCpf()) != null )
                return 0;
            
            // insere o novo administrador
            if( this.getListAdministradores().add(a)){
                
                // administrador inserido com sucesso.
                return 1;
            } else {
                
                // falha na insersao do administrador
                return 2;
            }
        }
        @Override
        public int inserirVendedor(Vendedor v)
        {
            // ja existe um venededor cadastrado?
            if( this.buscaVendedorCpf(v.getCpf()) != null )
                return 0;
            
            // insere o novo vendedor
            if( this.getListVendedores().add(v) ){
                
                // vendedor inserido com sucessso
                return 1;
                
            } else {
                
                // falha na insersao do vendedor
                return 2;
            }
        }
        @Override
        public int inserirMecanico(Mecanico m)
        {
            // ja existe um mecanico cadastrado?
            if( this.buscaMecanicoCpf( m.getCpf() ) != null )
                return 0;
            
            // insere um novo mecanico
            if( this.getListMecanicos().add(m) ){
                
                // mecanico inserido com sucesso
                return 1;
                
            } else {
                
                // falha na insersao do mecanico
                return 2;
            }
        }
        @Override
        public int inserirCliente(Cliente c)
        {
            // o cliente ja existe no sistema?
            if( this.buscaClienteCpf(c.getCpf()) != null )
                return 0;
           
            // insere o novo cliente
            if( this.getListClientes().add(c) ){
                
                // cliente inserido com sucesso
                return 1;
                
            } else {
                
                // falha na insersao do cliente
                return 0;
                
            }
        }
        @Override
        public int inserirOrdemServico(OrdemServico o)
        {
            // a ordem de servico ja existe no sistema
            if( this.buscaOrdemServicoId( o.getId() ) != null )
                return 0;
            
            // insere a nova ordem
            if( this.getListOrdemServico().add(o) ){
                
                // ordem de servico inserida com sucesso
                return 1;
                
            } else {
                
                // falha ao inserir ordem de servico
                return 2;
                
            }
           
        }
        
        /*
         * Remocao
         * Remove os elementos da lista.
        */
        @Override
        public boolean removerAdministradorCpf(String cpf)
        {
            return true;
        }
        @Override
        public boolean removerVendedorCpf(String cpf)
        {
            return true;
        }
        @Override
        public boolean removerMecanicoCpf(String cpf)
        {
            return true;
        }
        @Override
        public boolean removerClienteCpf(String cpf)
        {
            return true;
        }
        
        /*
         * Metodos Especiais
         * Getters e Setters.
        */
            /*
             * Getters
             * Metodos acessores de atributos.
            */
            @Override
            public ArrayList<Administrador> getListAdministradores()
            {
                return this.listAdministradores;
            }
            @Override
            public Administrador getAdministrador()
            {
                return this.administrador;
            }
            @Override
            public ArrayList<Vendedor> getListVendedores()
            {
                return this.listVendedores;
            }
            @Override
            public Vendedor getVendedor()
            {
                return this.vendedor;
            }
            @Override
            public ArrayList<Mecanico> getListMecanicos()
            {
                return this.listMecanicos;
            }
            @Override
            public Mecanico getMecanico()
            {
                return this.mecanico;
            }
            @Override
            public ArrayList<Cliente> getListClientes()
            {
                return this.listClientes;
            }
            @Override
            public Cliente getCliente()
            {
                return this.cliente;
            }
            @Override
            public Usuario getUsuarioLogado()
            {
                return usuarioLogado;
            }
            @Override
            public ArrayList<OrdemServico> getListOrdemServico()
            {
                return this.listOrdemServico;
            }
            @Override
            public OrdemServico getOrdemServico()
            {
                return this.ordemServico;
            }
            @Override
            public ArrayList<OrdemServico> getListOrdemServicoPendentes()
            {
                return this.listOrdemServicoPendentes;
            }
            @Override
            public int getPosListOrdemServicoPendentes()
            {
                return this.posListOrdemServicoPendentes;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            @Override
            public void setListAdministradores(ArrayList<Administrador> listAdministradores)
            {
                this.listAdministradores = listAdministradores;
            }
            @Override
            public void setAdministrador(Administrador administrador)
            {
                this.administrador = administrador;
            }
            @Override
            public void setListVendedores(ArrayList<Vendedor> listVendedores)
            {
                this.listVendedores = listVendedores;
            }
            @Override
            public void setVendedor(Vendedor vendedor)
            {
                this.vendedor = vendedor;
            }
            @Override
            public void setListMecanicos(ArrayList<Mecanico> listMecanicos)
            {
                this.listMecanicos = listMecanicos;
            }
            @Override
            public void setMecanico(Mecanico mecanico)
            {
                this.mecanico = mecanico;
            }
            @Override
            public void setListClientes(ArrayList<Cliente> listClientes)
            {
                this.listClientes = listClientes;
            }
            @Override
            public void setCliente(Cliente cliente)
            {
                this.cliente = cliente;
            }
            @Override
            public void setUsuarioLogado(Usuario usuarioLogado)
            {
                this.usuarioLogado = usuarioLogado;
            }
            @Override
            public void setListOrdemServico(ArrayList<OrdemServico> listOrdemServico)
            {
                this.listOrdemServico = listOrdemServico;
            }
            @Override
            public void setOrdemServico(OrdemServico ordemServico)
            {
                this.ordemServico = ordemServico;
            }
            @Override
            public void setListOrdemServicoPendentes(ArrayList<OrdemServico> listOrdemServicoPendentes)
            {
                this.listOrdemServicoPendentes = listOrdemServicoPendentes;
            }
            @Override
            public void setPosListOrdemServicoPendentes(int pos)
            {
                this.posListOrdemServicoPendentes = pos;
            }
}
