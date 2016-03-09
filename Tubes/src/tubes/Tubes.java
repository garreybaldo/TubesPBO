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
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tambah barang ke gudang 1
        Gudang g1 = new Gudang(001);
        Barang b1 = new Barang("123","Kursi",1);
        Barang b2 = new Barang("124","Meja",3);
        Barang b3 = new Barang("125","Lemari",1);
        Barang b4 = new Barang("126","Kasur",2);
        g1.addMasuk(b1);
        g1.addMasuk(b2);
        g1.addMasuk(b3);
        g1.addMasuk(b4);
        
        //Tambah barang ke gudang 2
        Gudang g2 = new Gudang(002);
        Barang c1 = new Barang("223","Kursi",1);
        Barang c2 = new Barang("224","Meja",3);
        Barang c3 = new Barang("225","Lemari",1);
        Barang c4 = new Barang("226","Kasur",2);
        g2.addMasuk(c1);
        g2.addMasuk(c2);
        g2.addMasuk(c3);
        g2.addMasuk(c4);
        
        //Menapilkan semua isi gudang
        System.out.println("Barang pada gudang " + g1.getNoGudang() + ":");
        System.out.println("Jumlah barang : "+ g1.getNBarang());
        System.out.println();
        for (int i=0; i<g1.getNBarang(); i++){
            System.out.println("Nomor Barang  : " + g1.getBarang(i).getIndex());
            System.out.println("Nama Barang   : " + g1.getBarang(i).getNamaB());
            System.out.println("Jumlah Barang : " + g1.getBarang(i).getJml());
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Barang pada gudang " + g2.getNoGudang() + ":");
        System.out.println("Jumlah barang : " + g2.getNBarang());
        System.out.println();
        for (int i=0; i<g2.getNBarang(); i++){
            System.out.println("Nomor Barang  : " + g2.getBarang(i).getIndex());
            System.out.println("Nama Barang   : " + g2.getBarang(i).getNamaB());
            System.out.println("Jumlah Barang : " + g2.getBarang(i).getJml());
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Hapus kursi pada gudang 2");
        System.out.println();
        g2.getHapusBarang(c1);
        for (int i=0; i<g2.getNBarang(); i++){
            System.out.println("Nomor Barang  : " + g2.getBarang(i).getIndex());
            System.out.println("Nama Barang   : " + g2.getBarang(i).getNamaB());
            System.out.println("Jumlah Barang : " + g2.getBarang(i).getJml());
            System.out.println();
        }        
    }
    
}
