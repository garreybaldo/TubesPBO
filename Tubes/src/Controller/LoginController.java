/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
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
    
    Aplikasi model;
    Login view;

    public LoginController(Aplikasi model) {
        this.model = model;
        view = new Login();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getLoginPenyedia())) {
            new LoginPenyediaController(model);
        } else if(event.equals(view.getLoginPetugas())){
            new LoginPetugasController(model);
            view.dispose();
        }
    }
}