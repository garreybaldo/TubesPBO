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
public class Hapus extends javax.swing.JFrame {

    /**
     * Creates new form Hapus
     */
    public Hapus() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hapus");
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
        hapusPenyedia = new javax.swing.JButton();
        hapusPetugas = new javax.swing.JButton();
        hapusGudang = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU HAPUS");

        hapusPenyedia.setText("HAPUS PENYEDIA");

        hapusPetugas.setText("HAPUS PETUGAS");

        hapusGudang.setText("HAPUS GUDANG");

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
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hapusGudang)
                            .addComponent(hapusPetugas)
                            .addComponent(hapusPenyedia))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(50, 50, 50)
                .addComponent(hapusPenyedia)
                .addGap(18, 18, 18)
                .addComponent(hapusPetugas)
                .addGap(18, 18, 18)
                .addComponent(hapusGudang)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton hapusGudang;
    private javax.swing.JButton hapusPenyedia;
    private javax.swing.JButton hapusPetugas;
    private javax.swing.JLabel jLabel1;
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
     * @return the hapusGudang
     */
    public javax.swing.JButton getHapusGudang() {
        return hapusGudang;
    }

    /**
     * @param hapusGudang the hapusGudang to set
     */
    public void setHapusGudang(javax.swing.JButton hapusGudang) {
        this.hapusGudang = hapusGudang;
    }

    /**
     * @return the hapusPenyedia
     */
    public javax.swing.JButton getHapusPenyedia() {
        return hapusPenyedia;
    }

    /**
     * @param hapusPenyedia the hapusPenyedia to set
     */
    public void setHapusPenyedia(javax.swing.JButton hapusPenyedia) {
        this.hapusPenyedia = hapusPenyedia;
    }

    /**
     * @return the hapusPetugas
     */
    public javax.swing.JButton getHapusPetugas() {
        return hapusPetugas;
    }

    /**
     * @param hapusPetugas the hapusPetugas to set
     */
    public void setHapusPetugas(javax.swing.JButton hapusPetugas) {
        this.hapusPetugas = hapusPetugas;
    }
    
    public void addListener(ActionListener e) {
        getHapusPenyedia().addActionListener(e);
        getHapusPetugas().addActionListener(e);
        getHapusGudang().addActionListener(e);
        getBack().addActionListener(e);
    }
}
