/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;
import View.LoginPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class LoginPenyediaController implements ActionListener {
    private LoginPenyedia loginpenyedia;
    
    public LoginPenyediaController(){
        loginpenyedia = new LoginPenyedia();
        loginpenyedia.setVisible(true);
        loginpenyedia.addListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == loginpenyedia.getLogin()){
            if(inputId.getText() == ){
                new LoginPenyediaController();
                loginpenyedia.dispose();
            }else{
                JOptionPane.showMessageDialog(loginpenyedia, "Id Salah");
            }
        }else if(event == loginpenyedia.getBack()){
            new LoginController();
            loginpenyedia.dispose();
        }//else if(
            
        
    }
}
