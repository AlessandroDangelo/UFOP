/*
 * Tela PainelControleVendedorCadastrarCliente
 * Permite o cadastro de novos clientes ao sistema.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Cliente;
import oficina.model.finals.Data;

public class PainelControleVendedorCadastrarCliente extends javax.swing.JFrame 
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
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
        public PainelControleVendedorCadastrarCliente(Oficina oficina)
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
             * Limpa as entradas do formulario
            */
            public void clear()
            {
                this.txtNome.setText("");
                this.txtEndereco.setText("");
                this.txtTelefone.setText("");
                this.txtCpf.setText("");
                this.txtDia.setText("");
                this.txtMes.setText("");
                this.txtAno.setText("");
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
        bCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Cadastrar Cliente");

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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bCadastrar))
                            .addComponent(txtMes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(bVoltar))
                            .addComponent(txtDia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lAno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lMes, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
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
                        .addComponent(bVoltar)))
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
                .addGap(18, 18, 18)
                .addComponent(bCadastrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna ao painel de controle do vendedor
        PainelControleVendedor painelControleVendedor = new PainelControleVendedor( this.getOficina() );
        this.setVisible(false);
        painelControleVendedor.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        
        // variaveis auxiliares
        int retorno;
        
        // verifica se as entradas sao validas.
            // nome
            if( this.txtNome.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o nome do Cliente.");
                return;
            }
            
            // endereco
            if( this.txtEndereco.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o endereço do Cliente.");
                return;
            }
            
            // telefone
            if( this.txtTelefone.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o telefone do Cliente.");
                return;
            }
            
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o CPF do Cliente.");
                return;
            } else {
                
                // verifica se ja existe um cliente com o mesmo cpf
                if( this.getOficina().buscaClienteCpf( this.txtCpf.getText() ) != null ){
                    JOptionPane.showMessageDialog(null, "Já existe um cliente cadastrado com esse CPF!");
                    return;
                }
                
            }
            
            // dia do nascimento
            if( this.txtDia.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o dia do nascimento do Cliente.");
                return;
            }
            
            // mes do nascimento
            if( this.txtMes.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o mês do nascimento do Cliente.");
                return;
            }
            
            // ano do nascimento
            if( this.txtAno.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o ano do nascimento do Cliente.");
                return;
            }
                        
        // insere o novo cliente no sistema
        retorno = this.getOficina().inserirCliente(
            new Cliente(
                this.txtNome.getText(),
                this.txtEndereco.getText(),
                this.txtTelefone.getText(),
                this.txtCpf.getText(),
                new Data(
                    Integer.parseInt( this.txtDia.getText() ),
                    Integer.parseInt( this.txtMes.getText() ),
                    Integer.parseInt( this.txtAno.getText() )
                )
            )
        );
        
        // verifica se o cliente foi inserido com sucess
        if( retorno == 1 ){
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
            this.clear();
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao inserir Cliente.");
        }
        
    }//GEN-LAST:event_bCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lMes;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
