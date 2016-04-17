/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Baldo
 */
public class Utama extends javax.swing.JFrame {

    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sistem Informasi Gudang");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        daftarButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        cariButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEM INFORMASI GUDANG");

        daftarButton.setText("DAFTAR");

        loginButton.setText("LOGIN");

        hapusButton.setText("HAPUS");

        cariButton.setText("CARI");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(daftarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cariButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(daftarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapusButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cariButton)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariButtonActionPerformed

    /**
     * @param args the command line arguments
     */
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cariButton
     */
    public javax.swing.JButton getCariButton() {
        return cariButton;
    }

    /**
     * @param cariButton the cariButton to set
     */
    public void setCariButton(javax.swing.JButton cariButton) {
        this.cariButton = cariButton;
    }

    /**
     * @return the daftarButton
     */
    public javax.swing.JButton getDaftarButton() {
        return daftarButton;
    }

    /**
     * @param daftarButton the daftarButton to set
     */
    public void setDaftarButton(javax.swing.JButton daftarButton) {
        this.daftarButton = daftarButton;
    }

    /**
     * @return the hapusButton
     */
    public javax.swing.JButton getHapusButton() {
        return hapusButton;
    }

    /**
     * @param hapusButton the hapusButton to set
     */
    public void setHapusButton(javax.swing.JButton hapusButton) {
        this.hapusButton = hapusButton;
    }

    /**
     * @return the loginButton
     */
    public javax.swing.JButton getLoginButton() {
        return loginButton;
    }

    /**
     * @param loginButton the loginButton to set
     */
    public void setLoginButton(javax.swing.JButton loginButton) {
        this.loginButton = loginButton;
    }
    
    public void addListener(ActionListener e){
        daftarButton.addActionListener(e);
        loginButton.addActionListener(e);
        hapusButton.addActionListener(e);
        cariButton.addActionListener(e);
    }
}
