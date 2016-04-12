/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Cari;
import View.Hapus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class HapusController implements ActionListener {
    private Hapus hapus;
    
    public HapusController(){
        hapus = new Hapus();
        hapus.setVisible(true); 
        hapus.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == hapus.getHapusPenyedia()){
            new HapusPenyediaController();
            hapus.dispose();
        }else if(event == hapus.getHapusPetugas()){
            new HapusPetugasController();
            hapus.dispose();
        }else if(event == hapus.getBack()){
            new UtamaController();
            hapus.dispose();
        }
    }
}
