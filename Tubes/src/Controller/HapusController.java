/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Cari;
import View.Hapus;
import View.Utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class HapusController implements ActionListener {

    private Hapus hapus;

    Aplikasi model;
    Hapus view;

    public HapusController(Aplikasi model) {
        this.model = model;
        view = new Hapus();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getHapusPenyedia())) {
            new HapusPenyediaController(model);
        } else if(event.equals(view.getHapusPetugas())){
            new HapusPetugasController(model);
            view.dispose();
        } else if(event.equals(view.getHapusGudang())){
            new HapusGudangController(model);
            view.dispose();
        }
    }
}
