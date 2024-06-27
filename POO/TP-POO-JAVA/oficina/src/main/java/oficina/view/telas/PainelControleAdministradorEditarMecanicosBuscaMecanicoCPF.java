/*
 * Tela PainelControleAdministarEditarMecanicosBuscaMecanicoCPF
 * Tela para busca e alterações de informações de Mecanicos pelo CPF.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Mecanico;

public class PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazenam dados e estruturas.
    */
        /*
         * oficina
         * Referencia a instancia da oficina em uso.
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
        public PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF(Oficina oficina)
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
     * Atributos e funcionalidades adicionais
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lCpf = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Buscar Mecânico pelo CPF");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        lCpf.setText("CPF:");

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTitulo)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCpf))
                    .addComponent(bVoltar))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bVoltar)
                .addGap(2, 2, 2)
                .addComponent(txtTitulo)
                .addGap(29, 29, 29)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        // variaveis auxiliares
        Mecanico mecanico;
        
        // tenta realizar a busca
        mecanico = this.getOficina().buscaMecanicoCpf( this.txtCpf.getText() );
        
        // verifica se o mecanico foi encontrado
        if( mecanico != null ){
            
            // mecanico localizado com sucesso
            this.getOficina().setMecanico(mecanico);
            
            // chama a tela
            PainelControleAdministradorEditarMecanicosMecanicoEncontrado painelControleAdministradorEditarMecanicosMecanicoEncontrado = new PainelControleAdministradorEditarMecanicosMecanicoEncontrado( this.getOficina() );
            this.setVisible(false);
            painelControleAdministradorEditarMecanicosMecanicoEncontrado.setVisible(true);
            
        } else {
            
            // falha ao encontrar mecanico
            JOptionPane.showMessageDialog(null, "Nenhum mecanico foi encontrado com o CPF informado!");
            
        }
        
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna a edicao de dados de mecanicos
        PainelControleAdministradorEditarMecanicos painelControleEditarMecanicos = new PainelControleAdministradorEditarMecanicos( this.getOficina() );
        this.setVisible(false);
        painelControleEditarMecanicos.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCpf;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
