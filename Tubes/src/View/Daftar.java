/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Daftar");
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
        daftarPenyedia = new javax.swing.JButton();
        daftarPetugas = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU DAFTAR");

        daftarPenyedia.setText("DAFTAR PENYEDIA");

        daftarPetugas.setText("DAFTAR PETUGAS");

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
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(daftarPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(daftarPenyedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(52, 52, 52)
                .addComponent(daftarPenyedia)
                .addGap(36, 36, 36)
                .addComponent(daftarPetugas)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton daftarPenyedia;
    private javax.swing.JButton daftarPetugas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
    public void addListener(ActionListener e) {
        getDaftarPenyedia().addActionListener(e);
        getDaftarPetugas().addActionListener(e);
        getBack().addActionListener(e);
    }

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
     * @return the daftarPenyedia
     */
    public javax.swing.JButton getDaftarPenyedia() {
        return daftarPenyedia;
    }

    /**
     * @param daftarPenyedia the daftarPenyedia to set
     */
    public void setDaftarPenyedia(javax.swing.JButton daftarPenyedia) {
        this.daftarPenyedia = daftarPenyedia;
    }

    /**
     * @return the daftarPetugas
     */
    public javax.swing.JButton getDaftarPetugas() {
        return daftarPetugas;
    }

    /**
     * @param daftarPetugas the daftarPetugas to set
     */
    public void setDaftarPetugas(javax.swing.JButton daftarPetugas) {
        this.daftarPetugas = daftarPetugas;
    }
}
