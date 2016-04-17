/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Daftar;
import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class DaftarController implements ActionListener {
    private Daftar daftar;
    
    Aplikasi model;
    Daftar view;

    public DaftarController(Aplikasi model) {
        this.model = model;
        view = new Daftar();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getDaftarPenyedia())) {
            new DaftarPenyediaController(model);
        } else if(event.equals(view.getDaftarPetugas())){
            new DaftarPetugasController(model);
            view.dispose();
        }
    }
}
