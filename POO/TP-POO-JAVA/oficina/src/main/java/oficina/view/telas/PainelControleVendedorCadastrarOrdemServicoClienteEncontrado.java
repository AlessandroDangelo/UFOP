/*
 * Tela PainelControleVendedorCadastrarOrdemServicoClienteEncontrado
 * Tela para concluir a abertura de nova ordem de servico.
*/
package oficina.view.telas;

import javax.swing.JOptionPane;
import oficina.model.finals.Oficina;
import oficina.model.finals.Veiculo;
import oficina.model.finals.OrdemServico;

public class PainelControleVendedorCadastrarOrdemServicoClienteEncontrado extends javax.swing.JFrame
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
     * Metdodos
     * Rotinas da classe.
    */
        /*
         * Construtor
         * Prepara a instancia da classe.
        */
        public PainelControleVendedorCadastrarOrdemServicoClienteEncontrado(Oficina oficina)
        {
            initComponents();
            this.oficina = oficina;
            this.loadCliente();
            this.clearVeiculo();
        }
        
        /*
         * Metodos adicionais
         * Funcionalidades adicionais a classe.
        */
            /*
             * loadCliente()
             * Carrega as informacoes do cliente para a ordem.
            */
            public final void loadCliente()
            {
                this.txtNome.setText( this.getOficina().getCliente().getNome()  );
                this.txtCpf.setText( this.getOficina().getCliente().getCpf() );
            }
            
            /*
             * clearVeiculo()
             * Limpa os dados do veiculo
            */
            public final void clearVeiculo()
            {
                this.getOficina().getCliente().setVeiculo(null);
                this.txtPlaca.setText("");
                this.txtMarca.setText("...");
                this.txtModelo.setText("...");
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
     * Recursos adicionais a classe.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        lDadosCliente = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        sDadosCliente = new javax.swing.JSeparator();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JLabel();
        lDadosVeiculo = new javax.swing.JLabel();
        sDadosVeiculo = new javax.swing.JSeparator();
        lPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        bLocalizar = new javax.swing.JButton();
        lMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        lModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        bCriarOrdem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTitulo.setText("Nova Ordem de Serviço");

        lDadosCliente.setText("Dados do Cliente:");

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        lNome.setText("Nome:");

        txtNome.setText("Carregando...");

        lCpf.setText("CPF:");

        txtCpf.setText("Carregando...");

        lDadosVeiculo.setText("Dados do Veículo:");

        lPlaca.setText("Placa:");

        bLocalizar.setText("Localizar");
        bLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLocalizarActionPerformed(evt);
            }
        });

        lMarca.setText("Marca:");

        txtMarca.setText("...");

        lModelo.setText("Modelo:");

        txtModelo.setText("...");

        bCriarOrdem.setText("Criar Ordem");
        bCriarOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarOrdemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sDadosCliente)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lDadosCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVoltar)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDadosVeiculo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(sDadosVeiculo)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lPlaca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bCriarOrdem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(bLocalizar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bVoltar)))
                .addGap(18, 18, 18)
                .addComponent(lDadosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(txtCpf))
                .addGap(30, 30, 30)
                .addComponent(lDadosVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDadosVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLocalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarca)
                    .addComponent(txtMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModelo)
                    .addComponent(txtModelo))
                .addGap(37, 37, 37)
                .addComponent(bCriarOrdem)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        
        // retorna a tela de criacao de ordem de servico
        PainelControleVendedorCadastrarOrdemServico painelControleVendedorCadastrarOrdemServico = new PainelControleVendedorCadastrarOrdemServico( this.getOficina() );
        this.setVisible(false);
        painelControleVendedorCadastrarOrdemServico.setVisible(true);
        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bCriarOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarOrdemActionPerformed
        
        // variaveis auxiliares
        OrdemServico ordemServico;
        int retorno;
        
        // verifica se as entradas foram realizadas
            if( this.getOficina().getCliente().getVeiculo() != null ){
                
                // veiculo selecionado
                    // cria a nova ordem
                    ordemServico = new OrdemServico(
                        this.getOficina().getListOrdemServico().size(),
                        this.getOficina().getCliente().getVeiculo(),
                        this.getOficina().getCliente(),
                        this.getOficina().getVendedor()
                    );
                    
                    // insere o nova ordem
                    retorno = this.getOficina().inserirOrdemServico(ordemServico);
                    ordemServico = null;
                    
                    // trata o retorno
                    if( retorno == 1 ){
                        
                        // ordem de servico inserido com sucesso
                        JOptionPane.showMessageDialog(null, "Ordem de Serviço inserida com sucesso!");
                        this.clearVeiculo();
                        
                    } else {
                        
                        // falha ao inserir ordem de servico.
                        JOptionPane.showMessageDialog(null, "Falha ao inserir Ordem de Servico.");
                        
                    }
                    
            } else {
                
                // veiculo nao selecionado
                JOptionPane.showMessageDialog(null, "Primeiro, localize um veículo!");
                
            }
        
    }//GEN-LAST:event_bCriarOrdemActionPerformed

    private void bLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLocalizarActionPerformed
        
        // variaveis auxiliares
        Veiculo veiculo;
        
        // localiza informacoes do carro a partir da placa
        if( this.txtPlaca.getText().length() == 0 ){
            
            JOptionPane.showMessageDialog(null, "Primeiro, forneca a placa do veiculo!");
            return ;
        }
        
        // busca o veiculo atraves do cliente
        veiculo = this.getOficina().getCliente().buscaVeiculoPlaca( this.txtPlaca.getText() );
        
        // verifica se o veiculo foi econtrado
        if( veiculo != null ){
            
            // veiculo encontrado
                // atualiza os dados do veiculo
                this.txtMarca.setText( veiculo.getMarca()  );
                this.txtModelo.setText( veiculo.getModelo() );
                
                // leva o veiculo para a topo da pilha
                this.getOficina().getCliente().setVeiculo( veiculo );
            
        } else {
            
            // veiculo nao encontrado
            JOptionPane.showMessageDialog(null, "Nenhum Veículo associado ao cliente com essa Placa!");
            
        }
        
    }//GEN-LAST:event_bLocalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCriarOrdem;
    private javax.swing.JButton bLocalizar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDadosCliente;
    private javax.swing.JLabel lDadosVeiculo;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModelo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JSeparator sDadosCliente;
    private javax.swing.JSeparator sDadosVeiculo;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
