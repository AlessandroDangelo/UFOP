/*
 * Tela de Login
 * Tela de acesso a area restrita do sistema.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Administrador;
import oficina.model.finals.Vendedor;
import oficina.model.finals.Mecanico;

public class Login extends javax.swing.JFrame
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
        public Login(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
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
     * Recursos adicionais da classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rTipo = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lSenha = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        rAdministrador = new javax.swing.JRadioButton();
        rVendedor = new javax.swing.JRadioButton();
        rMecanico = new javax.swing.JRadioButton();
        txtTipo = new javax.swing.JLabel();
        bSairDoSistema = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Acesse o Sistema");

        txtDescricao.setText("Entre para utilizar todos os recursos do sistema.");

        lEmail.setText("Email:");

        lSenha.setText("Senha:");

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        rTipo.add(rAdministrador);
        rAdministrador.setText("Administrador");
        rAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAdministradorActionPerformed(evt);
            }
        });

        rTipo.add(rVendedor);
        rVendedor.setText("Vendedor");
        rVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rVendedorActionPerformed(evt);
            }
        });

        rTipo.add(rMecanico);
        rMecanico.setText("Mecânico");
        rMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMecanicoActionPerformed(evt);
            }
        });

        txtTipo.setText("Tipo de Usuário:");

        bSairDoSistema.setText("Sair do Sistema");
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(bSairDoSistema))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTipo)
                        .addComponent(bEntrar)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(rAdministrador)
                            .addGap(38, 38, 38)
                            .addComponent(rVendedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                            .addComponent(rMecanico))
                        .addComponent(lSenha)
                        .addComponent(lEmail)
                        .addComponent(txtDescricao)
                        .addComponent(txtEmail)
                        .addComponent(txtSenha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bSairDoSistema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao)
                .addGap(18, 18, 18)
                .addComponent(txtTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rAdministrador)
                    .addComponent(rVendedor)
                    .addComponent(rMecanico))
                .addGap(18, 18, 18)
                .addComponent(lEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(bEntrar)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
        // variaveis auxiliares
        Administrador administrador;
        Vendedor vendedor;
        Mecanico mecanico;
        
        // verifica se o email foi inserido
        if( this.txtEmail.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Primeiro, insira o e-mail.");
            return ;
        }
        
        // verifica se a senha foi inserida
        if( this.txtSenha.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Primeiro, insira a senha.");
            return ;
        }
        
        // administrador
        if( this.rAdministrador.isSelected() ){
            
            // pesquisa pelo administrador pelo Email
            administrador = this.getOficina().buscaAdministradorEmail(this.txtEmail.getText());
            
            // administrador nao existe
            if( administrador == null ){
                JOptionPane.showMessageDialog(null, "Nenhum Administrador foi localizado com esse e-mail!");
                return ;
            }
            
            // compara as senhas
            if( administrador.getUsuario().getSenha().compareTo(this.txtSenha.getText()) == 0 ){
                
                // senha valida
                    // loga o usuario no sistema.
                    this.getOficina().setUsuarioLogado( administrador.getUsuario() );
                    this.getOficina().setAdministrador( administrador );
                    
                    // inicializa o painel de controle do Administrador
                    PainelControleAdministrador painelControleAdministrador = new PainelControleAdministrador( this.getOficina() );
                    this.setVisible(false);
                    painelControleAdministrador.setVisible(true);
                
            } else {
                
                // senha invalida
                JOptionPane.showMessageDialog(null, "Senha inválida!");
                
            }
            
        // vendedor
        } else if( this.rVendedor.isSelected() ){
            
            // pesquisa pelo vendedor pelo Email
            vendedor = this.getOficina().buscaVendedorEmail(this.txtEmail.getText());
            
            // vendedor nao localizado
            if( vendedor == null ){
                JOptionPane.showMessageDialog(null, "Nenhum Vendedor foi localizado com esse e-mail!");
                return ;
            }
            
            // compara as senhas
            if( vendedor.getUsuario().getSenha().compareTo(this.txtSenha.getText()) == 0 ){
                
                // senha valida
                    // loga o usuario no sistema.
                    this.getOficina().setUsuarioLogado( vendedor.getUsuario() );
                    this.getOficina().setVendedor(vendedor);
                    
                    // inicializa o painel de controle
                    PainelControleVendedor painelControleVendedor = new PainelControleVendedor( this.getOficina() );
                    this.setVisible(false);
                    painelControleVendedor.setVisible(true);
                
            } else {
                
                // senha invalida
                JOptionPane.showMessageDialog(null, "Senha inválida!");
            }
            
        // mecanico
        } else if( this.rMecanico.isSelected() ){
            
            // pesquisa pelo mecanico pelo Email
            mecanico = this.getOficina().buscaMecanicoEmail(this.txtEmail.getText());
            
            // mecanico nao localizado
            if( mecanico == null ){
                JOptionPane.showMessageDialog(null, "Nenhum Mecânico foi localizado com esse e-mail!");
                return ;
            }
            
            // compara as senhas
            if( mecanico.getUsuario().getSenha().compareTo(this.txtSenha.getText()) == 0 ){
                
                // senha valida
                    // loga o usuario no sistema.
                    this.getOficina().setUsuarioLogado( mecanico.getUsuario() );
                    this.getOficina().setMecanico(mecanico);
                    
                    // inicializa o painel de controle
                    PainelControleMecanico painelControleMecanico = new PainelControleMecanico( this.getOficina() );
                    this.setVisible(false);
                    painelControleMecanico.setVisible(true);
                
            } else {
                
                // senha invalida
                JOptionPane.showMessageDialog(null, "Senha inválida!");
                
            }
        
        // nenhuma opcao escolhida
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de usuario.");
        }
    }//GEN-LAST:event_bEntrarActionPerformed

    private void rAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAdministradorActionPerformed

    private void rVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rVendedorActionPerformed

    private void rMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMecanicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMecanicoActionPerformed

    private void bSairDoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairDoSistemaActionPerformed
        
        // sair do sistema
        this.setVisible(false);
        
    }//GEN-LAST:event_bSairDoSistemaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSairDoSistema;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lSenha;
    private javax.swing.JRadioButton rAdministrador;
    private javax.swing.JRadioButton rMecanico;
    private javax.swing.ButtonGroup rTipo;
    private javax.swing.JRadioButton rVendedor;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
