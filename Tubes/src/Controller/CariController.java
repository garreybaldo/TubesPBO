/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Cari;
import View.Daftar;
import View.Hapus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class CariController implements ActionListener {

    private Cari cari;

    Aplikasi model;
    Cari view;

    public CariController(Aplikasi model) {
        this.model = model;
        view = new Cari();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getCariPenyedia())) {
            new CariPenyediaController();
            view.dispose();
        } else if(event.equals(view.getCariPetugas())){
            new CariPetugasController();
            view.dispose();
        } else if(event.equals(view.getCariGudang())){
            new CariGudangController();
            view.dispose();
        }else if(event.equals(view.getBack())){
            new UtamaController(model);
            view.dispose();
        }
    }
}
