/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HapusBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;

/**
 *
 * @author Baldo
 */
public class HapusBarangController implements ActionListener {
    HapusBarang hapusbarang = new HapusBarang();
    
    public HapusBarangController(){
        hapusbarang = new HapusBarang();
        hapusbarang.setVisible(true);
        hapusbarang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        AplikasiConsole ac = new AplikasiConsole();
        if(event == hapusbarang.getBack()){
            new MenuPetugasController();
            hapusbarang.dispose();
        }else if(event == hapusbarang.getHapus()){
            if ((hapusbarang.getIdBarang().isEmpty()) && (hapusbarang.getNoGudang().isEmpty())) {
                    JOptionPane.showMessageDialog(hapusbarang, "Tidak boleh ada yang kosong!");                
            } else {
                JOptionPane.showMessageDialog(hapusbarang, "Hapus barang berhasil");
                new MenuPetugasController();
                hapusbarang.dispose();
            }
        }
    }
    
}
