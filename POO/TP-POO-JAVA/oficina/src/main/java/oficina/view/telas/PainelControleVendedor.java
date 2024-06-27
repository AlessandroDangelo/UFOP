/*
 * Tela PainelControleVendedor
 * Tela inicial para vendedores logados.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleVendedor extends javax.swing.JFrame
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
        public PainelControleVendedor(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Funcionalidades adicionais a classe.
        */
            /*
             * Carrega os dados do vendedor
             * Carrega as informacoes essenciais a tela referente ao Vendedor.
            */
            public final void load()
            {
                this.txtDescricao.setText( "Seja bem vindo Sr. " + this.getOficina().getVendedor().getNome() );
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

        txtTitulo = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();
        txtDescricao = new javax.swing.JLabel();
        lopcoes = new javax.swing.JLabel();
        bCadastrarCliente = new javax.swing.JButton();
        bCadastrarVeiculoCliente = new javax.swing.JButton();
        bCadastrarOrdemServico = new javax.swing.JButton();
        bAprovarOrdemServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Painel de Controle do Vendedor");

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        txtDescricao.setText("Carregando...");

        lopcoes.setText("Escolha uma opção:");

        bCadastrarCliente.setText("Cadastrar Cliente");
        bCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarClienteActionPerformed(evt);
            }
        });

        bCadastrarVeiculoCliente.setText("Cadastrar Veículo do Cliente");
        bCadastrarVeiculoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarVeiculoClienteActionPerformed(evt);
            }
        });

        bCadastrarOrdemServico.setText("Cadastrar Ordem de Serviço");
        bCadastrarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarOrdemServicoActionPerformed(evt);
            }
        });

        bAprovarOrdemServico.setText("Aprovar ou Fechar Ordem de Serviço");
        bAprovarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprovarOrdemServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(bSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lopcoes)
                            .addComponent(txtDescricao)
                            .addComponent(bCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCadastrarVeiculoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCadastrarOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(bAprovarOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao)
                .addGap(29, 29, 29)
                .addComponent(lopcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrarVeiculoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrarOrdemServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAprovarOrdemServico)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        
        // retorna a tela de login
        Login login = new Login( this.getOficina() );
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_bSairActionPerformed

    private void bCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarClienteActionPerformed
        
        // abre a tela de cadastrar cliente
        PainelControleVendedorCadastrarCliente painelControleVendedorCadastrarCliente = new PainelControleVendedorCadastrarCliente( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorCadastrarCliente.setVisible(true);
        
    }//GEN-LAST:event_bCadastrarClienteActionPerformed

    private void bCadastrarVeiculoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarVeiculoClienteActionPerformed
       
        // abre a tela
        PainelControleVendedorCadastrarVeiculo painelControleVendedorCadastrarVeiculo = new PainelControleVendedorCadastrarVeiculo( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorCadastrarVeiculo.setVisible(true);
        
    }//GEN-LAST:event_bCadastrarVeiculoClienteActionPerformed

    private void bCadastrarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarOrdemServicoActionPerformed
        
        // abre a tela de cadastro de ordem de servico
        PainelControleVendedorCadastrarOrdemServico painelControleVendedorCadastrarOrdemServico = new PainelControleVendedorCadastrarOrdemServico( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorCadastrarOrdemServico.setVisible(true);
        
    }//GEN-LAST:event_bCadastrarOrdemServicoActionPerformed

    private void bAprovarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAprovarOrdemServicoActionPerformed
       
        PainelControleVendedorAprovarOrdem painelControleVendedorAprovarOrdem = new PainelControleVendedorAprovarOrdem( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorAprovarOrdem.setVisible(true);
    }//GEN-LAST:event_bAprovarOrdemServicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAprovarOrdemServico;
    private javax.swing.JButton bCadastrarCliente;
    private javax.swing.JButton bCadastrarOrdemServico;
    private javax.swing.JButton bCadastrarVeiculoCliente;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel lopcoes;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
