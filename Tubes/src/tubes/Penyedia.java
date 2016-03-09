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
    private static Barang[] b=new Barang[100];
    private int jumlahBarang=0;

    public static Barang[] getBarang() {
        return b;
    }

    public static void setBarang(Barang[] aB) {
        b = aB;
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
    
    public void createBarang(String index, String nama, int jml) {
        if (getJumlahBarang() < 100) {
            getBarang()[getJumlahBarang()] = new Barang(index, nama, jml);
            setJumlahBarang(getJumlahBarang() + 1);
        }
    }    
}
