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
public class Gudang {
    private int noGudang;
    private String namaGudang;
    private int maxBarang=50;
    private int nBarang = 0;
    private Barang[] b;

    public Gudang(int noGudang) {
        this.noGudang = noGudang;
        b = new Barang[maxBarang];
    }

    public Gudang() {
    }
    

    public void addMasuk(Barang b) {
        if (nBarang < maxBarang) {
            this.b[nBarang] = b;
            nBarang++;
        }
    }
    
    public void setNamaGudang(String namaGudang){
        this.namaGudang = namaGudang;
    }
    
    public String getNamaGudang(){
        return namaGudang;
    }

    public void setNoGudang(int noGudang) {
        this.noGudang = noGudang;
    }

    public int getNoGudang() {
        return noGudang;
    }

    public Barang getBarang(int i) {
        if (i < b.length) {
            return b[i];
        } else {
            return null;
        }
    }
    
    public void getHapusBarang(Barang brg){
        int i;
        for (i=0; i<b.length; i++){
            if (b[i] == brg) {
                b[i] = null;
                break;
            }
        }
        while ((i<b.length) && (b[i]!=null)) {
            i++;
        }
        while ((i<b.length) && (b[i+1]!=null)) {
            b[i] = b[i+1];
            i++;
        }
        nBarang--;
    }
    
    public int getNBarang(){
        return nBarang;
    }
}
