/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.HapusPenyedia;
import View.HapusPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class HapusPetugasController implements ActionListener {
    private HapusPetugas hapuspetugas;
    Aplikasi model;
    
    public HapusPetugasController(){
        hapuspetugas = new HapusPetugas();
        hapuspetugas.setVisible(true); 
        hapuspetugas.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == hapuspetugas.getHapus()){
            if(hapuspetugas.getId().isEmpty()){
                JOptionPane.showMessageDialog(hapuspetugas, "Id tidak ada!");
            }else{                
                JOptionPane.showMessageDialog(hapuspetugas, "Hapus penyedia berhasil");
                new HapusController(model);
                hapuspetugas.dispose();
            }
        }else if(event == hapuspetugas.getBack()){
            new HapusController(model);
            hapuspetugas.dispose();
        }
    }
    
}
