/*
 * Tela PainelControleVendedorCadastrarVeiculo
 * Permite o cadastro de veiculos a clientes.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;

import oficina.model.finals.Oficina;
import oficina.model.finals.Cliente;

public class PainelControleVendedorCadastrarVeiculo extends javax.swing.JFrame {
    
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
        public PainelControleVendedorCadastrarVeiculo(Oficina oficina)
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
             * Metodos acesssores de atributos.
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
     * Atributos e funções adicionais insdispensáveis a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        bVoltar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Cadastrar Veículo de Cliente");

        lCpf.setText("CPF do Cliente:");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lCpf)
                        .addComponent(txtTitulo)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addGap(3, 3, 3)
                .addComponent(txtTitulo)
                .addGap(57, 57, 57)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar)
                .addContainerGap(110, Short.MAX_VALUE))
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

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        // variaveis auxiliares
        Cliente cliente;
        
        // verifica as entradas
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, informe o CPF do cliente.");
                return ;
            }
            
        // busca pelo cliente
        cliente = this.getOficina().buscaClienteCpf( this.txtCpf.getText() );
        
        // verifica se o cliente foi encontrado
        if( cliente != null ){
            
            // leva o cliente para o topo
            this.getOficina().setCliente(cliente);
            
            // chama a tela de cadastro de veiculo
            PainelControleVendedorCadastrarVeiculoClienteEncontrado painelControleVendedorCadastrarVeiculoClienteEncontrado = new PainelControleVendedorCadastrarVeiculoClienteEncontrado( this.getOficina() );
            this.setVisible(false);
            painelControleVendedorCadastrarVeiculoClienteEncontrado.setVisible(true);
            
        } else {
            
            // cliente nao foi localizado
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi encontrado com o CPF informado.");
            
        }
        
    }//GEN-LAST:event_bBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCpf;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
