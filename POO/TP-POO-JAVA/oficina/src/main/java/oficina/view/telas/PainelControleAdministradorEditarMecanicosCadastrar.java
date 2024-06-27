/*
 * Tela PainelControleAdministradorEditarMecanicosCadastrar
 * Tela para cadastro de novos mecanicos no sistema.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Mecanico;
import oficina.model.finals.Usuario;
import oficina.model.finals.Data;

public class PainelControleAdministradorEditarMecanicosCadastrar extends javax.swing.JFrame
{
    /*
     * Atributos
     * Dados e estruturas.
    */
        /*
         * oficina
         * Referencia a instancia da oficina.
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
        public PainelControleAdministradorEditarMecanicosCadastrar(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
        }
        
        /*
         * Metodos adicionais
         * Funcionalidades adicionais a classe.
        */
            /*
             * clear()
             * Limpa todos os dados ja preenchidos no formulario.
            */
            public void clear()
            {   
                // limpa dodos pessoais
                this.txtNome.setText("");
                this.txtEndereco.setText("");
                this.txtTelefone.setText("");
                this.txtCpf.setText("");
                this.txtDia.setText("");
                this.txtMes.setText("");
                this.txtAno.setText("");
                this.txtEmail.setText("");
                this.txtSenha.setText("");
                
                // mantem dados de salario
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
     * Metodos adicionais
     * Atributos e funcionalidades adicionais.
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
        bCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Cadastrar Novo Mecânico");

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(bVoltar))
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
                            .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtSenha)
                            .addComponent(txtSalario)
                            .addComponent(txtRegime))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addComponent(bCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // retorna a tela de edicao de mecanicos
        PainelControleAdministradorEditarMecanicos painelControleAdministradorEditarMecanicos = new PainelControleAdministradorEditarMecanicos( this.getOficina()  );
        this.setVisible(false);
        painelControleAdministradorEditarMecanicos.setVisible(true);
        
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        
        // variaveis auxiliares
        Mecanico mecanico;
        int retorno;
        
        // verifica se as entradas sao validas.
            // nome
            if( this.txtNome.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o nome do Mecânico.");
                return;
            }
            
            // endereco
            if( this.txtEndereco.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o endereço do Mecânico.");
                return;
            }
            
            // telefone
            if( this.txtTelefone.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o telefone do Mecânico.");
                return;
            }
            
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o CPF do Mecânico.");
                return;
            } else {
                
                // verifica se nao existe nenhum mecanico com o mesmo CPF
                if( this.getOficina().buscaMecanicoCpf( this.txtCpf.getText()  ) != null ){
                    JOptionPane.showMessageDialog(null, "Já existe um Mecânico com esse CPF.");
                    return;
                }
                
            }
            
            // dia
            if( this.txtDia.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o dia do nascimento do Mecânico.");
                return;
            }
            
            // mes
            if( this.txtMes.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o mês do nascimento do Mecânico.");
                return;
            }
            
            // ano
            if( this.txtAno.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o ano do nascimento do Mecânico.");
                return;
            }
            
            // email
            if( this.txtEmail.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o e-mail do Mecânico.");
                return;
            } else {
                
                // verifica se ja existe um mecanico com o email
                if( this.getOficina().buscaMecanicoEmail( this.txtEmail.getText() ) != null ){
                    JOptionPane.showMessageDialog(null, "Ja existe um Mecânico com esse e-mail!");
                    return;
                }
                
            }
            
            // senha
            if( this.txtSenha.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira a senha do Mecânico.");
                return;
            }
            
            // salario
            if( this.txtSalario.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o salario do Mecânico.");
                return;
            }
            
            // regime
            if( this.txtRegime.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o regime do Mecânico.");
                return;
            }
            
        // cria o novo Mecanico
        mecanico = new Mecanico(
            this.txtNome.getText(),
            this.txtEndereco.getText(),
            this.txtTelefone.getText(),
            this.txtCpf.getText(),
            new Data(
                Integer.parseInt( this.txtDia.getText()  ),
                Integer.parseInt( this.txtMes.getText() ),
                Integer.parseInt( this.txtAno.getText()  )
            ),
            new Usuario(
                this.txtEmail.getText(),
                this.txtSenha.getText(),
                3
            ),
            Double.parseDouble( this.txtSalario.getText()  ),
            Integer.parseInt( this.txtRegime.getText()  )
        );
        
        // insere o novo mecanico
        retorno = this.getOficina().inserirMecanico(mecanico);
        mecanico = null;
        
        // verifica se o mecanico foi inserido com sucesso
        if( retorno == 1 ){
            JOptionPane.showMessageDialog(null, "Mecânico inserido com sucesso!");
            this.clear();
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao inserir Mecânico!");
        }
        
    }//GEN-LAST:event_bCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
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
