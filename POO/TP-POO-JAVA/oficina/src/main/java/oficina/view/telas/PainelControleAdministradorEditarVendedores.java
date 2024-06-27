/*
 * Tela Painel de Controle Editar Vendedores
 * Tela para recursos para edicao de venedores.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleAdministradorEditarVendedores extends javax.swing.JFrame
{   
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a instancia da oficina.
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
        public PainelControleAdministradorEditarVendedores(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
        }
        
        /*
         * Metodos especiais
         * Getters e Setters
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
     * Atributos e metodos adicionais e essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bVoltar = new javax.swing.JButton();
        txtOpcoes = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        bBuscarVendedorCPF = new javax.swing.JButton();
        bCadastrarNovoVendedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        txtOpcoes.setText("Escolha uma opção:");

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Editar Dados de Vendedores");

        bBuscarVendedorCPF.setText("Buscar Vendedor por CPF");
        bBuscarVendedorCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarVendedorCPFActionPerformed(evt);
            }
        });

        bCadastrarNovoVendedor.setText("Cadastrar novo Vendedor");
        bCadastrarNovoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarNovoVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitulo)
                    .addComponent(txtOpcoes)
                    .addComponent(bBuscarVendedorCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCadastrarNovoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addGap(10, 10, 10)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addComponent(txtOpcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscarVendedorCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCadastrarNovoVendedor)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // volta ao painel de controle do administrador
        PainelControleAdministrador painelControleAdministrador = new PainelControleAdministrador( this.getOficina() );
        this.setVisible(false);
        painelControleAdministrador.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bBuscarVendedorCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarVendedorCPFActionPerformed
        
        // abre a tela de busca de vendedor por CPF
        PainelControleAdministradorEditarVendedoresBuscaVendedorCPF painelControleAdministradorEditarVendedoresBuscaVendedorCPF = new PainelControleAdministradorEditarVendedoresBuscaVendedorCPF( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarVendedoresBuscaVendedorCPF.setVisible(true);
        
    }//GEN-LAST:event_bBuscarVendedorCPFActionPerformed

    private void bCadastrarNovoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarNovoVendedorActionPerformed
        
        // cadastrar novo vendedor
        PainelControleAdministradorEditarVendedoresCadastrar painelControleAdministradorEditarVendedores = new PainelControleAdministradorEditarVendedoresCadastrar( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarVendedores.setVisible(true);
        
    }//GEN-LAST:event_bCadastrarNovoVendedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarVendedorCPF;
    private javax.swing.JButton bCadastrarNovoVendedor;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel txtOpcoes;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
