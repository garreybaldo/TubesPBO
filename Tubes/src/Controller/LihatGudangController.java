/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatGudang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;

/**
 *
 * @author Baldo
 */
public class LihatGudangController implements ActionListener {
    LihatGudang lihatgudang = new LihatGudang();
    
    public LihatGudangController(){
        lihatgudang = new LihatGudang();
        lihatgudang.setVisible(true);
        lihatgudang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        AplikasiConsole ac = new AplikasiConsole();
        if(event == lihatgudang.getBack()){
            new MenuPetugasController();
            lihatgudang.dispose();
        }else if(event == lihatgudang.getLihat()){
            if (lihatgudang.getNoGudang().isEmpty()) {
                    JOptionPane.showMessageDialog(lihatgudang, "Tidak boleh kosong!");                
            } else {
                JOptionPane.showMessageDialog(lihatgudang, "Hapus barang berhasil");
                new MenuPetugasController();
                lihatgudang.dispose();
            }
        }
    }
    
}
