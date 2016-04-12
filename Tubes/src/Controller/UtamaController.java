/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class UtamaController implements ActionListener {
    private Utama utama;
    
    public UtamaController(){
        utama = new Utama();
        utama.setVisible(true);
        utama.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == utama.getDaftarButton()){
            new DaftarController();
            utama.dispose();
        }else if(event == utama.getLoginButton()){
            new LoginController();
            utama.dispose();
        }else if(event == utama.getHapusButton()){
            new HapusController();
            utama.dispose();
        }else if(event == utama.getCariButton()){
            new CariController();
            utama.dispose();
        }
    }
}
