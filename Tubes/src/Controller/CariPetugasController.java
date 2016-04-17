/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CariPenyedia;
import View.CariPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class CariPetugasController implements ActionListener {
    private CariPetugas caripetugas;
    
    public CariPetugasController(){
        caripetugas = new CariPetugas();
        caripetugas.setVisible(true); 
        caripetugas.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == caripetugas.getCari()){
            if(caripetugas.getId().isEmpty()){
                JOptionPane.showMessageDialog(caripetugas, "Id tidak ada!");
            }else{                
                JOptionPane.showMessageDialog(caripetugas, "Ada");
                //new UtamaController();
                //hapuspenyedia.dispose();
            }
        }else if(event == caripetugas.getBack()){
            new CariController();
            caripetugas.dispose();
        }
    }
    
}
