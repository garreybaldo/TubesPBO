/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Cari;
import View.Daftar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class CariController implements ActionListener {
    private Cari cari;
    
    public CariController(){
        cari = new Cari();
        cari.setVisible(true); 
        cari.addListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == cari.getCariPenyedia()){
            new CariPenyediaController();
            cari.dispose();
        }else if(event == cari.getCariPetugas()){
            new CariPetugasController();
            cari.dispose();
        }else if(event == cari.getBack()){
            new UtamaController();
            cari.dispose();
        }
    }
}
