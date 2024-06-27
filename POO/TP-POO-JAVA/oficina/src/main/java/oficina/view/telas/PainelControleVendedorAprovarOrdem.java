/*
 * Tela PainelControleVendedorAprovarOrdem
 * Aprova ordens pendentes de aprovacao pelo mecanico.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Cliente;
import oficina.model.finals.OrdemServico;
import java.util.*;

public class PainelControleVendedorAprovarOrdem extends javax.swing.JFrame
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
        public PainelControleVendedorAprovarOrdem(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
        }
        
        /*
         * Metodos especiais.
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
     * Recursos adicinais
     * Atributos e metodos adicionais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Aprovar Ordem de Serviço");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVoltar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCpf)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bBuscar)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bVoltar)))
                .addGap(54, 54, 54)
                .addComponent(lCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
       
        // retornar ao painel de controle do vendedor
        PainelControleVendedor painelControleVendedor = new PainelControleVendedor( this.getOficina() );
        this.setVisible(false);
        painelControleVendedor.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        // variaveis auxiliares
        Cliente cliente;
        ArrayList<OrdemServico> listOrdemServicoPendentes;
        
        // verifica as entradas
            // cpf
            if( this.txtCpf.getText().length() == 0 ){
                
                JOptionPane.showMessageDialog(null, "Primeiro, informe o CPF do cliente!");
                return ;
            }
            
        // tenta localizar o cliente
        cliente = this.getOficina().buscaClienteCpf( this.txtCpf.getText() );
        
        // verifica se o cliente foi localizado
        if( cliente != null ){
            
            // verifica se o cliente possui ordens em aberto
            listOrdemServicoPendentes = this.getOficina().buscaOrdemServicoPendenteClienteCpf( cliente.getCpf()  );
            
            // verifica o tamanho da lista
            if( !(listOrdemServicoPendentes.isEmpty()) ){
                
                // existe pelo menos uma ordem de servico em aberto
                    // leva o cliente para o topo
                    this.getOficina().setCliente( cliente );
                    
                    // leva a primeira ordem para o topo
                    this.getOficina().setOrdemServico( listOrdemServicoPendentes.get(0) );
                    
                    // leva a posicao da primeira ordem para o topo
                    this.getOficina().setPosListOrdemServicoPendentes( 0 );
                    
                    // leva a lista de ordens para o topo
                    this.getOficina().setListOrdemServicoPendentes(listOrdemServicoPendentes);

                    // abre a tela de aprovacao
                    PainelControleVendedorAprovarOrdemClienteEncontrado painelControleVendedorAprovarOrdemClienteEncontrado = new PainelControleVendedorAprovarOrdemClienteEncontrado( this.getOficina() );
                    this.setVisible(false);
                    painelControleVendedorAprovarOrdemClienteEncontrado.setVisible(true);
                
            } else {
                
                 JOptionPane.showMessageDialog(null, "Cliente não possui Ordens de Serviço pendentes. Verifique com o Mecânico.");
            }
            
        } else {
            
            // falha ao localizar cliente
            JOptionPane.showMessageDialog(null, "Nehum cliente encontrado com o CPF informado!");
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
