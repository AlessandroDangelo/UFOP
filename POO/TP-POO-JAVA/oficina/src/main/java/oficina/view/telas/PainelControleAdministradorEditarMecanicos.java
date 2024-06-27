/*
 * Tela PainelControleAdministradorEditarMecanicos
 * Tela base para edicao de dados de mecanicos.
*/
package oficina.view.telas;

import oficina.model.finals.Oficina;

public class PainelControleAdministradorEditarMecanicos extends javax.swing.JFrame
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
        public PainelControleAdministradorEditarMecanicos(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
        }
        
        /*
         * Metodos Especiais
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
     * Atributos e funcionalidades importantes ao deslinde da classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        lOptions = new javax.swing.JLabel();
        bBuscarMecanicoCPF = new javax.swing.JButton();
        bCadastrarNovoVendedor = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Editar Dados de Mecânicos");

        lOptions.setText("Escolha uma opção:");

        bBuscarMecanicoCPF.setText("Buscar Mecânico por CPF");
        bBuscarMecanicoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarMecanicoCPFActionPerformed(evt);
            }
        });

        bCadastrarNovoVendedor.setText("Cadastrar novo Mecanico");
        bCadastrarNovoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarNovoVendedorActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lOptions)
                    .addComponent(txtTitulo)
                    .addComponent(bBuscarMecanicoCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCadastrarNovoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addComponent(lOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscarMecanicoCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCadastrarNovoVendedor)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarNovoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarNovoVendedorActionPerformed
       
        // cadastrar novo vendedor
        PainelControleAdministradorEditarMecanicosCadastrar painelControleAdministradorEditarMecanicosCadastrar = new PainelControleAdministradorEditarMecanicosCadastrar( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarMecanicosCadastrar.setVisible(true);
        
    }//GEN-LAST:event_bCadastrarNovoVendedorActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorma ao painel de controle do administrador
        PainelControleAdministrador painelControleAdministrador = new PainelControleAdministrador( this.getOficina()  );
        this.setVisible(false);
        painelControleAdministrador.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bBuscarMecanicoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarMecanicoCPFActionPerformed
        
        // buscar mecanico por CPF
        PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF painelControleAdministradorEditarMecanicosBuscaMecanicoCPF = new PainelControleAdministradorEditarMecanicosBuscaMecanicoCPF( this.getOficina() );
        this.setVisible(false);
        painelControleAdministradorEditarMecanicosBuscaMecanicoCPF.setVisible(true);
        
    }//GEN-LAST:event_bBuscarMecanicoCPFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarMecanicoCPF;
    private javax.swing.JButton bCadastrarNovoVendedor;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lOptions;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
