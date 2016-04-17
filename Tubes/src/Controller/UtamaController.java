/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.DaftarPenyedia;
import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;
import tubes.Penyedia;

/**
 *
 * @author Baldo
 */
public class UtamaController implements ActionListener {
    private Utama utama;
    
    Aplikasi model;
    Utama view;

    public UtamaController(Aplikasi model) {
        this.model = model;
        view = new Utama();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getDaftarButton())) {
            new DaftarController(model);
        } else if(event.equals(view.getLoginButton())){
            new LoginController(model);
            view.dispose();
        } else if(event.equals(view.getHapusButton())){
            new HapusController(model);
            view.dispose();
        } else if(event.equals(view.getCariButton())){
            new CariController(model);
            view.dispose();
        }
    }
}
