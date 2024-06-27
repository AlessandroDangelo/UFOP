/*
 * Tela PainelControleAdministradorEditarVendedoresCadastrar
 * Tela para cadastro de novos vendedores ao sistema.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Vendedor;
import oficina.model.finals.Data;
import oficina.model.finals.Usuario;

public class PainelControleAdministradorEditarVendedoresCadastrar extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a instancia da oficina em uso.
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
        public PainelControleAdministradorEditarVendedoresCadastrar(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
        }
        
        /*
         * Metodos adicionais
         * Implementam recursos adicionais a classe.
        */
            /*
             * clear()
             * Limpa os dados do formulario.
            */
            public void clear()
            {   
                // limpa todos os dados pessoais do formulario
                this.txtNome.setText("");
                this.txtEndereco.setText("");
                this.txtTelefone.setText("");
                this.txtCpf.setText("");
                this.txtDia.setText("");
                this.txtMes.setText("");
                this.txtAno.setText("");
                this.txtEmail.setText("");
                this.txtSenha.setText("");
                
                // mantem os dados nao pessoais para facilitar reuso
                //this.txtSalario.setText("");
                //this.txtRegime.setText("");
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
     * Atributos e metodos essenciais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
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
        bCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Novo Vendedor");

        lNome.setText("Nome:");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lEndereco.setText("Endereço:");

        lTelefone.setText("Telefone:");

        lCpf.setText("CPF:");

        lDia.setText("Dia do Nascimento:");

        lMes.setText("Mes do Nascimento:");

        lAno.setText("Ano do Nascimento:");

        lEmail.setText("Email:");

        lSenha.setText("Senha:");

        lSalario.setText("Salário:");

        lRegime.setText("Regime:");

        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bCadastrar)
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
                                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(txtRegime))))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bVoltar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lRegime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        
        // variaveis auxiliares
        Vendedor vendedor;
        int retorno;
        
        // cadastrar novo vendedor
            // verifica se as entradas sao validas
                // nome
                if( this.txtNome.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o nome do Vendedor.");
                    return;
                }
                
                // endereco
                if( this.txtEndereco.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o endereço do Vendedor.");
                    return;
                }
                
                // telefone
                if( this.txtEndereco.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o telefone do Vendedor.");
                    return;
                }
                
                // cpf
                if( this.txtCpf.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o CPF do Vendedor.");
                    return;
                } else {
                    
                    // verifica se ja existe um vendedor com o mesmo cpf
                    if( this.getOficina().buscaVendedorCpf( this.txtCpf.getText() ) != null  ){
                        
                        JOptionPane.showMessageDialog(null, "Ja existe um vendedor cadastrado com esse CPF!");
                        return;
                        
                    }
                    
                }
                
                
                // dia do nascimento
                if( this.txtDia.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o dia de nascimento do Vendedor.");
                    return;
                }
                
                // mes do nascimento
                if( this.txtMes.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o mes de nascimento do Vendedor.");
                    return;
                }
                
                // ano do nascimento
                if( this.txtAno.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o ano de nascimento do Vendedor.");
                    return;
                }
                
                // email
                if( this.txtEmail.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira o email do Vendedor.");
                    return;
                } else {
                    
                    // verifica se existe um vendedor com o mesmo email
                    if( this.getOficina().buscaVendedorEmail( this.txtEmail.getText() ) != null ){
                        
                        JOptionPane.showMessageDialog(null, "Ja existe um vendedor cadastrado com esse e-mail.");
                        return;
                    }
                    
                }
                
                // senha
                if( this.txtSenha.getText().length() == 0 ){
                    JOptionPane.showMessageDialog(null, "Primeiro, insira a senha do Vendedor.");
                    return;
                }
                
            // cria novo vendedor
                vendedor = new Vendedor(
                    this.txtNome.getText(),
                    this.txtEndereco.getText(),
                    this.txtTelefone.getText(),
                    this.txtCpf.getText(),
                    new Data(
                        Integer.parseInt( this.txtDia.getText() ),
                        Integer.parseInt( this.txtMes.getText() ),
                        Integer.parseInt( this.txtAno.getText() )
                    ),
                    new Usuario(
                       this.txtEmail.getText(),
                       this.txtSenha.getText(),
                       2
                    ),
                    Double.parseDouble( this.txtSalario.getText()  ),
                    Integer.parseInt(  this.txtRegime.getText() )
                );
                
            // insere o novo vendedor no sistema
                retorno = this.getOficina().inserirVendedor(vendedor);
                vendedor = null;
                
            // trata retorno
                if( retorno == 1 ){
                    
                    // vendedor inserido com sucesso
                    JOptionPane.showMessageDialog(null, "Vendedor inserido com sucesso!");
                    this.clear();
                    
                } else {
                
                    // falha na insersao do vendedor
                    JOptionPane.showMessageDialog(null, "Erro ao inserir vendedor!");
                    
                }
                
        
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // volta a tela de editar dados de vendedores
        PainelControleAdministradorEditarVendedores painelControleAdministradorEditarVendedores = new PainelControleAdministradorEditarVendedores( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarVendedores.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
