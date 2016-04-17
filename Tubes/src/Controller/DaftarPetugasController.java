/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.DaftarPenyedia;
import View.DaftarPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import tubes.Penyedia;
import tubes.Petugas;

/**
 *
 * @author Baldo
 */
public class DaftarPetugasController implements ActionListener, FocusListener {

    private DaftarPetugas daftarpetugas;
    Aplikasi model;
    DaftarPetugas view;
    Petugas pt;

    public DaftarPetugasController(Aplikasi model) {
        this.model = model;
        view = new DaftarPetugas();
        view.setVisible(true);
        view.addListener(this);
        this.view.getInputId().addFocusListener((FocusListener) this);
        this.view.getInputNama().addFocusListener((FocusListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getSubmit())) {
            String nama = view.getNama();
            long nip = view.getId();
            if (pt == null) {
                long Nip = model.createPetugas(nama, nip);
                //view.setNama("");
            } else{
                JOptionPane.showMessageDialog(view, "NIP Petugas "+pt.getNip()+" sudah ada");
            }
        } else if(event.equals(view.getBack())){
            new UtamaController(model);
            view.dispose();
        }
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        Object o = e.getSource();
        if(o.equals(this.view.getInputId())){
            if(this.view.getInputId().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak boleh kosong");
            }
        }
    }
}
