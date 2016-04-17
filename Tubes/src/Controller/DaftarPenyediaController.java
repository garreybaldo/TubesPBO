/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Daftar;
import View.DaftarPenyedia;
import View.Utama;
import java.awt.event.*;
import javax.swing.JOptionPane;
import tubes.AplikasiConsole;
import tubes.Penyedia;

/**
 *
 * @author Baldo
 */
public class DaftarPenyediaController implements ActionListener, FocucListener {

    private DaftarPenyedia daftarpenyedia;
    Aplikasi model;
    DaftarPenyedia view;
    Penyedia py;

    public DaftarPenyediaController(Aplikasi model) {
        this.model = model;
        daftarpenyedia = new DaftarPenyedia();
        daftarpenyedia.setVisible(true);
        daftarpenyedia.addListener(this);
        this.view.getInputId().addFocusListener((FocusListener) this);
        this.view.getInputNama().addFocusListener((FocusListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event.equals(view.getSubmit())) {
            String nama = view.getNama();
            long nip = view.getId();
            if (py == null) {
                long Nip = model.createPenyedia(nama, nip);
                //view.setNama("");
            } else{
                JOptionPane.showMessageDialog(view, "NIP Penyedia "+py.getNip()+" sudah ada");
            }
        } else if(event.equals(view.getBack())){
            new UtamaController(model);
            view.dispose();
        }
    }
    
    public void focusGained(FocusEvent e) {
        
    }

    public void focusLost(FocusEvent e) {
        Object o = e.getSource();
        if(o.equals(this.view.getInputId())){
            if(this.view.getInputId().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Tidak boleh kosong");
            }
        }
    }
}
