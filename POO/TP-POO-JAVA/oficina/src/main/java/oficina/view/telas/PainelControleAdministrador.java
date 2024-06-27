/*
 * Tela Painel de Controle do Administrador
 * Tela de painel de controle do administrador.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleAdministrador extends javax.swing.JFrame
{   
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazea a instancia da oficina.
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
        public PainelControleAdministrador(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.runWidjet();
        }
        
        /*
         * Metodos especiais
         * Getters e Setters.
        */  
            /*
             * runWidjet
             * Algoritmo que executa o widjet.
            */
            public final void runWidjet()
            {   
                // configura descricao
                this.txtDescricao.setText( "Bem vindo Sr(a). " + this.getOficina().getAdministrador().getNome() );
            }
        
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
     * Recuros adicionais
     * Recursos adicionais essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        bEditarDadosDeVendedores = new javax.swing.JButton();
        bEditarDadosDeMecanicos = new javax.swing.JButton();
        txtOpcoes = new javax.swing.JLabel();
        bSairDoSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Painel de Controle do Administrador");

        txtDescricao.setText("Carregando...");

        bEditarDadosDeVendedores.setText("Editar Dados de Vendedores");
        bEditarDadosDeVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarDadosDeVendedoresActionPerformed(evt);
            }
        });

        bEditarDadosDeMecanicos.setText("Editar Dados de Mecânicos");
        bEditarDadosDeMecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarDadosDeMecanicosActionPerformed(evt);
            }
        });

        txtOpcoes.setText("Escolha uma opção:");

        bSairDoSistema.setText("Sair");
        bSairDoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairDoSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bEditarDadosDeVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addComponent(txtOpcoes)
                        .addComponent(bEditarDadosDeMecanicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(bSairDoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSairDoSistema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao)
                .addGap(33, 33, 33)
                .addComponent(txtOpcoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEditarDadosDeVendedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEditarDadosDeMecanicos)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarDadosDeVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarDadosDeVendedoresActionPerformed
       
        // abre a tela de edicao de dados de vendedores
        PainelControleAdministradorEditarVendedores painelControleAdministrdorEditarVendedores = new PainelControleAdministradorEditarVendedores( this.getOficina() );
        this.setVisible(false);
        painelControleAdministrdorEditarVendedores.setVisible(true);
        
    }//GEN-LAST:event_bEditarDadosDeVendedoresActionPerformed

    private void bEditarDadosDeMecanicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarDadosDeMecanicosActionPerformed
       
        // abre a tela de edicao de mecanicos
        PainelControleAdministradorEditarMecanicos painelControleAdministradorEditarMecanicos = new PainelControleAdministradorEditarMecanicos( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarMecanicos.setVisible(true);
        
    }//GEN-LAST:event_bEditarDadosDeMecanicosActionPerformed

    private void bSairDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairDoSistemaActionPerformed
        
        // retorna a tela de login
        Login login = new Login( this.getOficina() );
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_bSairDoSistemaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditarDadosDeMecanicos;
    private javax.swing.JButton bEditarDadosDeVendedores;
    private javax.swing.JButton bSairDoSistema;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtOpcoes;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
