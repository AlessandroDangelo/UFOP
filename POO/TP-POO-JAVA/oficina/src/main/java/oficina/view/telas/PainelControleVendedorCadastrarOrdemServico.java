/*
 * Tela PainelControleVendedorCadastrarOrdemServico
 * Tela de abertura de ordem de servico para cliente e veiculo.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;

import oficina.model.finals.Oficina;
import oficina.model.finals.Cliente;

public class PainelControleVendedorCadastrarOrdemServico extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Armazena referencia a instancia da oficina.
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
        public PainelControleVendedorCadastrarOrdemServico(Oficina oficina) 
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
     * Atributos e funcionalidades adicionais a classe
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bVoltar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Nova Ordem de Serviço");

        lCpf.setText("CPF do Cliente:");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCpf)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtTitulo)))
                .addGap(46, 46, 46)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        // variaveis auxiliares
        Cliente cliente;
        
        // verifica se os dados foram inseridos
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                JOptionPane.showMessageDialog(null, "Primeiro, insira o CPF do Cliente.");
                return ;
            }
            
        // tente localizar o cliente
        cliente = this.getOficina().buscaClienteCpf( this.txtCpf.getText() );
        
        // verifica se o cliente foi encontrado
        if( cliente != null ){
            
            // cliente localizado com sucesso
                // leva o cliente para o topo
                this.getOficina().setCliente(cliente);
                
                // limpa o veiculo do cliente
                this.getOficina().getCliente().setVeiculo(null);
                
                cliente = null;
                        
                // abre a tela de abertua da ordem
                PainelControleVendedorCadastrarOrdemServicoClienteEncontrado painelControleVendedorCadastrarOrdemServicoClienteEncontrado = new PainelControleVendedorCadastrarOrdemServicoClienteEncontrado( this.getOficina() );
                this.setVisible(false);
                painelControleVendedorCadastrarOrdemServicoClienteEncontrado.setVisible(true);
                
        } else {
            
            // cliente não encontrado
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi encontrado com o CPF fornecido!");
            
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // retorna ao painel de controle do vendedor
        PainelControleVendedor painelControleVendedor = new PainelControleVendedor( this.getOficina() );
        this.setVisible(false);
        painelControleVendedor.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCpf;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
