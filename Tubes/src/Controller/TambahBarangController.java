/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.BuatBarang;
import View.TambahBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;
import tubes.Barang;

/**
 *
 * @author Baldo
 */
public class TambahBarangController implements ActionListener {
    TambahBarang tambahbarang = new TambahBarang();
    
    public TambahBarangController(){
        tambahbarang = new TambahBarang();
        tambahbarang.setVisible(true);
        tambahbarang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        AplikasiConsole ac = new AplikasiConsole();
        if(event == tambahbarang.getBack()){
            new MenuPenyediaController();
            tambahbarang.dispose();
        }else if(event == tambahbarang.getSubmit()){
            if ((tambahbarang.getIdBarang().isEmpty()) && (tambahbarang.getNamaBarang().isEmpty())) {
                    JOptionPane.showMessageDialog(tambahbarang, "Tidak boleh ada yang kosong!");                
            } else {
                JOptionPane.showMessageDialog(buatbarang, "Buat barang berhasil");
                new MenuPetugasController();
                tambahbarang.dispose();
            }
        }
    }
    
}
