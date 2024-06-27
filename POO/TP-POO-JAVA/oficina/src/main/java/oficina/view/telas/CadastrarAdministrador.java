/*
 * Tela Cadastro de Administrador
 * Tela abstrai o cadastro de administrador.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.*;

public class CadastrarAdministrador extends javax.swing.JFrame
{   
    /*
     * Atributos
     * Armazena os atributos da classe.
    */
        /*
         * oficina
         * Armazena o sistema da oficina.
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
        public CadastrarAdministrador()
        {   
            initComponents();
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
     * Recursos do ambiente
     * Recursos do ambiente da classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        bCadastrar = new javax.swing.JButton();
        lSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        diaNascimento = new javax.swing.JTextField();
        lDia = new javax.swing.JLabel();
        lMes = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JTextField();
        lAno = new javax.swing.JLabel();
        anoNascimento = new javax.swing.JTextField();
        lSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lRegime = new javax.swing.JLabel();
        txtRegime = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Cadastrar Administrador Mestre");

        lNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lEndereco.setText("Endereço:");

        lTelefone.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lCpf.setText("CPF:");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        lEmail.setText("Email:");

        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        lSenha.setText("Senha:");

        diaNascimento.setToolTipText("");
        diaNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        diaNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaNascimentoActionPerformed(evt);
            }
        });

        lDia.setText("Dia de Nascimento:");

        lMes.setText("Mês de Nascimento:");

        mesNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesNascimentoActionPerformed(evt);
            }
        });

        lAno.setText("Ano Nascimento:");

        anoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoNascimentoActionPerformed(evt);
            }
        });

        lSalario.setText("Salário:");

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        lRegime.setText("Regime:");

        txtRegime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bCadastrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lRegime)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(lTelefone)
                            .addComponent(lEndereco)
                            .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(txtEndereco)
                            .addComponent(txtTelefone)
                            .addComponent(lDia)
                            .addComponent(diaNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lMes)
                            .addComponent(mesNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lAno)
                            .addComponent(anoNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lSalario)
                            .addComponent(txtSalario)))
                    .addComponent(txtRegime, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lRegime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(bCadastrar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        // variaveis auxiliares
        int dia, mes, ano;
        
        // nome invalido
        if( txtNome.getText().length() == 0  ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o nome do Administrador.");
            return ;
        }
        
        // endereco invalido
        if( txtEndereco.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o endereco do Administrador.");
            return ;
        }
        
        // telefone invalido
        if( txtTelefone.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o telefone do Administrador.");
            return ;
        }
        
        // cpf invalido
        if( txtCpf.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o CPF do Administrador.");
            return ;
        }
        
        // email invalido
        if( txtEmail.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o e-mail do Administrador.");
            return ;
        }
        
        // senha invalida
        if( txtSenha.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira a senha do Administrador.");
            return ;
        }
        
        // verifica o dia de nascimento
        if( diaNascimento.getText().length() == 0 ){
            
            // dia de nascimento nao inserido
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o dia de nascimento do Administrador.");
            return ;
            
        } else {
            
            // calcula dia
            dia = Integer.parseInt(diaNascimento.getText());
            
            // verifica o dia
            if( dia < 1 || dia > 31 ){
                
                // dia invalido
                JOptionPane.showMessageDialog(null, "Dia de nascimento do Administrador inválido.");
                return ;
                
            }
        }
        
        // verifica o mes de nascimento
        if( mesNascimento.getText().length() == 0 ){
            
            // mes de nascimento nao inserido
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o mes de nascimento do Administrador.");
            return;
            
        } else {
            
            // calcula mes
            mes = Integer.parseInt(mesNascimento.getText());
            
            // verifica o mes
            if( mes < 1 || mes > 12){
                
                JOptionPane.showMessageDialog(null, "Mês de nascimento do Administrador inválido.");
                return ;
            }   
                    
        }
        
        // verifica ano de administrador
        if( anoNascimento.getText().length() == 0 ){
            
            // ano de nascimento nao inserido
            JOptionPane.showMessageDialog(null, "Para cadastrar, insira o ano de nascimento do Administrador.");
            return;
            
            
        } else {
            
            // calcula ano
            ano = Integer.parseInt(anoNascimento.getText());
           
        }
        
        // verificia mes de fevereiro
        if( mes == 2 && dia > 28 ){
            JOptionPane.showInputDialog(null, "Data de nascimento inválida.");
            return ;
        }
        
        // verifica o salario
        if( this.txtSalario.getText().length() == 0 ){
            JOptionPane.showInputDialog(null, "Primeiro, informe o salario do Administrador.");
            return ;
        }
        
        // verifica o regime
        if( this.txtRegime.getText().length() == 0 ){
            JOptionPane.showInputDialog(null, "Primeiro, informe o regime de trabalho do Administrador.");
            return ;
        }
        
        
        // cadastra novo administrador
        int retorno = this.getOficina().inserirAdministrador( 
                new Administrador(
                        txtNome.getText(),
                        txtEndereco.getText(),
                        txtTelefone.getText(),
                        txtCpf.getText(),
                        new Data(dia, mes, ano),
                        new Usuario(txtEmail.getText(), txtSenha.getText(), 1),
                        Double.parseDouble( this.txtSalario.getText() ),
                        Integer.parseInt( this.txtRegime.getText() )
                ) 
            
        );
        
        // verifica se o administrador foi inserido com sucesso
        if( retorno == 1 ){
            
            // administrador cadastrado com sucesso.
            CadastrarAdministradorSucesso cadastrarAdministradorSucesso = new CadastrarAdministradorSucesso( this.getOficina() );
            this.setVisible(false);
            cadastrarAdministradorSucesso.setVisible(true);
            
        } else {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Administrador. ( " + retorno + " ) " ); 
        }
        
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void diaNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaNascimentoActionPerformed

    private void mesNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesNascimentoActionPerformed
  
    private void anoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoNascimentoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtRegimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegimeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoNascimento;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JTextField diaNascimento;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lMes;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lRegime;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JTextField mesNascimento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegime;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
