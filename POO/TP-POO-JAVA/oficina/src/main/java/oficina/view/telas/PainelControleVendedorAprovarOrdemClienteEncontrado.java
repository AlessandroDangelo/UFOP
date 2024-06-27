/*
 * Tela PainelControleVendedorAprovarOrdemClienteEncontrado
 * Painel de controle para aprovação das ordem de servico do cliente.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;

public class PainelControleVendedorAprovarOrdemClienteEncontrado extends javax.swing.JFrame 
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a referencia a instancia a oficina.
        */
        private Oficina oficina;
        
        
    /*
     * Metodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public PainelControleVendedorAprovarOrdemClienteEncontrado(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Funcionalidades adicionais essenciais a classe.
        */
            /*
             * load()
             * Carrega todas as informacoes.
            */
            public final void load()
            {
                // ordem de lista limpa
                if( this.getOficina().getListOrdemServicoPendentes().isEmpty() ){
                    
                    JOptionPane.showMessageDialog(null, "Nenhuma ordem pendente para esse Cliente consulte o Mecânico.");
                    return ;
                }
                
                // caso inicial
                if( this.getOficina().getPosListOrdemServicoPendentes() == -1 ){
                    
                    this.getOficina().setPosListOrdemServicoPendentes( this.getOficina().getPosListOrdemServicoPendentes() + 1 );
                    this.getOficina().setOrdemServico( 
                        this.getOficina().getListOrdemServicoPendentes().get( 
                            this.getOficina().getPosListOrdemServicoPendentes() 
                        ) 
                    );
                
                // outros casos    
                } else if( (this.getOficina().getPosListOrdemServicoPendentes() + 1) < this.getOficina().getListOrdemServicoPendentes().size() ){
                    
                    this.getOficina().setPosListOrdemServicoPendentes( this.getOficina().getPosListOrdemServicoPendentes() + 1 );
                    this.getOficina().setOrdemServico( 
                        this.getOficina().getListOrdemServicoPendentes().get( 
                            this.getOficina().getPosListOrdemServicoPendentes() 
                        ) 
                    );
                 
                // retorna a posicao inicial
                } else {
                    
                    this.getOficina().setPosListOrdemServicoPendentes( -1 + 1 );
                    this.getOficina().setOrdemServico( 
                        this.getOficina().getListOrdemServicoPendentes().get( 
                            this.getOficina().getPosListOrdemServicoPendentes() 
                        ) 
                    );
                    
                }
                
                // carrega a ordem
                this.loadOrdem();
               
            }
            
            /*
             * loadOrdem()
             * Carrega a ordem do sistema.
            */
            public void loadOrdem(){
                
                // carrega os dados do cliente
                this.txtNome.setText( this.getOficina().getCliente().getNome() );
                this.txtCpf.setText( this.getOficina().getCliente().getCpf()  );
                this.txtQtdOrdemServico.setText( Integer.toString( this.getOficina().getListOrdemServicoPendentes().size()  )  );
                
                
                // carrega os dados da ordem de servico que esta no topo
                this.txtNumOrdemServico.setText( Integer.toString( this.getOficina().getOrdemServico().getId() + 1) );
                this.txtPlaca.setText( this.getOficina().getOrdemServico().getVeiculo().getPlaca() );
                this.txtMarca.setText( this.getOficina().getOrdemServico().getVeiculo().getMarca() );
                this.txtModelo.setText( this.getOficina().getOrdemServico().getVeiculo().getModelo() );
                this.txtValor.setText( Double.toString( this.getOficina().getOrdemServico().getPreco()) );
                this.txtNumItens.setText( 
                    Integer.toString( 
                        this.getOficina().getOrdemServico().getListProdutos().size() + this.getOficina().getOrdemServico().getListServicos().size()  
                    ) 
                );
            }
            
            /*
             * clearOrdem()
             * Limpa os dados relativos a ordem.
            */
            public final void clearOrdem()
            {
                this.getOficina().setOrdemServico(null);
                this.txtNumOrdemServico.setText( "..." );
                this.txtPlaca.setText( "..." );
                this.txtMarca.setText( "..." );
                this.txtModelo.setText( "..." );
                this.txtValor.setText( "..." );
                this.txtNumItens.setText( "..." );
            }
        
        /*
         * Metodos especiais
         * Getters e Setters.
        */
            /*
             * Getters
             * Metodos acessores de atributos.
            */
            public Oficina getOficina()
            {
                return this.oficina;
            }
            
            /*
             * Setters
             * Metodos modificadores de atributos.
            */
            public void setOficina(Oficina oficina)
            {
                this.oficina = oficina;
            }

    /*
     * Recursos adicionais
     * Atributos e funcionalidades adicionais.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        lDadosCliente = new javax.swing.JLabel();
        sDadosCliente = new javax.swing.JSeparator();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        lNumOrdemServico = new javax.swing.JLabel();
        txtQtdOrdemServico = new javax.swing.JLabel();
        sDadosOrdem = new javax.swing.JSeparator();
        lDadosOrdem = new javax.swing.JLabel();
        lNumeroOrdem = new javax.swing.JLabel();
        txtNumOrdemServico = new javax.swing.JLabel();
        lPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JLabel();
        lMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        bAprovar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bProximaOrdem = new javax.swing.JButton();
        lValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        bListarItens = new javax.swing.JButton();
        lItens = new javax.swing.JLabel();
        txtNumItens = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Aprovar Ordem de Serviço");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lDadosCliente.setText("Dados do Cliente:");

        lNome.setText("Nome:");

        txtNome.setText("Carregando...");

        lCpf.setText("CPF:");

        txtCpf.setText("Carregando...");

        lNumOrdemServico.setText("Número de Ordens de Serviço Pendentes:");

        txtQtdOrdemServico.setText("Carregando...");

        lDadosOrdem.setText("Dados da Ordem:");

        lNumeroOrdem.setText("Número Ordem:");

        txtNumOrdemServico.setText("...");

        lPlaca.setText("Placa Veículo:");

        txtPlaca.setText("...");

        lMarca.setText("Marca do Veículo:");

        txtMarca.setText("...");

        lModelo.setText("Modelo do Veículo:");

        txtModelo.setText("...");

        bAprovar.setText("Aprovar");
        bAprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprovarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bProximaOrdem.setText("Próxima Ordem");
        bProximaOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximaOrdemActionPerformed(evt);
            }
        });

        lValor.setText("Valor da Ordem:");

        txtValor.setText("...");

        bListarItens.setText("Listar Itens da Ordem de Serviço");
        bListarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarItensActionPerformed(evt);
            }
        });

        lItens.setText("Número de Itens:");

        txtNumItens.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sDadosCliente)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lDadosCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDadosOrdem)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNumOrdemServico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtQtdOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lNome)
                                        .addComponent(lCpf))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(sDadosOrdem, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNumeroOrdem)
                            .addComponent(lPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lItens)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumItens, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bListarItens)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtModelo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAprovar)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bProximaOrdem)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bVoltar)))
                .addGap(18, 18, 18)
                .addComponent(lDadosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(txtCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumOrdemServico)
                    .addComponent(txtQtdOrdemServico))
                .addGap(31, 31, 31)
                .addComponent(lDadosOrdem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDadosOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumeroOrdem)
                    .addComponent(txtNumOrdemServico)
                    .addComponent(lItens)
                    .addComponent(txtNumItens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlaca)
                    .addComponent(txtPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarca)
                    .addComponent(txtMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModelo)
                    .addComponent(txtModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(txtValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bListarItens)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAprovar)
                    .addComponent(bCancelar)
                    .addComponent(bProximaOrdem))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna a aprovação da ordem
        PainelControleVendedorAprovarOrdem painelControleVendedorAprovarOrdem = new PainelControleVendedorAprovarOrdem( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorAprovarOrdem.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bProximaOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximaOrdemActionPerformed
        
        // nenhuma ordem pendente?
        if( this.getOficina().getListOrdemServicoPendentes().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Nenhuma ordem pendente para esse Cliente consulte o Mecânico.");
            return ;
            
        }
        
        
        // recarrega a nova ordem
        this.load();
        
    }//GEN-LAST:event_bProximaOrdemActionPerformed

    private void bAprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAprovarActionPerformed
        
        // verifica se a ordem de servico e valida
        if( this.getOficina().getOrdemServico() == null ){
            JOptionPane.showMessageDialog(null, "Ordem de Serviço Inválida!");
            return ;
        }
        
        // aprova a ordem de servico
        this.getOficina().getOrdemServico().setStatus( 3 );
        
        // tira a ordem da lista de trabalho do mecanico
        this.getOficina().getOrdemServico().getMecanico().getListOrdemServico().remove( this.getOficina().getOrdemServico() );
        
        // recalcula a lista de ordens pendentes
        this.getOficina().setListOrdemServicoPendentes(
                this.getOficina().buscaOrdemServicoPendenteClienteCpf(
                        this.getOficina().getCliente().getCpf()  
                ) 
        );
        
        // limpa a ordem
        this.clearOrdem();
        
        // exibe aviso de aprovacao
        JOptionPane.showMessageDialog(null, "Ordem aprovada com sucesso!");
        
        // verifica se a lista encontrada esta vazia
        if( this.getOficina().getListOrdemServicoPendentes().size() >= 1 ){
            
            this.getOficina().setPosListOrdemServicoPendentes(-1);
            
        }
        
        // recarrega a ordem
        this.load();
      
        
    }//GEN-LAST:event_bAprovarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       
        // verifica se a ordem de servico e valida
        if( this.getOficina().getOrdemServico() == null ){
            JOptionPane.showMessageDialog(null, "Ordem de Serviço Inválida!");
            return ;
        }
        
        // finaliza ordem de servico
        this.getOficina().getOrdemServico().setStatus( 1 );
        
        // tira a ordem da lista de trabalho do mecanico
        this.getOficina().getOrdemServico().getMecanico().getListOrdemServico().remove( this.getOficina().getOrdemServico() );
        
        // recalcula a lista de ordens pendentes
        this.getOficina().setListOrdemServicoPendentes(
                this.getOficina().buscaOrdemServicoPendenteClienteCpf(
                        this.getOficina().getCliente().getCpf()  
                ) 
        );
        
        // lima a ordem
        this.clearOrdem();
        
        
        // verifica se a lista encontrada esta vazia
        if( this.getOficina().getListOrdemServicoPendentes().size() >= 1 ){
            
            this.getOficina().setPosListOrdemServicoPendentes(-1);
            
        }
        
        // exibe aviso de aprovacao
        JOptionPane.showMessageDialog(null, "Ordem cancelada com sucesso!");
        
        this.load();
        
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bListarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarItensActionPerformed
        
        // verifica se existe uma ordem de servico
        if( this.getOficina().getOrdemServico() == null ){
            JOptionPane.showMessageDialog(null, "Não existe ordem de serviço ativa.");
            return ;
        }
        
        // verifica se ordem possui ao menos um produto ou servico
        if( ( this.getOficina().getOrdemServico().getListProdutos().size() + this.getOficina().getOrdemServico().getListServicos().size() ) < 1 ){
            
            JOptionPane.showMessageDialog(null, "Ordem de Serviço sem Produtos e Serviços!");
            return ;
            
        }
        
        // configura a ordem de servico
        this.getOficina().getOrdemServico().setCicloProduto(false);
        this.getOficina().getOrdemServico().setCicloServico(false);
        this.getOficina().getOrdemServico().setPosProduto(-1);
        this.getOficina().getOrdemServico().setPosServico(-1);
        
        // realiza a listagem de itens presentes na ordem
        PainelControleVendedorAprovarOrdemListarItens painelControleVendedorAprovarOrdemListarItens = new PainelControleVendedorAprovarOrdemListarItens( this.getOficina() );
        painelControleVendedorAprovarOrdemListarItens.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bListarItensActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAprovar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bListarItens;
    private javax.swing.JButton bProximaOrdem;
    private javax.swing.JButton bVoltar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDadosCliente;
    private javax.swing.JLabel lDadosOrdem;
    private javax.swing.JLabel lItens;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumOrdemServico;
    private javax.swing.JLabel lNumeroOrdem;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JLabel lValor;
    private javax.swing.JSeparator sDadosCliente;
    private javax.swing.JSeparator sDadosOrdem;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNumItens;
    private javax.swing.JLabel txtNumOrdemServico;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtQtdOrdemServico;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtValor;
    // End of variables declaration//GEN-END:variables
}
