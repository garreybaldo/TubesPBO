/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class MenuPenyediaController implements ActionListener {
    MenuPenyedia menupenyedia = new MenuPenyedia();
    
    public MenuPenyediaController(){
        menupenyedia = new MenuPenyedia();
        menupenyedia.setVisible(true);
        menupenyedia.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == menupenyedia.getBuatBarang()){
            new BuatBarangController();
            menupenyedia.dispose();
        }else if(event == menupenyedia.getDaftarBarang()){
            new DaftarBarangController();
            menupenyedia.dispose();
        }else if(event == menupenyedia.getLogout()){
            new UtamaController();
            menupenyedia.dispose();
        }
    }
    
}
