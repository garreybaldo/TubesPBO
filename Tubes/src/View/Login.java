/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        loginPenyedia = new javax.swing.JButton();
        loginPetugas = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU LOGIN");

        loginPenyedia.setText("LOGIN PENYEDIA");

        loginPetugas.setText("LOGIN PETUGAS");

        back.setText("BACK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPenyedia))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(50, 50, 50)
                .addComponent(loginPenyedia)
                .addGap(28, 28, 28)
                .addComponent(loginPetugas)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginPenyedia;
    private javax.swing.JButton loginPetugas;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the back
     */
    public javax.swing.JButton getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(javax.swing.JButton back) {
        this.back = back;
    }

    /**
     * @return the loginPenyedia
     */
    public javax.swing.JButton getLoginPenyedia() {
        return loginPenyedia;
    }

    /**
     * @param loginPenyedia the loginPenyedia to set
     */
    public void setLoginPenyedia(javax.swing.JButton loginPenyedia) {
        this.loginPenyedia = loginPenyedia;
    }

    /**
     * @return the loginPetugas
     */
    public javax.swing.JButton getLoginPetugas() {
        return loginPetugas;
    }

    /**
     * @param loginPetugas the loginPetugas to set
     */
    public void setLoginPetugas(javax.swing.JButton loginPetugas) {
        this.loginPetugas = loginPetugas;
    }

    public void addListener(ActionListener e) {
        loginPenyedia.addActionListener(e);
        loginPetugas.addActionListener(e);
        back.addActionListener(e);
    }
    
}