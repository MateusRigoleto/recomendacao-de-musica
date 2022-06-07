/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.DAOGeneros;
import DAO.DAOMusicas;
import Model.Musica;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus Rigoleto
 */
public class AvaliarMusicaTela extends javax.swing.JFrame {

    /**
     * Creates new form AvaliarMusicaTela
     */
    public AvaliarMusicaTela() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        voltarButton1 = new javax.swing.JButton();
        gravarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicasjList = new javax.swing.JList<>();
        notaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        musicajTextPane = new javax.swing.JTextPane();
        avaliarjButton = new javax.swing.JButton();
        ultimaNotaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliar música "));

        voltarButton1.setText("Voltar");
        voltarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButton1ActionPerformed(evt);
            }
        });

        gravarButton.setText("Gravar");
        gravarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarButtonActionPerformed(evt);
            }
        });

        musicasjList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                musicasjListAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(musicasjList);

        notaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite uma nota 1-5 ou 0 para apagar avaliação ");

        jScrollPane2.setViewportView(musicajTextPane);

        avaliarjButton.setText("Avaliar");
        avaliarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarjButtonActionPerformed(evt);
            }
        });

        ultimaNotaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimaNotaTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Sua ultima avaliação para");

        jLabel5.setText("foi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(voltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gravarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(avaliarjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(notaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(jLabel2)
                                        .addGap(154, 154, 154))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(ultimaNotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avaliarjButton)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ultimaNotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton1)
                    .addComponent(gravarButton)))
        );

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
    }// </editor-fold>//GEN-END:initComponents
    DefaultListModel dlm = new DefaultListModel();
    private void voltarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton1ActionPerformed
     MenuTela mt = new MenuTela();
     mt.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_voltarButton1ActionPerformed

    private void gravarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarButtonActionPerformed
    try{
        if(Integer.parseInt(notaTextField.getText()) < 6 && Integer.parseInt(notaTextField.getText()) > 0){
        DAOMusicas.adicionarNota(musicajTextPane.getText(), Integer.parseInt(notaTextField.getText()));
        JOptionPane.showMessageDialog(null,musicajTextPane.getText()+ " avaliada!");
        }
        else if(Integer.parseInt(notaTextField.getText()) == 0){
            DAOMusicas.removerNota(musicajTextPane.getText());
            JOptionPane.showMessageDialog(null,"Avaliacao removida");
        }
        else{
            JOptionPane.showMessageDialog(null,"Insira uma nota valida");
            
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    try{
        DAOMusicas.atualizarMedia(musicajTextPane.getText());
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_gravarButtonActionPerformed

    private void musicasjListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_musicasjListAncestorAdded
 try{for(int i = 0; i < DAOMusicas.obterMusicas().size(); i++){
         dlm.addElement(DAOMusicas.obterMusicas().get(i).getNomeMusica());
         
     }
     }
     
     catch(Exception e ){
         e.printStackTrace();
         
     }
     musicasjList.setModel(dlm);
    }//GEN-LAST:event_musicasjListAncestorAdded

    private void notaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaTextFieldActionPerformed

    private void avaliarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarjButtonActionPerformed
    musicajTextPane.setText(musicasjList.getSelectedValue());
    try{
        int nota = 0;
        nota = DAOMusicas.getNota(musicasjList.getSelectedValue());
        
        ultimaNotaTextField.setText(Integer.toString(nota));
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }//GEN-LAST:event_avaliarjButtonActionPerformed

    private void ultimaNotaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimaNotaTextFieldActionPerformed

    }//GEN-LAST:event_ultimaNotaTextFieldActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avaliarjButton;
    private javax.swing.JButton gravarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane musicajTextPane;
    private javax.swing.JList<String> musicasjList;
    private javax.swing.JTextField notaTextField;
    private javax.swing.JTextField ultimaNotaTextField;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables
}
