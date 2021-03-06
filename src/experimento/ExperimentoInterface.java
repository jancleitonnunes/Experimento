/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experimento;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jancleiton Nunes
 */

public class ExperimentoInterface extends javax.swing.JFrame {
    
    private float txCruzamento;
    private float txMutacao;

    /**
     * Creates new form ExperimentoInterface
     */
    public ExperimentoInterface() throws UnsupportedEncodingException {
        this.txCruzamento = 51;
        this.txMutacao = 0.5f;
        initComponents();
        URL caminhoImagem = this.getClass().getClassLoader().getResource("img/engrenagem.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea1),true, "UTF-8");        
        System.setOut(printStream);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTxCruzamento = new javax.swing.JLabel();
        labelTxMutacao = new javax.swing.JLabel();
        taxaCruzamento = new javax.swing.JLabel();
        taxaMutacao = new javax.swing.JLabel();
        jButton_iniciar = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txCruzamentoConfigurada = new javax.swing.JTextField();
        txMutacaoConfigurada = new javax.swing.JTextField();
        jButtonConfigurarValores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Experimento AG");

        labelTxCruzamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTxCruzamento.setText("Taxa de cruzamento:");

        labelTxMutacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTxMutacao.setText("Taxa de mutação:");

        taxaCruzamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        taxaCruzamento.setText("0");

        taxaMutacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        taxaMutacao.setText("0");

        jButton_iniciar.setText("Iniciar");
        jButton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarActionPerformed(evt);
            }
        });

        jProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar.setMaximum(1000);
        jProgressBar.setStringPainted(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Setar taxas:");
        jLabel1.setToolTipText("<html>\n<p>\nATENÇÃO! usar apenas quando for preciso iniciar o experimento com valores diferentes dos valores <i>default</i>. Os valores <i>default</i> são: cruzamento 51% e mutação 0,5%. \n</p>\n</html>");

        jLabel2.setText("Cruzamento:");
        jLabel2.setToolTipText("<html>\n<p>\nATENÇÃO! usar apenas quando for preciso iniciar o experimento com valores diferentes dos valores <i>default</i>. Os valores <i>default</i> são: cruzamento 51% e mutação 0,5%. \n</p>\n</html>");

        jLabel3.setText("Mutação:");
        jLabel3.setToolTipText("<html>\n<p>\nATENÇÃO! usar apenas quando for preciso iniciar o experimento com valores diferentes dos valores <i>default</i>. Os valores <i>default</i> são: cruzamento 51% e mutação 0,5%. \n</p>\n</html>");

        txCruzamentoConfigurada.setToolTipText("");
        txCruzamentoConfigurada.setMinimumSize(new java.awt.Dimension(20, 20));
        txCruzamentoConfigurada.setPreferredSize(new java.awt.Dimension(30, 25));

        txMutacaoConfigurada.setPreferredSize(new java.awt.Dimension(30, 25));

        jButtonConfigurarValores.setText("Configurar valores");
        jButtonConfigurarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarValoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTxCruzamento)
                                .addGap(18, 18, 18)
                                .addComponent(taxaCruzamento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTxMutacao)
                                .addGap(18, 18, 18)
                                .addComponent(taxaMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txCruzamentoConfigurada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txMutacaoConfigurada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConfigurarValores)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTxCruzamento)
                    .addComponent(taxaCruzamento)
                    .addComponent(labelTxMutacao)
                    .addComponent(taxaMutacao)
                    .addComponent(jLabel1)
                    .addComponent(jButtonConfigurarValores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_iniciar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txCruzamentoConfigurada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txMutacaoConfigurada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarActionPerformed
        try {
            jTextArea1.setText("");
            jButtonConfigurarValores.setEnabled(false);
            txCruzamentoConfigurada.setEnabled(false);
            txMutacaoConfigurada.setEnabled(false);
            iniciar();
        } catch (IOException ex) {
            Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_iniciarActionPerformed

    private void jButtonConfigurarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarValoresActionPerformed
        this.txCruzamento =  Float.parseFloat(txCruzamentoConfigurada.getText());
        this.txMutacao = Float.parseFloat(txMutacaoConfigurada.getText());
        JOptionPane.showMessageDialog (null, "Valores configurados!", "Atenção!", JOptionPane.PLAIN_MESSAGE);
        txCruzamentoConfigurada.setText("");
        txMutacaoConfigurada.setText("");
    }//GEN-LAST:event_jButtonConfigurarValoresActionPerformed

    public void iniciar()throws FileNotFoundException, IOException{
        jButton_iniciar.setEnabled(false);
        /*jProgressBar.setStringPainted(true);
        jProgressBar.setString("0%");*/
        new Thread(new Runnable(){
            @Override
            public void run(){
                try {        
                    Instancia.lerInstancia();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("\n\nINICIALIZANDO...");
                double t = System.currentTimeMillis();              
                
                AG ag = new AG();
                int exec = (int) (((txCruzamento-51)*20)+(txMutacao*2))-1;
                Cromossomo resultado;        
                float cruzamento, mutacao, distanciaMedia;
                int progresso = 0;
                for(cruzamento = txCruzamento; cruzamento <= 100; cruzamento++){
                    taxaCruzamento.setText((int)cruzamento+"%");

                    for(mutacao = txMutacao; mutacao <= 10; mutacao = mutacao + 0.5f){
                        txMutacao = 0.5f;
                        //ATUALIZA PROGRESSBAR
                        progresso++;
                        jProgressBar.setValue(progresso);
                        jProgressBar.setStringPainted(true);
                        jProgressBar.setString(progresso/10+"%");
                        
                        taxaMutacao.setText(mutacao+"%");                                              
                        exec++;
                        distanciaMedia = 0f;                            
                        
                        int quantExecucoes = 10; //para eil51 são 5 para as demais 10
                        
                        if(Instancia.getNomeInstancia().equalsIgnoreCase("eil51")){
                            quantExecucoes = 5;
                        }
                        
                        float distanciaCadaExecucao[] = new float[quantExecucoes];//DISTANCIA DE CADA EXECUÇÃO PARA CALCULAR O MÍNIMO, MÁXIMO E MÉDIA
                        
                        for(int i=0; i<quantExecucoes; i++){
                            ag = new AG();
                            resultado = new Cromossomo();
                            System.out.println((i+1)+"a execucao");
                            double tempoExecucao = System.currentTimeMillis();
                            resultado = ag.executar(cruzamento, mutacao);

                            if (resultado.getDistancia() <= Instancia.getMelhorSolucaoConhecida()){
                                System.out.println("IGUAL OU ABAIXO DA MELHOR SOLUCAO CONHECIDA: "+resultado);
                                try {
                                    Instancia.escreveMelhorSolucaoConhecida(resultado, cruzamento, mutacao);
                                } catch (IOException ex) {
                                    Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                            tempoExecucao = System.currentTimeMillis() - tempoExecucao;
                            tempoExecucao = tempoExecucao/1000;//para ficar em segundos                    
                            System.out.println("Tempo de execucao: "+tempoExecucao+" segundos");

                            distanciaCadaExecucao[i] = resultado.getDistancia();                                        
                            System.out.println("Melhor distancia da Execucao: "+resultado.getDistancia());
                        }

                        //SOMA AS DISTANCIAS, CALCULA A MEDIA, SELECIONA A MAIOR E MENOR 
                        float maior = distanciaCadaExecucao[0];
                        float menor = distanciaCadaExecucao[0];
                        for(int i=0; i<quantExecucoes; i++){
                            if(maior < distanciaCadaExecucao[i]){
                                maior = distanciaCadaExecucao[i];
                            }
                            if(menor > distanciaCadaExecucao[i]){
                                menor = distanciaCadaExecucao[i];
                            }
                            distanciaMedia += distanciaCadaExecucao[i];
                        }

                        distanciaMedia = distanciaMedia/quantExecucoes; //CALCULA MÉDIA DAS DISTANCIAS para eil51 são 5 para as demais 10
                        System.out.println("Combinacao "+exec+" Cruzamento: "+cruzamento+" Mutacao: "+mutacao+" Distancia media: "+distanciaMedia+" Maior distancia: "+maior+" Menor distancia: "+menor);                
                        try {
                            //ESCREVE RESULTADO EM ARQUIVO PARA GERAÇÃO DE GRAFICOS
                            //grafico 3d com taxas de cruzamento, mutacao e distancia media
                            Instancia.escreveMedia(cruzamento, mutacao, distanciaMedia);
                        } catch (IOException ex) {
                            Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            //grafico de tolerancia para as 1.000 execucoes
                            Instancia.escreveVarianciaMedia(exec, distanciaMedia, menor, maior);
                        } catch (IOException ex) {
                            Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                t = System.currentTimeMillis() - t; 
                t = t/1000;//para ficar em segundos
                System.out.println("Tempo de execucao do experimento: "+t+" segundos");
                jButton_iniciar.setEnabled(true);
            }
        }).start();
                
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExperimentoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExperimentoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExperimentoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExperimentoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ExperimentoInterface().setVisible(true);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(ExperimentoInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfigurarValores;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelTxCruzamento;
    private javax.swing.JLabel labelTxMutacao;
    private javax.swing.JLabel taxaCruzamento;
    private javax.swing.JLabel taxaMutacao;
    private javax.swing.JTextField txCruzamentoConfigurada;
    private javax.swing.JTextField txMutacaoConfigurada;
    // End of variables declaration//GEN-END:variables
}
