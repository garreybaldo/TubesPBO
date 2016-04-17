/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import tubes.Barang;
import tubes.Penyedia;
import tubes.Petugas;
import Database.Database;

/**
 *
 * @author Baldo
 */
public class Aplikasi {
    private ArrayList<Penyedia> daftarPenyedia;
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<Barang> daftarBarang;
    private Database con;
    private int index = -1;

    public Aplikasi() {
        this.daftarPenyedia = new ArrayList<>();
        this.daftarPetugas = new ArrayList<>();
        this.daftarBarang = new ArrayList<>();
        this.con = new Database();
        con.connect();
    }

    //Bingung yg dimasukkan objek p atau arraylist
    public long createPenyedia(String nama, Long nip) {
        Penyedia py = new Penyedia(nama, nip);
        daftarPenyedia.add(py);
        con.savePenyedia(py);
        
        //con.savePelanggan(daftarPelanggan.get(index));
        
        //return daftarPelanggan.get(index).getIdPelanggan();
        return py.getNip();
    }
    
    public long createPetugas(String nama, Long nip) {
        Petugas pt = new Petugas(nama, nip);
        daftarPetugas.add(pt);
        con.savePetugas(pt);
        
        //con.savePelanggan(daftarPelanggan.get(index));
        
        //return daftarPelanggan.get(index).getIdPelanggan();
        return pt.getNip();
    }
    
    public int createBarang(int index, String namab, int jml) {
        Barang b = new Barang(index, namab, jml);
        daftarBarang.add(b);
        con.saveBarang(b);
        
        //con.savePelanggan(daftarPelanggan.get(index));
        
        //return daftarPelanggan.get(index).getIdPelanggan();
        return b.getIndex();
    }

    public Penyedia getPenyedia(long idPy) {
        for (Penyedia py : daftarPenyedia) {
            if (py.getNip() == idPy) {
                return py;
            }
        }
        Penyedia py = con.getPenyedia((int) idPy);
        daftarPenyedia.add(py);
        return py;
    }
    
    public Petugas getPetugas(long idPt) {
        for (Petugas pt : daftarPetugas) {
            if (pt.getNip() == idPt) {
                return pt;
            }
        }
        Petugas pt = con.getPetugas((int) idPt);
        daftarPetugas.add(pt);
        return pt;
    }
    
    public Barang getBarang(int idBrg) {
        for (Barang b : daftarBarang) {
            if (b.getIndex() == idBrg) {
                return b;
            }
        }
        Barang b = con.getBarang(idBrg);
        daftarBarang.add(b);
        return b;
    }

    public String[] getListNipPenyedia() {
        return con.getListNipPenyedia();
    }
    
    public String[] getListNipPetugas() {
        return con.getListNipPetugas();
    }
    
    public String[] getListIdBarang() {
        return con.getListIndexBarang();
    }

    /*public void updatePelanggan(Pelanggan p) {
        con.updatePelanggan(p);
    }*/
    
}
