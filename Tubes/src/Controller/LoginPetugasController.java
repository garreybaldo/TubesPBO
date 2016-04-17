/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginPenyedia;
import View.LoginPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;

/**
 *
 * @author Baldo
 */
public class LoginPetugasController implements ActionListener {
    private LoginPetugas loginpetugas;
    
    public LoginPetugasController(){
        loginpetugas = new LoginPetugas();
        loginpetugas.setVisible(true);
        loginpetugas.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        AplikasiConsole ac = new AplikasiConsole();
        if(event == loginpetugas.getLogin()){
            if(loginpetugas.getId().isEmpty()){
                JOptionPane.showMessageDialog(loginpetugas, "Id tidak boleh kosong!");
                new LoginPenyediaController();
            }else{
                for(int i=0; i<=ac.getNPetugas(); i++){
                    if(loginpetugas.getId() == ac.getPetugas()){
                        new MenuPetugasController();
                        loginpetugas.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(loginpetugas, "Id Salah!");
                    }
                }
            }
        }else if(event == loginpetugas.getBack()){
            new LoginController();
            loginpetugas.dispose();
        }
    }
    
}
