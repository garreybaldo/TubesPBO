/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes.Penyedia;
import java.awt.event.FocusListener;
import Database.Database;
import Model.Aplikasi;
import java.awt.event.FocusEvent;
import java.sql.SQLException;

/**
 *
 * @author Baldo
 */
public class LoginPenyediaController implements ActionListener, FocusListener {
    private LoginPenyedia loginpenyedia;
    Aplikasi model;
    Database db;
    
    public LoginPenyediaController(){
        loginpenyedia = new LoginPenyedia();
        loginpenyedia.setVisible(true);
        loginpenyedia.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event == loginpenyedia.getLogin())
        {
            if (loginpenyedia.getInputId().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(loginpenyedia,"Tidak Boleh Kosong");
            }else 
            {
                boolean log = false;
                 try {
                    log = db.cekPenyedia(Long.parseLong(loginpenyedia.getInputId().getText()));
                } catch (SQLException ex) {
                     System.err.println(ex);                
                }
                if(log){
                    JOptionPane.showMessageDialog(loginpenyedia,"Login berhasil");
                    try {
                        Penyedia py = db.getDataPenyedia(Long.parseLong(loginpenyedia.getInputId().getText()));
                        //new MenuPenyediaController(py);
                        loginpenyedia.dispose(); 
                    } catch (SQLException ex) {
                        System.err.println("Data error");      
                        System.out.println(ex);
                    } 
                }else{
                    JOptionPane.showMessageDialog(loginpenyedia,"Log In Pengemudi Gagal Dilakukan");
                }       
            }
        }
        else if (event == loginpenyedia.getBack()){
            new LoginController(model);
            loginpenyedia.dispose();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

