
package Telas;

import DAO.DAOGeneros;
import Model.Genero;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class GenerosTela extends javax.swing.JFrame {

    
    

   
    public GenerosTela() {
        initComponents();
        setLocationRelativeTo(null);
     
     
     
     
     
     
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        voltarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        generosFavoritosjList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        generosDisponiveisjList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adicionarjButton = new javax.swing.JButton();
        retirarjButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Meus generos"));

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        generosFavoritosjList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                generosFavoritosjListAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                generosFavoritosjListAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(generosFavoritosjList);

        generosDisponiveisjList.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                generosDisponiveisjListAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(generosDisponiveisjList);

        jLabel1.setText("Favoritos");

        jLabel2.setText("Disponiveis");

        adicionarjButton.setBackground(new java.awt.Color(51, 204, 0));
        adicionarjButton.setText("+");
        adicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjButtonActionPerformed(evt);
            }
        });

        retirarjButton.setBackground(new java.awt.Color(204, 51, 0));
        retirarjButton.setText("-");
        retirarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adicionarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(retirarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1)))
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(adicionarjButton)
                        .addGap(60, 60, 60)
                        .addComponent(retirarjButton)))
                .addGap(18, 18, 18)
                .addComponent(voltarButton))
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

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        MenuTela mt = new MenuTela();
        mt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed
    DefaultListModel dlm1 = new DefaultListModel();
    DefaultListModel dlm = new DefaultListModel();
    private void generosFavoritosjListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_generosFavoritosjListAncestorAdded
     
     try{for(int i = 0; i < DAOGeneros.obterGenerosPreferidos().size(); i++){
         dlm1.addElement(DAOGeneros.obterGenerosPreferidos().get(i).getNomeGenero());
     }
     }
     
     catch(Exception e ){
         e.printStackTrace();
         
     }
     generosFavoritosjList.setModel(dlm1);
    }//GEN-LAST:event_generosFavoritosjListAncestorAdded

    private void generosFavoritosjListAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_generosFavoritosjListAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_generosFavoritosjListAncestorRemoved
    
    private void adicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButtonActionPerformed
        try {
            DAOGeneros.adicionarFavorito(generosDisponiveisjList.getSelectedValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
        dlm1.addElement(generosDisponiveisjList.getSelectedValue());
        dlm.removeElement(generosDisponiveisjList.getSelectedValue());
        
        generosDisponiveisjList.setModel(dlm);
        generosFavoritosjList.setModel(dlm1);
    }//GEN-LAST:event_adicionarjButtonActionPerformed

    private void retirarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarjButtonActionPerformed
    try {
            DAOGeneros.removerFavorito(generosFavoritosjList.getSelectedValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    dlm.addElement(generosFavoritosjList.getSelectedValue());
    dlm1.removeElement(generosFavoritosjList.getSelectedValue());
    
    generosDisponiveisjList.setModel(dlm);
    generosFavoritosjList.setModel(dlm1);
    
    }//GEN-LAST:event_retirarjButtonActionPerformed

    private void generosDisponiveisjListAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_generosDisponiveisjListAncestorAdded
       
     try{for(int i = 0; i < DAOGeneros.obterGeneros().size(); i++){
         dlm.addElement(DAOGeneros.obterGeneros().get(i).getNomeGenero());
         
     }
     }
     
     catch(Exception e ){
         e.printStackTrace();
     }
     generosDisponiveisjList.setModel(dlm);
    }//GEN-LAST:event_generosDisponiveisjListAncestorAdded

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarjButton;
    private javax.swing.JList<String> generosDisponiveisjList;
    private javax.swing.JList<String> generosFavoritosjList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retirarjButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
