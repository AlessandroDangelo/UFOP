/*
 * Tela PainelControleAdministradorEditarMecanicosMecanicoEncontrado
 * Tela para edicao de dados de mecanico.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;

public class PainelControleAdministradorEditarMecanicosMecanicoEncontrado extends javax.swing.JFrame 
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
        public PainelControleAdministradorEditarMecanicosMecanicoEncontrado(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Implementam recuros adicionais a classe.
        */
            /*
             * load()
             * Carrega todos os dados do mecanico para os campos do formulario.
            */
            public final void load()
            {
                this.txtNome.setText( this.getOficina().getMecanico().getNome()  );
                this.txtEndereco.setText( this.getOficina().getMecanico().getEndereco() );
                this.txtTelefone.setText( this.getOficina().getMecanico().getTelefone() );
                this.txtCpf.setText( this.getOficina().getMecanico().getCpf() );
                this.txtDia.setText( Integer.toString( this.getOficina().getMecanico().getDataNascimento().getDia() ) );
                this.txtMes.setText( Integer.toString( this.getOficina().getMecanico().getDataNascimento().getMes()  ) );
                this.txtAno.setText( Integer.toString( this.getOficina().getMecanico().getDataNascimento().getAno()  )  );
                this.txtEmail.setText( this.getOficina().getMecanico().getUsuario().getEmail() );
                this.txtSenha.setText( this.getOficina().getMecanico().getUsuario().getSenha()  );
                this.txtSalario.setText( Double.toString( this.getOficina().getMecanico().getSalario()  )  );
                this.txtRegime.setText( Integer.toString( this.getOficina().getMecanico().getRegime()  )  );
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
     * Atributos e metodos essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
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
        lSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lRegime = new javax.swing.JLabel();
        txtRegime = new javax.swing.JTextField();
        bAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Editar dados de Mecânicos");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lNome.setText("Nome:");

        lEndereco.setText("Endereço:");

        lTelefone.setText("Telefone:");

        lCpf.setText("CPF:");

        lDia.setText("Dia do Nascimento:");

        lMes.setText("Mês do Nascimento:");

        lAno.setText("Ano do Nascimento:");

        lEmail.setText("Email:");

        lSenha.setText("Senha:");

        lSalario.setText("Salario:");

        lRegime.setText("Regime:");

        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bAtualizar)
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtTitulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                            .addComponent(bVoltar))
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
                        .addComponent(txtRegime)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTitulo)
                    .addComponent(bVoltar))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna a busca de mecanicos por CPF
        PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF painelControleAdministradorEditarMecanicosBuscaMecanicoCPF = new PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarMecanicosBuscaMecanicoCPF.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        
        // verifica a entrada
            // nome
            if( this.txtNome.getText().length() == 0  ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o nome do Mecânico.");
                return ;
            }
            
            // endereco
            if( this.txtEndereco.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o endereço do Mecânico.");
                return ;
            }
            
            // telefone
            if( this.txtTelefone.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o telefone do Mecânico.");
                return ;
            }
            
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o CPF do Mecânico.");
                return ;
            } else {
                
                // verifica se existe outro mecanico com mesmo cpf
                if( this.getOficina().getMecanico().getCpf().compareTo( this.txtCpf.getText()  ) != 0 ){
                    if( this.getOficina().buscaMecanicoCpf( this.txtCpf.getText() ) != null  ){
                       
                        JOptionPane.showMessageDialog(null, "Ja existe um mecânico com o mesmo CPF.");
                        return ;
                    }
                }
                
            }
            
            // dia do nascimento
            if( this.txtDia.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o dia do nascimento do Mecânico.");
                return ;
            }
            
            // mes do nascimento
            if( this.txtMes.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o mês do nascimento do Mecânico.");
                return ;
            }
            
            // ano do nascimento
            if( this.txtAno.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o ano do nascimento do Mecânico.");
                return ;
            }
            
            // email
            if( this.txtEmail.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o email do Mecânico.");
                return ;
            } else {
                
                // verifica se existe outro mecanico com o email
                if( this.getOficina().getMecanico().getUsuario().getEmail().compareTo( this.txtEmail.getText() ) != 0 ){
                    if( this.getOficina().buscaMecanicoEmail( this.txtEmail.getText()  ) != null ){
                        
                        JOptionPane.showMessageDialog(null, "Ja existe um outro mecânico com esse e-mail.");
                        return ;
                        
                    }
                }
                
            }
            
            // senha
            if( this.txtSenha.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira a senha do Mecânico.");
                return ;
            }
            
            // salario
            if( this.txtSalario.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o salario do Mecânico.");
                return ;
            }
            
            // regime
            if( this.txtRegime.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Para atualizar, insira o regime do Mecânico.");
                return ;
            }
            
        // atualiza as entradas
            this.getOficina().getMecanico().setNome( this.txtNome.getText()  );
            this.getOficina().getMecanico().setEndereco( this.txtEndereco.getText()  );
            this.getOficina().getMecanico().setTelefone( this.txtTelefone.getText()  );
            this.getOficina().getMecanico().setCpf( this.txtCpf.getText()  );
            this.getOficina().getMecanico().getDataNascimento().setDia( Integer.parseInt( this.txtDia.getText()  )  );
            this.getOficina().getMecanico().getDataNascimento().setMes( Integer.parseInt( this.txtMes.getText() )  );
            this.getOficina().getMecanico().getDataNascimento().setAno( Integer.parseInt( this.txtAno.getText()  ) );
            this.getOficina().getMecanico().getUsuario().setEmail( this.txtEmail.getText() );
            this.getOficina().getMecanico().getUsuario().setSenha( this.txtSenha.getText() );
            this.getOficina().getMecanico().setSalario( Double.parseDouble( this.txtSalario.getText()  ));
            this.getOficina().getMecanico().setRegime( Integer.parseInt( this.txtRegime.getText() )  );
            
        // avisa que atualizacao foi realizada com sucesso
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
            this.load();
            
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
