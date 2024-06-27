/*
 * Tela PainelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado
 * Tela para edicao de dados de vendedor.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Vendedor;

public class PainelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado extends javax.swing.JFrame
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
        public PainelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * load()
         * Carrega os dados do venedor.
        */
        public final void load()
        {
            // carrega o nome
            this.txtNome.setText( this.getOficina().getVendedor().getNome() );
            
            // carega o endereco
            this.txtEndereco.setText( this.getOficina().getVendedor().getEndereco() );
            
            // carrega o telefone
            this.txtTelefone.setText( this.getOficina().getVendedor().getTelefone()  );
            
            // carrega o dia do nascimento
            this.txtDia.setText( Integer.toString( this.getOficina().getVendedor().getDataNascimento().getDia()) );
            
            // carrega o mes do nascimento
            this.txtMes.setText( Integer.toString( this.getOficina().getVendedor().getDataNascimento().getMes() ) );
            
            // carrega o ano do nascimento
            this.txtAno.setText( Integer.toString( this.getOficina().getVendedor().getDataNascimento().getAno() ) );
            
            // carrega o cpf do venedor
            this.txtCpf.setText( this.getOficina().getVendedor().getCpf() );
            
            // carrega o email do usuario
            this.txtEmail.setText( this.getOficina().getVendedor().getUsuario().getEmail() );
            
            // carrega a senha do usuario
            this.txtSenha.setText( this.getOficina().getVendedor().getUsuario().getSenha()  );
            
            // carrega salario do vendedor
            this.txtSalario.setText( Double.toString( this.getOficina().getVendedor().getSalario()) );
            
            // carrega o regime do venedor
            this.txtRegime.setText( Integer.toString( this.getOficina().getVendedor().getRegime() ) );
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
     * Recuros adicionais
     * Atributos e funcionalidades
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bVoltar = new javax.swing.JButton();
        lEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lDia = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        bAtualizar = new javax.swing.JButton();
        lSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lRegime = new javax.swing.JLabel();
        txtRegime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Editar dados de Vendedor");

        lNome.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lEndereco.setText("Endereço:");

        lTelefone.setText("Telefone:");

        lCpf.setText("CPF:");

        lDia.setText("Dia de Nascimento:");

        lMes.setText("Mes de Nascimento:");

        lAno.setText("Ano de Nascimento:");

        lEmail.setText("Email:");

        lSenha.setText("Senha:");

        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        lSalario.setText("Salario:");

        lRegime.setText("Regime:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAtualizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lRegime)
                                    .addComponent(lSalario)
                                    .addComponent(lSenha)
                                    .addComponent(lEmail)
                                    .addComponent(lAno)
                                    .addComponent(lMes)
                                    .addComponent(lDia)
                                    .addComponent(lCpf)
                                    .addComponent(lTelefone)
                                    .addComponent(lEndereco)
                                    .addComponent(lNome)
                                    .addComponent(txtNome)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtCpf)
                                    .addComponent(txtDia)
                                    .addComponent(txtMes)
                                    .addComponent(txtAno)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSenha)
                                    .addComponent(txtSalario)
                                    .addComponent(txtRegime, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bVoltar)
                    .addComponent(txtTitulo))
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
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(bAtualizar)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // volta a busca de vendedores
        PainelControleAdministradorEditarVendedoresBuscaVendedorCPF painelControleAdministradorEditarVendedoresBuscaVendedorCPF = new PainelControleAdministradorEditarVendedoresBuscaVendedorCPF( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarVendedoresBuscaVendedorCPF.setVisible(true);
        
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        
        // verifica se os dados inseridos sao validos.
            // nome
            if( this.txtNome.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, escolha o nome do venedor.");
                return ;
            }
            
            // endereco
            if( this.txtEndereco.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, escolha o endereco do venedor.");
                return ;
            }
            
            // telefone
            if( this.txtTelefone.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, escolha o telefone do venedor.");
                return ;
            }
            
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o CPF do venedor.");
                return ;
                
            } else {
                
                // verifica se o cpf e o mesmo do venedor atual
                if( this.txtCpf.getText().compareTo( this.getOficina().getVendedor().getCpf()  ) != 0 ){
                    if( this.getOficina().buscaVendedorCpf( this.txtCpf.getText()  ) != null ){
                        
                        // referencia a cpf de usuario ja cadastrado
                        JOptionPane.showMessageDialog(null, "CPF de vendedor em uso por outro vendedor.");
                        return ;
                    }
                }
                
            }
            
            // dia de nascimento
            if( this.txtDia.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o dia do nascimento do venedor.");
                return ;
            }
            
            // mes de nascimento
            if( this.txtMes.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o mês do nascimento do venedor.");
                return ;
            }
            
            // ano de nascimento
            if( this.txtMes.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o ano do nascimento do venedor.");
                return ;
            }
            
            // email
            if( this.txtEmail.getText().length() == 0 ){
                
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o e-mail do venedor.");
                return ;
                
            } else {
                
                // verifica se ja existe um vendedor com esse email
                if( this.getOficina().getVendedor().getUsuario().getEmail().compareTo( this.txtEmail.getText()  ) != 0 ){
                    if( this.getOficina().buscaVendedorEmail( this.txtEmail.getText() ) != null  ){
                        
                        // ja localizado um vendedor com o mesmo email
                        JOptionPane.showMessageDialog(null, "Email de vendedor em uso por outro vendedor.");
                        return ;
                        
                    }
                }
                
            }
            
            // senha
            if( this.txtSenha.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira a senha do venedor.");
                return ;
            }
            
            // salario
            if( this.txtSalario.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o salario do venedor.");
                return ;
            }
            
            // regime
            if( this.txtRegime.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o regime de trabalho do venedor.");
                return ;
            }
            
        // atualiza os dados
            // nome
            this.getOficina().getVendedor().setNome( this.txtNome.getText()  );
            
            // endereco
            this.getOficina().getVendedor().setEndereco( this.txtEndereco.getText() );
            
            // telefone
            this.getOficina().getVendedor().setTelefone( this.txtTelefone.getText()  );
            
            // cpf
            this.getOficina().getVendedor().setCpf( this.txtCpf.getText() );
            
            // dia do nascimento
            this.getOficina().getVendedor().getDataNascimento().setDia( Integer.parseInt( this.txtDia.getText()  ) );
            
            // mes do nascimento
            this.getOficina().getVendedor().getDataNascimento().setMes( Integer.parseInt( this.txtMes.getText()  ) );
            
            // ano do nascimento
            this.getOficina().getVendedor().getDataNascimento().setAno( Integer.parseInt( this.txtAno.getText()  ) );
            
            // email
            this.getOficina().getVendedor().getUsuario().setEmail( this.txtEmail.getText()  );
            
            // senha
            this.getOficina().getVendedor().getUsuario().setSenha( this.txtSenha.getText() );
            
        // recarrega os novos dados
            this.load();
            
        // avisa que a atualizacao foi efetuada com sucesso
            JOptionPane.showMessageDialog(null, "Dados do vendedor atualizados com sucesso!");
        
    }//GEN-LAST:event_bAtualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bVoltar;
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
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegime;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
