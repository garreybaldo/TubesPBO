/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.CariPenyedia;
import View.HapusPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class CariPenyediaController extends MouseAdapter implements ActionListener {
    private CariPenyedia caripenyedia;
    
    Aplikasi model;
    CariPenyedia view;
    
    public CariPenyediaController(){
        this.model = model;
        caripenyedia = new CariPenyedia();
        caripenyedia.setVisible(true); 
        caripenyedia.addListener(this);
        //view.addAdapter(this);
        //view.setShow(model.getListNipPenyedia());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == caripenyedia.getCari()){
            if(caripenyedia.getId().isEmpty()){
                JOptionPane.showMessageDialog(caripenyedia, "Id tidak ada!");
            }else{
            //int nipPy = view.getSelectedId();
            Penyedia py = model.getPenyedia(long nip);
            new ControllerInputPelanggan(model, p);
            view.dispose();                
                JOptionPane.showMessageDialog(caripenyedia, "Ada");
                //new UtamaController();
                //hapuspenyedia.dispose();
            }
        }else if(event == caripenyedia.getBack()){
            new CariController(model);
            caripenyedia.dispose();
        }
    }
    
}
