/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Daftar;
import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class DaftarController implements ActionListener {
    private Daftar daftar;
    
    public DaftarController(){
        daftar = new Daftar();
        daftar.setVisible(true); 
        daftar.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == daftar.getDaftarPenyedia()){
            new DaftarPenyediaController();
            daftar.dispose();
        }else if(event == daftar.getDaftarPetugas()){
            new DaftarPetugasController();
            daftar.dispose();
        }else if(event == daftar.getBack()){
            new UtamaController();
            daftar.dispose();
        }
    }
}
