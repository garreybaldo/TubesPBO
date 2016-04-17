/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.BuatBarang;
import View.LoginPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;
import tubes.Barang;
import tubes.Penyedia;

/**
 *
 * @author Baldo
 */
public class BuatBarangController implements ActionListener {
    BuatBarang buatbarang = new BuatBarang();
    
    public BuatBarangController(){
        buatbarang = new BuatBarang();
        buatbarang.setVisible(true);
        buatbarang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        AplikasiConsole ac = new AplikasiConsole();
        if(event == buatbarang.getBack()){
            new MenuPenyediaController();
            buatbarang.dispose();
        }else if(event == buatbarang.getSubmit()){
            if ((buatbarang.getIdBarang().isEmpty()) && (buatbarang.getNamaBarang().isEmpty())) {
                    JOptionPane.showMessageDialog(buatbarang, "Tidak boleh ada yang kosong!");                
            } else {
                Barang b;
                b = new Barang(buatbarang.getIdBarang(), buatbarang.getNamaBarang(), buatbarang.getJumlah());
                //ac.addBarang(p);
                JOptionPane.showMessageDialog(buatbarang, "Buat barang berhasil");
                new MenuPenyediaController();
                buatbarang.dispose();
            }
        }
    }
    
}
