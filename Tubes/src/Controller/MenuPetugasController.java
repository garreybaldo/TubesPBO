/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class MenuPetugasController implements ActionListener {
    MenuPetugas menupetugas = new MenuPetugas();
    
    public MenuPetugasController(){
        menupetugas = new MenuPetugas();
        menupetugas.setVisible(true);
        menupetugas.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == menupetugas.getTambahBarang()){
            new TambahBarangController();
            menupetugas.dispose();
        }else if(event == menupetugas.getHapusBarang()){
            new HapusBarangController();
            menupetugas.dispose();
        }else if(event == menupetugas.getLihatGudang()){
            new LihatGudangController();
            menupetugas.dispose();
        }else if(event == menupetugas.getLihatSemuaBarang()){
            new LihatSemuaBarangController();
            menupetugas.dispose();
        }else if(event == menupetugas.getLogout()){
            new UtamaController();
            menupetugas.dispose();
        }
    }
    
}
