/*
 * Tela PainelControleAdministradorEditarVendedoresBuscaVendedorCPF
 * Tela para busca de um vendedor atraves do seu CPF.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Vendedor;

public class PainelControleAdministradorEditarVendedoresBuscaVendedorCPF extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazena os atributos da classe.
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
        public PainelControleAdministradorEditarVendedoresBuscaVendedorCPF(Oficina oficina)
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
     * Armazenam atributos e demais recursos da classe oficina.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Busca Vendedor pelo CPF");

        jLabel1.setText("Insira o CPF do vendedor:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(bBuscar))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addGap(2, 2, 2)
                .addComponent(txtTitulo)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // volta a tela de edicao de vendedores
        PainelControleAdministradorEditarVendedores painelControleAdministradorEditarVendedores = new PainelControleAdministradorEditarVendedores( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarVendedores.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
       
        // verifica se o cpf foi inserido
        if( this.txtCpf.getText().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Primeiro, insira o CPF do vendedor.");
            return ;
        }   
        
        // busca pelo vendedor
        Vendedor vendedor = this.getOficina().buscaVendedorCpf( this.txtCpf.getText() );
        
        // verifica se o venedor foi encontrado
        if( vendedor != null ){
            
            // exibe os dados do vendedor encontrado
                // leva ele para o topo da pilha
                this.getOficina().setVendedor(vendedor);
                
                // abre a nova tela
                PainelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado painelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado = new PainelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado( this.getOficina() );
                this.setVisible(false);
                painelControleAdministradorEditarVendedoresBuscaVendedorCPFVendedorEncontrado.setVisible(true);
                
        } else {
            JOptionPane.showMessageDialog(null, "Vendedor não encontrado. Confira os dados e tente novamente!");
        }
        
    }//GEN-LAST:event_bBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
