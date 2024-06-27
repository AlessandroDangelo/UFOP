/*
 * Tela PainelControleVendedorCadastrarVeiculoClienteEncontrado
 * Tela que permite adicionar veiculos aos clientes cadastrados.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Veiculo;

public class PainelControleVendedorCadastrarVeiculoClienteEncontrado extends javax.swing.JFrame
{   
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a referencia a oficina.
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
        public PainelControleVendedorCadastrarVeiculoClienteEncontrado(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Acrescentam funcionalidades adicionais.
        */
            /*
             * load()
             * Carrega os dados do cliente para a tela.
            */
            public final void load()
            {
                this.txtNome.setText( this.getOficina().getCliente().getNome()  );
                this.txtCpf.setText( this.getOficina().getCliente().getCpf() );
                this.txtNumVeiculos.setText(  
                    Integer.toString( this.getOficina().getCliente().getListVeiculos().size() )  
                );
            }
            
            /*
             * clear()
             * Limpa os dados do formulario.
            */
            public final void clear()
            {
                this.txtPlaca.setText("");
                this.txtMarca.setText("");
                this.txtModelo.setText("");
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
        txtNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNumVeiculos = new javax.swing.JLabel();
        lPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bCadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Cadastrar Veiculo do Cliente");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lNome.setText("Nome do Cliente:");

        txtNome.setText("Carregando...");

        lCpf.setText("CPF do Cliente:");

        txtCpf.setText("Carregando...");

        jLabel1.setText("Veículos Cadastrados:");

        txtNumVeiculos.setText("Carregando..");

        lPlaca.setText("Placa:");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        lMarca.setText("Marca:");

        lModelo.setText("Modelo:");

        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Dados do Cliente:");

        jLabel3.setText("Dados do Veículo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lModelo)
                                    .addComponent(lMarca)
                                    .addComponent(lPlaca)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bCadastrar)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNumVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lCpf)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(txtCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumVeiculos))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bCadastrar)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // retorna a tela de cadastrar veiculo
        PainelControleVendedorCadastrarVeiculo painelControleVendedorCadastrarVeiculo = new PainelControleVendedorCadastrarVeiculo( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorCadastrarVeiculo.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        
        // variaveis auxiliares
        Veiculo veiculo;
        int retorno;
        
        // verifica se as entradas sao validas
            // placa
            if( this.txtPlaca.getText().length() == 0 ){ 
                JOptionPane.showMessageDialog(null, "Primeiro, insira a placa do Veículo.");
                return ;
            } else {
                
                // verifica se ja existe um veiculo com a mesma placa
                if( this.getOficina().getCliente().buscaVeiculoPlaca( this.txtPlaca.getText() ) != null ) {
                    JOptionPane.showMessageDialog(null, "Veículo já Cadastrado!");
                    return ;
                }
                
            }
            
            // marca
            if( this.txtMarca.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira a marca do Veículo.");
                return ;
            }
            
            // modelo
            if( this.txtModelo.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o modelo do Veículo.");
                return ;
            }
            
        // cria o veiculo
        veiculo = new Veiculo(
            this.txtPlaca.getText(),
            this.txtMarca.getText(),
            this.txtModelo.getText()
        );
        
        // insere o novo veiculo
        retorno = this.getOficina().getCliente().inseririVeiculo(veiculo);
        veiculo = null;
        
        // verifica o retorno
        if( retorno == 1 ){
            
            // veiculo inserido com sucesso
            JOptionPane.showMessageDialog(null, "Veículo inserido com sucesso!");
            this.load();
            this.clear();
            
        } else {
            
            // falha ao inserir veiculo
            JOptionPane.showMessageDialog(null, "Falha ao inserir Veículo.");
            
        }
        
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNumVeiculos;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
