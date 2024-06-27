/*
 * Tela PainelControleMecanicoListarItens
 * Tela que permite ao mecanico listar os itens ja cadastrados em uma ordem.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleMecanicoListarItens extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a referencia a instancia da oficina.
        */
        private Oficina oficina;
        
    /*
     * Metodos
     * Funcionalidades da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public PainelControleMecanicoListarItens(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
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
                this.load();
            }
            
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
                
                this.txtNumItem.setText( Integer.toString( this.getOficina().getOrdemServico().getPosProduto() + 1) );
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
             * Limpa os dados da ordem.
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
     * Recursos adicionais
     * Atributos e Metodos.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        lNumOrdemServico = new javax.swing.JLabel();
        txtNumOrdemServico = new javax.swing.JLabel();
        lNumProdutos = new javax.swing.JLabel();
        txtNumProdutos = new javax.swing.JLabel();
        lNumServicos = new javax.swing.JLabel();
        txtNumServicos = new javax.swing.JLabel();
        sItens = new javax.swing.JSeparator();
        lNumItem = new javax.swing.JLabel();
        txtNumItem = new javax.swing.JLabel();
        lTipoDoItem = new javax.swing.JLabel();
        txtTipoItem = new javax.swing.JLabel();
        lNomeItem = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JLabel();
        lPrecoItem = new javax.swing.JLabel();
        txtPrecoItem = new javax.swing.JLabel();
        lQtdItem = new javax.swing.JLabel();
        txtQtdItem = new javax.swing.JLabel();
        lSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        bAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Ordem de Serviço #ListarItens");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lNumOrdemServico.setText("Nº:");

        txtNumOrdemServico.setText("...");

        lNumProdutos.setText("Número de Produtos:");

        txtNumProdutos.setText("...");

        lNumServicos.setText("Número de Serviços:");

        txtNumServicos.setText("...");

        lNumItem.setText("Número do Item:");

        txtNumItem.setText("...");

        lTipoDoItem.setText("Tipo do Item:");

        txtTipoItem.setText("...");

        lNomeItem.setText("Nome do Item:");

        txtNomeItem.setText("...");

        lPrecoItem.setText("Preço do Item:");

        txtPrecoItem.setText("...");

        lQtdItem.setText("Quantidade do Item:");

        txtQtdItem.setText("...");

        lSubtotal.setText("Subtotal:");

        txtSubtotal.setText("...");

        bAvancar.setText("Avançar");
        bAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumServicos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumServicos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumProdutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumProdutos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumOrdemServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(sItens)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bAvancar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lSubtotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lQtdItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQtdItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lPrecoItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrecoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lNomeItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lTipoDoItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTipoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lNumItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumItem, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumOrdemServico)
                    .addComponent(txtNumOrdemServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumProdutos)
                    .addComponent(txtNumProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumServicos)
                    .addComponent(txtNumServicos))
                .addGap(18, 18, 18)
                .addComponent(sItens, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumItem)
                    .addComponent(txtNumItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipoDoItem)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAvancar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna ao cadastro de produtos e sevicos
        PainelControleMecanicoAdicionarProdutosEServicos painelControleMecanicoAdicionarProdutosEServicos = new PainelControleMecanicoAdicionarProdutosEServicos( this.getOficina() );
        this.setVisible(false);
        painelControleMecanicoAdicionarProdutosEServicos.setVisible(true);
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvancarActionPerformed
        
        this.load();
        
    }//GEN-LAST:event_bAvancarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAvancar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lNomeItem;
    private javax.swing.JLabel lNumItem;
    private javax.swing.JLabel lNumOrdemServico;
    private javax.swing.JLabel lNumProdutos;
    private javax.swing.JLabel lNumServicos;
    private javax.swing.JLabel lPrecoItem;
    private javax.swing.JLabel lQtdItem;
    private javax.swing.JLabel lSubtotal;
    private javax.swing.JLabel lTipoDoItem;
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
