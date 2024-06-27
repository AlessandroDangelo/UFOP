/*
 * Tela PainelControleMecanico
 * Tela inicial para mecaicos.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;

public class PainelControleMecanico extends javax.swing.JFrame
{
    /*
     * Atributos
     * Armazeam dados e estruturas.
    */
        /*
         * oficina
         * Armazena a referencia a instancia da oficina.
        */
        private Oficina oficina;
    
    /*
     * Metodos
     * Funcionalidades da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public PainelControleMecanico(Oficina oficina) 
        {
            initComponents();
            this.oficina = oficina;
            this.load();
        }
        
        /*
         * Metodos adicionais
         * Funcionalidades adicionais a classe.
        */
            /*
             * load()
             * Carrega os dados da pagina.
            */
            public final void load()
            {
                this.txtDescricao.setText(
                    "Seja bem vindo(a) Sr.(a) " + this.getOficina().getMecanico().getNome()
                );
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
        txtDescricao = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();
        bAdicionarOrdemServico = new javax.swing.JButton();
        bAdicionarProdutosEServicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Painel Controle do Mecânico");

        txtDescricao.setText("Carregando...");

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bAdicionarOrdemServico.setText("Adicionar Ordens de Serviço ao Trabalho");
        bAdicionarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarOrdemServicoActionPerformed(evt);
            }
        });

        bAdicionarProdutosEServicos.setText("Adicionar Produtos e Serviços a Ordem de Serviço em Trabalho");
        bAdicionarProdutosEServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarProdutosEServicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSair)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitulo)
                    .addComponent(txtDescricao)
                    .addComponent(bAdicionarOrdemServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAdicionarProdutosEServicos, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bSair)
                .addGap(1, 1, 1)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricao)
                .addGap(43, 43, 43)
                .addComponent(bAdicionarOrdemServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAdicionarProdutosEServicos)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        
        // retorna a tela de login
        Login login = new Login( this.getOficina() );
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_bSairActionPerformed

    private void bAdicionarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarOrdemServicoActionPerformed
        
        // primeiro busca as ordem de servico disponiveis
        this.getOficina().setListOrdemServicoPendentes( this.getOficina().buscaOrdemServicoPendentes() );
        
        // verifica se existe pelo menos uma
        if( this.getOficina().getListOrdemServicoPendentes().isEmpty() ){
            
            // nenhuma ordem de servico em aberto
            JOptionPane.showMessageDialog(null, "Não existem ordens de serviço abertas no Sistema. Contate o Vendedor.");
            return ;
            
        }
        
        // agora posso abrir a tela que lista as ordens de servico
        this.getOficina().setPosListOrdemServicoPendentes(-1);
        PainelControleMecanicoEscolherOrdemDeServico painelControleMecanicoEscolherOrdemDeServico = new PainelControleMecanicoEscolherOrdemDeServico( this.getOficina() );
        this.setVisible(false);
        painelControleMecanicoEscolherOrdemDeServico.setVisible(true);
        
    }//GEN-LAST:event_bAdicionarOrdemServicoActionPerformed

    private void bAdicionarProdutosEServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarProdutosEServicosActionPerformed
       
        // verifica se existe ao menos um elemento na lista de trabalho do mecanico
        if( this.getOficina().getMecanico().getListOrdemServico().isEmpty() ){
            
            // nenhum elemento na lista de trabalho
            JOptionPane.showMessageDialog(null, "Nenhuma ordem pendente na sua lista de Trabalho. Escolha uma e começe a trabalhar!");
            return ;
            
        }
        
        // confira o mecanico
        this.getOficina().getMecanico().setPosListOrdemServico(-1);
        
        // abre a tela
        PainelControleMecanicoAdicionarProdutosEServicos painelControleMecanicoAdicionarProdutosEServicos = new PainelControleMecanicoAdicionarProdutosEServicos( this.getOficina() );
        this.setVisible(false);
        painelControleMecanicoAdicionarProdutosEServicos.setVisible(true);
        
        
    }//GEN-LAST:event_bAdicionarProdutosEServicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionarOrdemServico;
    private javax.swing.JButton bAdicionarProdutosEServicos;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
