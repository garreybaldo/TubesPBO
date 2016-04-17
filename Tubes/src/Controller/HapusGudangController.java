/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HapusGudang;
import View.HapusPetugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Baldo
 */
public class HapusGudangController implements ActionListener {
    private HapusGudang hapusgudang;
    
    public HapusGudangController(){
        hapusgudang = new HapusGudang();
        hapusgudang.setVisible(true); 
        hapusgudang.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if(event == hapusgudang.getHapus()){
            if(hapusgudang.getNo().isEmpty()){
                JOptionPane.showMessageDialog(hapusgudang, "Id tidak ada!");
            }else{                
                JOptionPane.showMessageDialog(hapusgudang, "Hapus penyedia berhasil");
                new HapusController();
                hapusgudang.dispose();
            }
        }else if(event == hapusgudang.getBack()){
            new HapusController();
            hapusgudang.dispose();
        }
    }
    
}
