/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Baldo
 */
public class Penyedia extends Petugas {
    private Barang[] b=new Barang[100];
    private int jumlahBarang=0;

    public Barang[] getBarang() {
        return b;
    }
    
    public Barang getBarang(int indx) {
        Barang brg = new Barang();
        for (int i=0; i<b.length; i++) {
            if (b[i].getIndex() == indx) {
                brg = b[i];
            }
        }
        
        return brg;
    }

    public void setBarang(Barang aB) {
        if (jumlahBarang < b.length) {
            b[jumlahBarang] = aB;
            jumlahBarang++;
        } else {
            System.out.println("Penuh");
        }
    }
    
    public Penyedia(String nama, long nip){
        super(nama,nip);
    }
    
    public int getJumlahBarang() {
        return jumlahBarang;
    }
    
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    public void createBarang(int index, String nama, int jml) {
        if (getJumlahBarang() < 100) {
            getBarang()[getJumlahBarang()] = new Barang(index, nama, jml);
            getBarang()[getJumlahBarang()].setIdPenyedia(getNip());
            setJumlahBarang(getJumlahBarang() + 1);
        }
    }    
}
