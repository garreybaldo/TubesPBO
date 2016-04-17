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
import tubes.AplikasiConsole;
import tubes.Penyedia;
import Model.Database;
import java.awt.event.FocusListener;
import Database.Database;

/**
 *
 * @author Baldo
 */
public class LoginPenyediaController implements ActionListener, FocusListener {
    private LoginPenyedia loginpenyedia;
    
    public LoginPenyediaController(){
        loginpenyedia = new LoginPenyedia();
        loginpenyedia.setVisible(true);
        loginpenyedia.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == loginpenyedia.getLogin()){
            try{
                Statement st = (Statement) con.GetConnection().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM enyedia where " + "nip=" + inputNip.getext())
            }
        }
    }
} 

