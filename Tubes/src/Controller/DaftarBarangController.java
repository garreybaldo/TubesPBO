/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.DaftarBarang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Baldo
 */
public class DaftarBarangController implements ActionListener {
    DaftarBarang daftarbarang = new DaftarBarang();
    
    public DaftarBarangController(){
        daftarbarang = new DaftarBarang();
        daftarbarang.setVisible(true);
        daftarbarang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
