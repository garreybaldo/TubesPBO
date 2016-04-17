/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.CariGudang;
import View.CariPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class CariGudangController implements ActionListener {
    private CariGudang carigudang;
    Aplikasi model;
    
    public CariGudangController(){
        carigudang = new CariGudang();
        carigudang.setVisible(true); 
        carigudang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == carigudang.getCari()){
            if(carigudang.getNo().isEmpty()){
                JOptionPane.showMessageDialog(carigudang, "Id tidak ada!");
            }else{                
                JOptionPane.showMessageDialog(carigudang, "Ada");
                //new UtamaController();
                //hapuspenyedia.dispose();
            }
        }else if(event == carigudang.getBack()){
            new CariController(model);
            carigudang.dispose();
        }
    }
    
}
