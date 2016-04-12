/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;
import View.LoginPenyedia;
import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class LoginController implements ActionListener {
    private Login login;
    
    public LoginController(){
        login = new Login();
        login.setVisible(true);
        login.addListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == login.getLoginPenyedia()){
            new LoginPenyediaController();
            login.dispose();
        }else if(event == login.getLoginPetugas()){
            new LoginPetugasController();
            login.dispose();
        }else if(event == login.getBack()){
            new UtamaController();
            login.dispose();
        }
    }
}