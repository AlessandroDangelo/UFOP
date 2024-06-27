/*
 * Tela PainelControleVendedorAprovarOrdemListarItens
 * Possibilita a listagem de todos os itens da ordem de servico.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleVendedorAprovarOrdemListarItens extends javax.swing.JFrame 
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
         * Prepara instancia da classe.
        */
        public PainelControleVendedorAprovarOrdemListarItens(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Rotinas adicionais a classe.
        */
            /*
             * load()
             * Carrega os dados da ordem de servico.
            */
            public final void load()
            {
                // carrega os dados da ordem
                this.loadOrdem();
                
                // exibe produtos
                    // caso base, ordem recem chegada, nenhum avanco realizado
                    if( this.getOficina().getOrdemServico().getPosProduto() == -1 ){

                        // exibe o primeiro produto
                        this.getOficina().getOrdemServico().setPosProduto( this.getOficina().getOrdemServico().getPosProduto() + 1 );
                        this.loadProduto();
                        return ;

                    // caso intermediario
                    } else if( (this.getOficina().getOrdemServico().getPosProduto() + 1) < this.getOficina().getOrdemServico().getListProdutos().size()  ) {

                        // realiza avancos
                        this.getOficina().getOrdemServico().setPosProduto( this.getOficina().getOrdemServico().getPosProduto() + 1 );
                        this.loadProduto();
                        return ;

                    }
                
                // exibe servicos
                    // verifica se os servicos estao em estado inicial
                    if( this.getOficina().getOrdemServico().getPosServico() == -1 ){

                        // exibe o primeiro servico
                        this.getOficina().getOrdemServico().setPosServico( this.getOficina().getOrdemServico().getPosServico() + 1 );
                        this.loadServico();
                        return ;

                    // caso intermediario
                    } else if( (this.getOficina().getOrdemServico().getPosServico() + 1) < this.getOficina().getOrdemServico().getListServicos().size()  ) {

                        // realiza avancos
                        this.getOficina().getOrdemServico().setPosServico( this.getOficina().getOrdemServico().getPosServico() + 1 );
                        this.loadServico();
                        return ;

                    }
                    
                // todos os produtos e servicos foram exibidos
                    // recomeca
                    this.getOficina().getOrdemServico().setPosProduto(-1);
                    this.getOficina().getOrdemServico().setPosServico(-1);
                    this.load();
            }
            
            /*
             * loadOrdem
             * Carrega os dados relativos a ordem.
            */
            public final void loadOrdem()
            {
                this.txtNumOrdemServico.setText( Integer.toString(this.getOficina().getOrdemServico().getId() + 1 ) );
                this.txtNumProdutos.setText( Integer.toString( this.getOficina().getOrdemServico().getListProdutos().size()  )  );
                this.txtNumServicos.setText( Integer.toString( this.getOficina().getOrdemServico().getListServicos().size()  ) );
            }
            
            /*
             * loadProduto()
             * Carrega os dados do produto
            */
            public final void loadProduto()
            {
                // verifica se ta dando tudo certo
                if( this.getOficina().getOrdemServico().getPosProduto() == this.getOficina().getOrdemServico().getListProdutos().size() ){
                    this.clearItem();
                    return ;
                }
                
                this.txtNumItem.setText( Integer.toString( this.getOficina().getOrdemServico().getPosProduto() + 1 )  );
                    this.txtTipoItem.setText("Produto");
                    this.txtNomeItem.setText( 
                        this.getOficina().getOrdemServico().getListProdutos().get( 
                                this.getOficina().getOrdemServico().getPosProduto()
                        ).getNome()
                );
                this.txtPrecoItem.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListProdutos().get( 
                                this.getOficina().getOrdemServico().getPosProduto()
                        ).getPreco()
                    )
                );
                this.txtQtdItem.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListProdutos().get( 
                            this.getOficina().getOrdemServico().getPosProduto()
                        ).getQuantidade()
                    )   
                );
                this.txtSubtotal.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListProdutos().get( 
                            this.getOficina().getOrdemServico().getPosProduto()
                        ).getQuantidade() *
                        this.getOficina().getOrdemServico().getListProdutos().get( 
                            this.getOficina().getOrdemServico().getPosProduto()
                        ).getPreco()      
                    )  
                );
            }
            
            /*
             * loadServico()
             * Carrega os dados do servico indicado pela posicao.
            */
            public final void loadServico()
            {
                // verifica se ta dando tudo certo
                if( this.getOficina().getOrdemServico().getPosServico() == this.getOficina().getOrdemServico().getListServicos().size() ){
                    this.clearItem();
                    return ;
                }
                
               this.txtNumItem.setText( Integer.toString( this.getOficina().getOrdemServico().getPosServico() + 1) );
                    this.txtTipoItem.setText("Serviço");
                    this.txtNomeItem.setText( 
                        this.getOficina().getOrdemServico().getListServicos().get( 
                                this.getOficina().getOrdemServico().getPosServico()
                        ).getNome()
                );
                this.txtPrecoItem.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListServicos().get( 
                                this.getOficina().getOrdemServico().getPosServico()
                        ).getPreco()
                    )
                );
                this.txtQtdItem.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListServicos().get( 
                            this.getOficina().getOrdemServico().getPosServico()
                        ).getQuantidade()
                    )   
                );
                this.txtSubtotal.setText(
                    Double.toString(
                        this.getOficina().getOrdemServico().getListServicos().get( 
                            this.getOficina().getOrdemServico().getPosServico()
                        ).getQuantidade() *
                        this.getOficina().getOrdemServico().getListServicos().get( 
                            this.getOficina().getOrdemServico().getPosServico()
                        ).getPreco()      
                    )  
                ); 
            }
            
            /*
             * clearItem()
             * Limpa o item adicionado.
            */
            public void clearItem()
            {
                this.txtNumItem.setText( "..." );
                this.txtTipoItem.setText( "..." );
                this.txtNomeItem.setText( "...");
                this.txtPrecoItem.setText( "...");
                this.txtQtdItem.setText( "..." );
                this.txtSubtotal.setText( "..." ); 
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
     * Atributos e funcionalidades adicionais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        lNumOrdemServico = new javax.swing.JLabel();
        txtNumOrdemServico = new javax.swing.JLabel();
        lNumProdutos = new javax.swing.JLabel();
        txtNumProdutos = new javax.swing.JLabel();
        lNumItem = new javax.swing.JLabel();
        txtNumItem = new javax.swing.JLabel();
        lNumServicos = new javax.swing.JLabel();
        txtNumServicos = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        sItens = new javax.swing.JSeparator();
        lTipoItem = new javax.swing.JLabel();
        txtTipoItem = new javax.swing.JLabel();
        lNomeItem = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JLabel();
        lPrecoItem = new javax.swing.JLabel();
        txtPrecoItem = new javax.swing.JLabel();
        lQtdItem = new javax.swing.JLabel();
        txtQtdItem = new javax.swing.JLabel();
        lSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        bProximoItem = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Ordem de Servico #Lista de Itens");

        lNumOrdemServico.setText("Ordem de Servico nº:");

        txtNumOrdemServico.setText("...");

        lNumProdutos.setText("Número de Produtos: ");

        txtNumProdutos.setText("...");

        lNumItem.setText("Item nº: ");

        txtNumItem.setText("....");

        lNumServicos.setText("Número de Serviços:");

        txtNumServicos.setText("...");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lTipoItem.setText("Tipo de Item:");

        txtTipoItem.setText("...");

        lNomeItem.setText("Nome:");

        txtNomeItem.setText("...");

        lPrecoItem.setText("Preço:");

        txtPrecoItem.setText("...");

        lQtdItem.setText("Quantidade:");

        txtQtdItem.setText("...");

        lSubtotal.setText("Subtotal:");

        txtSubtotal.setText("...");

        bProximoItem.setText("Próximo");
        bProximoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximoItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sItens)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumProdutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumOrdemServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumServicos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSubtotal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lTipoItem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNumItem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumItem, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lNomeItem)
                                        .addComponent(lPrecoItem))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNomeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lQtdItem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtQtdItem))
                                .addComponent(bProximoItem, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(bVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumOrdemServico)
                    .addComponent(txtNumOrdemServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumProdutos)
                    .addComponent(txtNumProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumServicos)
                    .addComponent(lNumServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(sItens, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumItem)
                    .addComponent(txtNumItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipoItem)
                    .addComponent(txtTipoItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeItem)
                    .addComponent(txtNomeItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrecoItem)
                    .addComponent(txtPrecoItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQtdItem)
                    .addComponent(txtQtdItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSubtotal)
                    .addComponent(txtSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(bProximoItem)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bProximoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximoItemActionPerformed
        this.load();
    }//GEN-LAST:event_bProximoItemActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // volta ao resumo da Ordem de Servico
        PainelControleVendedorAprovarOrdemClienteEncontrado painelControleVendedorAprovarOrdemClienteEncontrado = new PainelControleVendedorAprovarOrdemClienteEncontrado( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorAprovarOrdemClienteEncontrado.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bProximoItem;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lNomeItem;
    private javax.swing.JLabel lNumItem;
    private javax.swing.JLabel lNumOrdemServico;
    private javax.swing.JLabel lNumProdutos;
    private javax.swing.JLabel lNumServicos;
    private javax.swing.JLabel lPrecoItem;
    private javax.swing.JLabel lQtdItem;
    private javax.swing.JLabel lSubtotal;
    private javax.swing.JLabel lTipoItem;
    private javax.swing.JSeparator sItens;
    private javax.swing.JLabel txtNomeItem;
    private javax.swing.JLabel txtNumItem;
    private javax.swing.JLabel txtNumOrdemServico;
    private javax.swing.JLabel txtNumProdutos;
    private javax.swing.JLabel txtNumServicos;
    private javax.swing.JLabel txtPrecoItem;
    private javax.swing.JLabel txtQtdItem;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTipoItem;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
