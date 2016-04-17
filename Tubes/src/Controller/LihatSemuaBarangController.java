/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatSemuaBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class LihatSemuaBarangController implements ActionListener {
    LihatSemuaBarang lihatsemuabarang = new LihatSemuaBarang();
    
    public LihatSemuaBarangController(){
        lihatsemuabarang = new LihatSemuaBarang();
        lihatsemuabarang.setVisible(true);
        lihatsemuabarang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
