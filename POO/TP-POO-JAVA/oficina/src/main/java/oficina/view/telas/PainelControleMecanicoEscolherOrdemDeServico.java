/*
 * Tela PainelControleMeanicoEscolherOrdemDeServico
 * Tela que permite com que o Mecanico escolha as ordens que ele vai executar.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;

public class PainelControleMecanicoEscolherOrdemDeServico extends javax.swing.JFrame
{
    /*
     * Atributos
     * Dados e estruturas.
    */
        /*
         * oficina
         * Armazena a referencia a instancia da oficina.
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
        public PainelControleMecanicoEscolherOrdemDeServico(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Implementam recursos adicionais
        */
            /*
             * load()
             * Carrega os dados das ordens de servico.
            */
            public final void load()
            {
               // caso inicial
               if( this.getOficina().getPosListOrdemServicoPendentes() == -1 ){
                   
                   // avanca
                   this.getOficina().setPosListOrdemServicoPendentes( this.getOficina().getPosListOrdemServicoPendentes() + 1 );
                   
                   // exibe
                   this.loadCabecalho();
                   this.loadOrdem();
                   return ;
               
               // caso padrao
               } else if( (this.getOficina().getPosListOrdemServicoPendentes() + 1) < this.getOficina().getListOrdemServicoPendentes().size() ){
                   
                    // avanca
                   this.getOficina().setPosListOrdemServicoPendentes( this.getOficina().getPosListOrdemServicoPendentes() + 1 );
                   
                   // exibe
                   this.loadCabecalho();
                   this.loadOrdem();
                   return ;
               }
               
               // cheguei ao final
               this.getOficina().setPosListOrdemServicoPendentes(-1);
               this.load();
               
               
            }
            
            /*
             * loadCabecalho()
             * realiza um load dos elementos do cabecalho.
            */
            public final void loadCabecalho()
            {
                this.txtNumOrdensServicoDisponiveis.setText(
                    Integer.toString(
                        this.getOficina().getListOrdemServicoPendentes().size()
                    )
                );
            }
            
            /*
             * loadOrdem()
             * Carrega a ordem posicionada pelo sistema.
            */
            public final void loadOrdem()
            {
                // verifica se ordem esta ativa
                if( this.getOficina().getListOrdemServicoPendentes().size() == this.getOficina().getPosListOrdemServicoPendentes() ){
                    
                    JOptionPane.showMessageDialog(null, "Lista de Ordens de Serviço Vazia!");
                    this.clearOrdem();
                    return ;
                    
                }
                
                // caso trivial -- ordem disponivel
                this.txtNumOrdemServico.setText(
                    Integer.toString(
                        this.getOficina().getListOrdemServicoPendentes().get( this.getOficina().getPosListOrdemServicoPendentes() ).getId() + 1
                    )
                );
                this.txtNomeVendedor.setText(
                    this.getOficina().getListOrdemServicoPendentes().get( 
                    this.getOficina().getPosListOrdemServicoPendentes() 
                   ).getVendedor().getNome()
                );
                this.txtNomeCliente.setText(
                   this.getOficina().getListOrdemServicoPendentes().get( 
                    this.getOficina().getPosListOrdemServicoPendentes() 
                   ).getCliente().getNome()
                );
                this.txtCpfCliente.setText(
                   this.getOficina().getListOrdemServicoPendentes().get( 
                    this.getOficina().getPosListOrdemServicoPendentes() 
                   ).getCliente().getCpf()
                );
                this.txtMarcaVeiculo.setText(
                    this.getOficina().getListOrdemServicoPendentes().get( 
                        this.getOficina().getPosListOrdemServicoPendentes() 
                    ).getVeiculo().getMarca()
                );
                this.txtModeloVeiculo.setText(
                    this.getOficina().getListOrdemServicoPendentes().get( 
                        this.getOficina().getPosListOrdemServicoPendentes() 
                    ).getVeiculo().getModelo()
                );
                this.txtPlacaVeiculo.setText(
                    this.getOficina().getListOrdemServicoPendentes().get( 
                        this.getOficina().getPosListOrdemServicoPendentes() 
                    ).getVeiculo().getPlaca()
                );
                this.txtNumProdutos.setText(
                    Integer.toString(
                      this.getOficina().getListOrdemServicoPendentes().get( 
                        this.getOficina().getPosListOrdemServicoPendentes() 
                        ).getListProdutos().size()
                    )
                );
                this.txtNumServicos.setText(
                    Integer.toString(
                      this.getOficina().getListOrdemServicoPendentes().get( 
                        this.getOficina().getPosListOrdemServicoPendentes() 
                        ).getListServicos().size()
                    )
                );
            }
            
            /*
             * clearOrdem()
             * Limpa os dados da ordem
            */
            public final void clearOrdem()
            {
                this.txtNumOrdemServico.setText(
                    "..."
                );
                this.txtNomeVendedor.setText(
                    "..."
                );
                this.txtNomeCliente.setText(
                   "..."
                );
                this.txtCpfCliente.setText(
                   "..."
                );
                this.txtMarcaVeiculo.setText(
                    "..."
                );
                this.txtModeloVeiculo.setText(
                    "..."
                );
                this.txtPlacaVeiculo.setText(
                    "..."
                );
                this.txtNumProdutos.setText(
                    "..."
                );
                this.txtNumServicos.setText(
                    "..."
                );
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
     * Atributos e metodos essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumOrdensServicoDisponiveis = new javax.swing.JLabel();
        sResumo = new javax.swing.JSeparator();
        bAdicionarMinhaLista = new javax.swing.JButton();
        bProximaOrdem = new javax.swing.JButton();
        lNumOrdemServico = new javax.swing.JLabel();
        txtNumOrdemServico = new javax.swing.JLabel();
        lVendedor = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JLabel();
        lCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        lCpfCliente = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JLabel();
        lMarcaVeiculo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lModeloVeiculo = new javax.swing.JLabel();
        txtModeloVeiculo = new javax.swing.JLabel();
        txtMarcaVeiculo = new javax.swing.JLabel();
        lPlacaVeículo = new javax.swing.JLabel();
        txtPlacaVeiculo = new javax.swing.JLabel();
        lNumProdutos = new javax.swing.JLabel();
        txtNumProdutos = new javax.swing.JLabel();
        lNumServicos = new javax.swing.JLabel();
        txtNumServicos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Escolha uma Ordem de Serviço");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de Ordens de Serviço Disponíveis:");

        txtNumOrdensServicoDisponiveis.setText("...");

        bAdicionarMinhaLista.setText("Adicionar a Minha Lista");
        bAdicionarMinhaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarMinhaListaActionPerformed(evt);
            }
        });

        bProximaOrdem.setText("Próxima");
        bProximaOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximaOrdemActionPerformed(evt);
            }
        });

        lNumOrdemServico.setText("Ordem de Serviço nº:");

        txtNumOrdemServico.setText("...");

        lVendedor.setText("Vendedor:");

        txtNomeVendedor.setText("...");

        lCliente.setText("Cliente:");

        txtNomeCliente.setText("...");

        lCpfCliente.setText("CPF do Cliente:");

        txtCpfCliente.setText("...");

        lMarcaVeiculo.setText("Marca do Veículo:");

        lModeloVeiculo.setText("Modelo do Veículo:");

        txtModeloVeiculo.setText("...");

        txtMarcaVeiculo.setText("...");

        lPlacaVeículo.setText("Placa do Veículo:");

        txtPlacaVeiculo.setText("...");

        lNumProdutos.setText("Número de Produtos:");

        txtNumProdutos.setText("...");

        lNumServicos.setText("Número de Serviços:");

        txtNumServicos.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sResumo)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumOrdensServicoDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumOrdemServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCpfCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lMarcaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lModeloVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lPlacaVeículo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlacaVeiculo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNumProdutos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumProdutos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNumServicos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumServicos)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bAdicionarMinhaLista)
                .addGap(18, 18, 18)
                .addComponent(bProximaOrdem)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumOrdensServicoDisponiveis))
                .addGap(18, 18, 18)
                .addComponent(sResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumOrdemServico)
                    .addComponent(txtNumOrdemServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lVendedor)
                    .addComponent(txtNomeVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCliente)
                    .addComponent(txtNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpfCliente)
                    .addComponent(txtCpfCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarcaVeiculo)
                    .addComponent(jLabel10)
                    .addComponent(txtMarcaVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModeloVeiculo)
                    .addComponent(txtModeloVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlacaVeículo)
                    .addComponent(txtPlacaVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumProdutos)
                    .addComponent(txtNumProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumServicos)
                    .addComponent(txtNumServicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bProximaOrdem)
                    .addComponent(bAdicionarMinhaLista))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna ao painel de controle do mecanico
        PainelControleMecanico painelControleMecanico = new PainelControleMecanico( this.getOficina() );
        this.setVisible(false);
        painelControleMecanico.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bProximaOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximaOrdemActionPerformed
        
        // rechama o carregamento
        this.load();
        
    }//GEN-LAST:event_bProximaOrdemActionPerformed

    private void bAdicionarMinhaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarMinhaListaActionPerformed
        
        // verifica se a lista e vazia
        if( this.getOficina().getListOrdemServicoPendentes().size() == this.getOficina().getPosListOrdemServicoPendentes() ){
            
            JOptionPane.showMessageDialog(null, "Lista de Ordens de Serviço Vazia!");
            return ;
        }
        
        // adiciona a ordem de servico a lista de pendencias do Mecanico
            // prepara as informacoes da ordem
            this.getOficina().getListOrdemServicoPendentes().get( this.getOficina().getPosListOrdemServicoPendentes() ).setMecanico( this.getOficina().getMecanico() );
            this.getOficina().getListOrdemServicoPendentes().get( this.getOficina().getPosListOrdemServicoPendentes() ).setStatus( 2 );
            
            // leva a ordem para a lista de pendencias do mecanico
            this.getOficina().getMecanico().getListOrdemServico().add( this.getOficina().getListOrdemServicoPendentes().get( this.getOficina().getPosListOrdemServicoPendentes() ) );
            
        // recalcula a lista de ordens pendentes
            this.getOficina().setListOrdemServicoPendentes( this.getOficina().buscaOrdemServicoPendentes() );
            
        // exibe aviso
            JOptionPane.showMessageDialog(null, "Ordem adicionada a lista com sucesso!");
            
        // refaz o carregamento
            this.load();
    }//GEN-LAST:event_bAdicionarMinhaListaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionarMinhaLista;
    private javax.swing.JButton bProximaOrdem;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lCpfCliente;
    private javax.swing.JLabel lMarcaVeiculo;
    private javax.swing.JLabel lModeloVeiculo;
    private javax.swing.JLabel lNumOrdemServico;
    private javax.swing.JLabel lNumProdutos;
    private javax.swing.JLabel lNumServicos;
    private javax.swing.JLabel lPlacaVeículo;
    private javax.swing.JLabel lVendedor;
    private javax.swing.JSeparator sResumo;
    private javax.swing.JLabel txtCpfCliente;
    private javax.swing.JLabel txtMarcaVeiculo;
    private javax.swing.JLabel txtModeloVeiculo;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtNomeVendedor;
    private javax.swing.JLabel txtNumOrdemServico;
    private javax.swing.JLabel txtNumOrdensServicoDisponiveis;
    private javax.swing.JLabel txtNumProdutos;
    private javax.swing.JLabel txtNumServicos;
    private javax.swing.JLabel txtPlacaVeiculo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
