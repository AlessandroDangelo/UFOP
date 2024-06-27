/*
 * Tela PainelControleMecanicoAdicionarProdutosEServicos
 * Tela que permite que o vendedor inclua produtos e servicos a ordem de servico.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.OrdemServico;
import oficina.model.finals.Produto;
import oficina.model.finals.Servico;

public class PainelControleMecanicoAdicionarProdutosEServicos extends javax.swing.JFrame
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
     * Rotinas da classe.
    */     
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public PainelControleMecanicoAdicionarProdutosEServicos(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Implementam recursos adicionais.
        */
            /*
             * load()
             * Carrega os dados
            */
            public final void load()
            {
                // caso inicial
                if( this.getOficina().getMecanico().getPosListOrdemServico() == -1 ){
                    
                    this.getOficina().getMecanico().setPosListOrdemServico( this.getOficina().getMecanico().getPosListOrdemServico() + 1 );
                    this.loadOrdem();
                    return ;
                
                // caso intermediario
                } else if( (this.getOficina().getMecanico().getPosListOrdemServico() + 1) < this.getOficina().getMecanico().getListOrdemServico().size() ){
                    
                   this.getOficina().getMecanico().setPosListOrdemServico( this.getOficina().getMecanico().getPosListOrdemServico() + 1 );
                   this.loadOrdem(); 
                   return ;
                    
                }
                
                // caso limite
                this.getOficina().getMecanico().setPosListOrdemServico(-1);
                this.load();
                
            }
            
            /*
             * loadOrdem
             * Carrega os dados da ordem de servico.
            */
            public final void loadOrdem()
            {   
                // varaiveis auxiliares
                OrdemServico ordemServico;
                
                // verifica se ordem nao esta vazia
                if( this.getOficina().getMecanico().getPosListOrdemServico() == this.getOficina().getMecanico().getListOrdemServico().size() ){
                    
                    JOptionPane.showMessageDialog(null, "Não existem ordens de serviço abertas no Sistema. Contate o Vendedor.");
                    this.clearOrdem();
                    return ;
                    
                }
                
                // recebe a ordem de servico
                ordemServico = this.getOficina().getMecanico().getListOrdemServico().get( this.getOficina().getMecanico().getPosListOrdemServico() );
                
                // carrega os dados da ordem
                this.txtNumOrdemServico.setText( Integer.toString( ordemServico.getId() + 1) );
                this.txtNomeVendedor.setText( ordemServico.getVendedor().getNome() );
                this.txtNomeCliente.setText( ordemServico.getCliente().getNome() );
                this.txtMarcaVeiculo.setText( ordemServico.getVeiculo().getMarca() );
                this.txtModeloVeiculo.setText( ordemServico.getVeiculo().getModelo() );
                this.txtPlacaVeiculo.setText( ordemServico.getVeiculo().getPlaca() );
                this.txtValorOrdem.setText( Double.toString( ordemServico.getPreco() ) );
                
            }
            
            /*
             * clearOrdem()
             * Limpa os dados da ordem.
            */
            public final void clearOrdem()
            {
                this.txtNumOrdemServico.setText( "..." );
                this.txtNomeVendedor.setText( "..." );
                this.txtNomeCliente.setText( "..." );
                this.txtMarcaVeiculo.setText( "..." );
                this.txtModeloVeiculo.setText( "..." );
                this.txtPlacaVeiculo.setText( "..." );
                this.txtValorOrdem.setText(  "..." );
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
     * Atributos e funcionalidades adicionais e essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gProdutoOuServico = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        lDadosOrdem = new javax.swing.JLabel();
        sDadosOrdem = new javax.swing.JSeparator();
        lNumOrdemServico = new javax.swing.JLabel();
        txtNumOrdemServico = new javax.swing.JLabel();
        lNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        lMarcaVeiculo = new javax.swing.JLabel();
        txtMarcaVeiculo = new javax.swing.JLabel();
        lModeloVeiculo = new javax.swing.JLabel();
        txtModeloVeiculo = new javax.swing.JLabel();
        lPlacaVeiculo = new javax.swing.JLabel();
        txtPlacaVeiculo = new javax.swing.JLabel();
        lNomeVendedor = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JLabel();
        lValorOrdem = new javax.swing.JLabel();
        txtValorOrdem = new javax.swing.JLabel();
        bProximaOrdem = new javax.swing.JButton();
        sProdutosEServicos = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        rProduto = new javax.swing.JRadioButton();
        rServico = new javax.swing.JRadioButton();
        lNomeProdutoOuServico = new javax.swing.JLabel();
        txtNomeProdutoOuServico = new javax.swing.JTextField();
        lQtdProdutoOuServico = new javax.swing.JLabel();
        txtQtdProdutoOuServico = new javax.swing.JTextField();
        lPrecoProdutoOuServico = new javax.swing.JLabel();
        txtPrecoProdutoOuServico = new javax.swing.JTextField();
        bAdicionar = new javax.swing.JButton();
        bListarProdutosEServicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Adicionar Produtos e Serviços");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lDadosOrdem.setText("Dados da Ordem:");

        lNumOrdemServico.setText("Ordem n°:");

        txtNumOrdemServico.setText("...");

        lNomeCliente.setText("Cliente:");

        txtNomeCliente.setText("...");

        lMarcaVeiculo.setText("Marca Veículo:");

        txtMarcaVeiculo.setText("...");

        lModeloVeiculo.setText("Modelo Veículo:");

        txtModeloVeiculo.setText("...");

        lPlacaVeiculo.setText("Placa Veículo:");

        txtPlacaVeiculo.setText("...");

        lNomeVendedor.setText("Vendedor:");

        txtNomeVendedor.setText("...");

        lValorOrdem.setText("Valor da Ordem:");

        txtValorOrdem.setText("...");

        bProximaOrdem.setText("Próxima");
        bProximaOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximaOrdemActionPerformed(evt);
            }
        });

        jLabel1.setText("Adicionar Produtos e Serviços:");

        gProdutoOuServico.add(rProduto);
        rProduto.setText("Produto");

        gProdutoOuServico.add(rServico);
        rServico.setText("Serviço");

        lNomeProdutoOuServico.setText("Nome:");

        lQtdProdutoOuServico.setText("Quantidade:");

        lPrecoProdutoOuServico.setText("Preço:");

        bAdicionar.setText("Adicionar");
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        bListarProdutosEServicos.setText("Listar Produtos e Serviços");
        bListarProdutosEServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarProdutosEServicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(25, 25, 25))
            .addComponent(sDadosOrdem, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(sProdutosEServicos)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDadosOrdem)
                            .addComponent(txtTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNomeVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeVendedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lValorOrdem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorOrdem))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bListarProdutosEServicos)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNomeCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNumOrdemServico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                        .addComponent(bProximaOrdem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lMarcaVeiculo)
                                            .addComponent(lModeloVeiculo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMarcaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lPlacaVeiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtQtdProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lPrecoProdutoOuServico)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bAdicionar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lNomeProdutoOuServico)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rProduto)
                                                .addGap(18, 18, 18)
                                                .addComponent(rServico))
                                            .addComponent(lQtdProdutoOuServico)
                                            .addComponent(txtNomeProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtPrecoProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo)
                .addGap(26, 26, 26)
                .addComponent(lDadosOrdem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDadosOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumOrdemServico)
                    .addComponent(txtNumOrdemServico)
                    .addComponent(bProximaOrdem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeVendedor)
                    .addComponent(txtNomeVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeCliente)
                    .addComponent(txtNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarcaVeiculo)
                    .addComponent(txtMarcaVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModeloVeiculo)
                    .addComponent(txtModeloVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlacaVeiculo)
                    .addComponent(txtPlacaVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValorOrdem)
                    .addComponent(txtValorOrdem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bListarProdutosEServicos)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sProdutosEServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rProduto)
                    .addComponent(rServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNomeProdutoOuServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lQtdProdutoOuServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQtdProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPrecoProdutoOuServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecoProdutoOuServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bAdicionar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna ao painel de controle do mecanico
        PainelControleMecanico painelControleMecanico = new PainelControleMecanico(this.getOficina());
        this.setVisible(false);
        painelControleMecanico.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        
        // variaveis auxiliares
        OrdemServico ordemServico;
        
        // verifica se existem ordem validas no sistema
        if( this.getOficina().getMecanico().getPosListOrdemServico() == this.getOficina().getMecanico().getListOrdemServico().size() ){
                    
            JOptionPane.showMessageDialog(null, "Não existem ordens de serviço abertas no Sistema. Contate o Vendedor.");
            this.clearOrdem();
            return ;
                    
        }
        
        // produto
        if( this.rProduto.isSelected() ){
            
            // adiciona um produto
            Produto produto;
            produto = new Produto(
                this.txtNomeProdutoOuServico.getText(),
                Double.parseDouble( this.txtPrecoProdutoOuServico.getText() ),
                Double.parseDouble( this.txtQtdProdutoOuServico.getText() )
            );
            
            // adiciona o produta a lista da ordem de servico
            ordemServico = this.getOficina().getMecanico().getListOrdemServico().get( this.getOficina().getMecanico().getPosListOrdemServico() );
            ordemServico.getListProdutos().add(produto);
            ordemServico.calculaPreco();
            
            // atualiza
            this.loadOrdem();
            
            // sinaliza
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucessso!");
            
        } else if( this.rServico.isSelected() ) {
        
            // adiciona um produto
            Servico servico;
            servico = new Servico(
                this.txtNomeProdutoOuServico.getText(),
                Double.parseDouble( this.txtPrecoProdutoOuServico.getText() ),
                Double.parseDouble( this.txtQtdProdutoOuServico.getText() )
            );
            
            // adiciona o produta a lista da ordem de servico
            ordemServico = this.getOficina().getMecanico().getListOrdemServico().get( this.getOficina().getMecanico().getPosListOrdemServico() );
            ordemServico.getListServicos().add(servico);
            ordemServico.calculaPreco();
            
            // atualiza
            this.loadOrdem();
            
            // sinaliza
            JOptionPane.showMessageDialog(null, "Serviço adicionado com sucessso!");
            
        } else {
        
            // primeiro escolha o tipo
            JOptionPane.showMessageDialog(null, "Primeiro defina se o Item é um produto ou Serviço.");
            
        }
        
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bProximaOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximaOrdemActionPerformed
        
        this.load();
        
    }//GEN-LAST:event_bProximaOrdemActionPerformed

    private void bListarProdutosEServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarProdutosEServicosActionPerformed
        
        // verifica se existem produtos e servicos na ordem
            // variaveis auxiliares
            OrdemServico ordemServico;
            ordemServico = this.getOficina().getMecanico().getListOrdemServico().get( this.getOficina().getMecanico().getPosListOrdemServico() );
            
            
            // verifica se a ordem e valida
            if( ordemServico == null ){
                JOptionPane.showMessageDialog(null, "Ordem de Serviço Inválida!");
                return ;
            }
            
            // modifica os dados da ordem
            ordemServico.setCicloProduto(false);
            ordemServico.setCicloServico(false);
            ordemServico.setPosProduto(-1);
            ordemServico.setPosServico(-1);
            
            // adiciona a ordem de servico a pilha
            this.getOficina().setOrdemServico(ordemServico);
            
            // abre a tela de listagens de itens
            PainelControleMecanicoListarItens painelControleMecanicoListarItens = new PainelControleMecanicoListarItens( this.getOficina() );
            this.setVisible(false);
            painelControleMecanicoListarItens.setVisible(true);
            
            
        
    }//GEN-LAST:event_bListarProdutosEServicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bListarProdutosEServicos;
    private javax.swing.JButton bProximaOrdem;
    private javax.swing.JButton bVoltar;
    private javax.swing.ButtonGroup gProdutoOuServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lDadosOrdem;
    private javax.swing.JLabel lMarcaVeiculo;
    private javax.swing.JLabel lModeloVeiculo;
    private javax.swing.JLabel lNomeCliente;
    private javax.swing.JLabel lNomeProdutoOuServico;
    private javax.swing.JLabel lNomeVendedor;
    private javax.swing.JLabel lNumOrdemServico;
    private javax.swing.JLabel lPlacaVeiculo;
    private javax.swing.JLabel lPrecoProdutoOuServico;
    private javax.swing.JLabel lQtdProdutoOuServico;
    private javax.swing.JLabel lValorOrdem;
    private javax.swing.JRadioButton rProduto;
    private javax.swing.JRadioButton rServico;
    private javax.swing.JSeparator sDadosOrdem;
    private javax.swing.JSeparator sProdutosEServicos;
    private javax.swing.JLabel txtMarcaVeiculo;
    private javax.swing.JLabel txtModeloVeiculo;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JTextField txtNomeProdutoOuServico;
    private javax.swing.JLabel txtNomeVendedor;
    private javax.swing.JLabel txtNumOrdemServico;
    private javax.swing.JLabel txtPlacaVeiculo;
    private javax.swing.JTextField txtPrecoProdutoOuServico;
    private javax.swing.JTextField txtQtdProdutoOuServico;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtValorOrdem;
    // End of variables declaration//GEN-END:variables
}
