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
public class Cari extends javax.swing.JFrame {

    /**
     * Creates new form Cari
     */
    public Cari() {
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

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cariPenyedia = new javax.swing.JButton();
        cariPetugas = new javax.swing.JButton();
        cariGudang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        back.setText("BACK");

        jLabel1.setText("MENU CARI");

        cariPenyedia.setText("CARI PENYEDIA");

        cariPetugas.setText("CARI PETUGAS");

        cariGudang.setText("CARI GUDANG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cariPetugas)
                            .addComponent(cariPenyedia)
                            .addComponent(cariGudang))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(50, 50, 50)
                .addComponent(cariPenyedia)
                .addGap(18, 18, 18)
                .addComponent(cariPetugas)
                .addGap(18, 18, 18)
                .addComponent(cariGudang)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cariGudang;
    private javax.swing.JButton cariPenyedia;
    private javax.swing.JButton cariPetugas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void addListener(ActionListener e) {
        getCariPenyedia().addActionListener(e);
        getCariPetugas().addActionListener(e);
        getCariGudang().addActionListener(e);
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
     * @return the cariGudang
     */
    public javax.swing.JButton getCariGudang() {
        return cariGudang;
    }

    /**
     * @param cariGudang the cariGudang to set
     */
    public void setCariGudang(javax.swing.JButton cariGudang) {
        this.cariGudang = cariGudang;
    }

    /**
     * @return the cariPenyedia
     */
    public javax.swing.JButton getCariPenyedia() {
        return cariPenyedia;
    }

    /**
     * @param cariPenyedia the cariPenyedia to set
     */
    public void setCariPenyedia(javax.swing.JButton cariPenyedia) {
        this.cariPenyedia = cariPenyedia;
    }

    /**
     * @return the cariPetugas
     */
    public javax.swing.JButton getCariPetugas() {
        return cariPetugas;
    }

    /**
     * @param cariPetugas the cariPetugas to set
     */
    public void setCariPetugas(javax.swing.JButton cariPetugas) {
        this.cariPetugas = cariPetugas;
    }
}
