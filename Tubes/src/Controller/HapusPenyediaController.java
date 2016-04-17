/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Hapus;
import View.HapusPenyedia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class HapusPenyediaController implements ActionListener {
    private HapusPenyedia hapuspenyedia;
    Aplikasi model;
    
    public HapusPenyediaController(){
        hapuspenyedia = new HapusPenyedia();
        hapuspenyedia.setVisible(true); 
        hapuspenyedia.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == hapuspenyedia.getHapus()){
            if(hapuspenyedia.getId().isEmpty()){
                JOptionPane.showMessageDialog(hapuspenyedia, "Id tidak ada!");
            }else{                
                JOptionPane.showMessageDialog(hapuspenyedia, "Hapus penyedia berhasil");
                new UtamaController(model);
                hapuspenyedia.dispose();
            }
        }else if(event == hapuspenyedia.getBack()){
            new HapusController(model);
            hapuspenyedia.dispose();
        }
    }
    
}
