/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Baldo
 */
public class AplikasiConsole {
    Scanner scan = new Scanner(System.in);
    //JavaHowTo utility = new JavaHowTo();
    private Gudang[] daftarGudang;
    private Penyedia[] daftarPenyedia;
    private Petugas[] daftarPetugas;
    int nGudang = 0;
    int nPy = 0;
    int nPt = 0;

    public AplikasiConsole() {
        daftarGudang = new Gudang[20];
        daftarPenyedia = new Penyedia[20];
        daftarPetugas = new Petugas[20];
    }

    public void addPenyedia(Penyedia py) {
        if (nPy <= daftarPenyedia.length) {
            daftarPenyedia[nPy] = py;
            nPy++;
        } else {
            System.out.println("Slot Penyedia penuh");
        }
    }

    public void addPetugas(Petugas pt) {
        if (nPt <= daftarPetugas.length) {
            daftarPetugas[nPt] = pt;
            nPt++;
        } else {
            System.out.println("Slot Petugas penuh");
        }
    }

    public void addGudang(Gudang gd) {
        if (nGudang <= daftarGudang.length) {
            daftarGudang[nGudang] = gd;
            nGudang++;
        } else {
            System.out.println("Slot Gudang penuh");
        }
    }

    public void deletePetugas(long nip) {
        int i;
        for (i = 0; i < nPt; i++) {
            if (daftarPetugas[i].getNip() == nip) {
                break;
            }
        }
        int j;
        for (j = i; j < nPt; j++) {
            daftarPetugas[j] = daftarPetugas[j + 1];
        }
        nPt--;
    }

    public void deletePenyedia(long nip) {
        int i;
        for (i = 0; i < nPy; i++) {
            if (daftarPenyedia[i].getNip() == nip) {
                break;
            }
        }
        int j;
        for (j = i; j < nPy; j++) {
            daftarPenyedia[j] = daftarPenyedia[j + 1];
        }
        nPy--;
    }

    public void deleteGudang(int noGudang) {
        int i;
        for (i = 0; i < nGudang; i++) {
            if (daftarGudang[i].getNoGudang() == noGudang) {
                break;
            }
        }
        int j;
        for (j = i; j < nGudang; j++) {
            daftarGudang[j] = daftarGudang[j + 1];
        }
        nGudang--;
    }

    public Penyedia getPenyedia(long nip) {
        int i;
        for (i = 0; i < nPy; i++) {
            if (daftarPenyedia[i].getNip() == nip) {
                break;
            }
        }
        return daftarPenyedia[i];
    }

    public Petugas getPetugas(long nip) {
        int i;
        for (i = 0; i < nPt; i++) {
            if (daftarPetugas[i].getNip() == nip) {
                break;
            }
        }
        return daftarPetugas[i];
    }

    public Gudang getGudang(int noGudang) {
        int i;
        for (i = 0; i < nGudang; i++) {
            if (daftarGudang[i].getNoGudang() == noGudang) {
                break;
            }
        }
        return daftarGudang[i];
    }

    public void menuAddBarang() {
        System.out.print("No Barang: ");
        String no = scan.nextLine();
        System.out.print("NIP Penyedia: ");
        long nip = scan.nextInt();
        if (getPenyedia(nip).getBarang(no) != null) {
            System.out.print("No Gudang: ");
            int ng = scan.nextInt();
            if (getGudang(ng) != null) {
                int i = 0;
                getGudang(ng).addMasuk(getGudang(ng).getBarang(i));
                getPenyedia(nip).getBarang(no);
            } else {
                System.out.println("Gudang tidak ada");
            }
        } else {
            System.out.println("Tidak ada penyedia / barang yang diinginkan");
        }
    }

    public void menuDeleteBarang() {
        Barang a = new Barang();
        System.out.print("No Barang: ");
        int no = scan.nextInt();
        System.out.print("No Gudang: ");
        int ng = scan.nextInt();
        if (getGudang(ng).getBarang(no) != null) {
            a = getGudang(ng).getBarang(no);
            getGudang(ng).getHapusBarang(a);
            //nBarang--;
        } else {
            System.out.println("Tidak ada gudang / barang yang diinginkan");
        }
    }

    public void createBarang(Penyedia p) {
        Barang newbrg = new Barang();
        System.out.print("ID    : ");
        String index = scan.nextLine();
        System.out.print("Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Jumlah: ");
        int jml = scan.nextInt();
        newbrg.setIndex(index);
        newbrg.setNama(nama);
        newbrg.setJml(jml);
        p.setBarang(newbrg);
    }

    public void menuDaftarBarang(Penyedia p) {
            for(int i=0; i<=getPenyedia(p.getNip()).getJumlahBarang(); i++){
                System.out.println("Index   : " + Arrays.toString(getPenyedia(p.getNip()).getBarang()));
                System.out.println("Nama    : " + Arrays.toString(getPenyedia(p.getNip()).getBarang()));
                System.out.println("Jumlah  : " + Arrays.toString(getPenyedia(p.getNip()).getBarang()));
                System.out.println("---------------------------------------");
            }
    }

    public void menuLihatSemuaBarang() {
        for (int j = 0; j<=daftarGudang.length; j++) {
            System.out.println("Gudang no: " + daftarGudang[j].getNoGudang());
            for(int i=0; i<=daftarGudang[j].getNBarang(); i++){
                System.out.println("Barang ke- " + i);
                System.out.println("Index   : " + daftarGudang[j].getBarang(i).getIndex());
                System.out.println("Nama    : " + daftarGudang[j].getBarang(i).getNamaB());
                System.out.println("Jumlah  : " + daftarGudang[j].getBarang(i).getJml());
                System.out.println("---------------------------------------");
            }
        }
    }
    
    public void menuLihatGudang(){
        System.out.println("No Gudang: ");
        int no = scan.nextInt();
        for(int i=0; i<=daftarGudang.length; i++){
            if(no == daftarGudang[i].getNoGudang()){
                for(int j=0; j<=daftarGudang[i].getNBarang(); j++){
                    System.out.println("Index   : " + daftarGudang[i].getBarang(j).getIndex());
                    System.out.println("Nama    : " + daftarGudang[i].getBarang(j).getNamaB());
                    System.out.println("Jumlah  : " + daftarGudang[i].getBarang(j).getJml());
                    System.out.println("---------------------------------------");
                }
            }
            else{
                System.out.println("Gudang tidak ada.");
            }
        }
    }

    public void menuDaftarPenyedia() {
        System.out.print("NIP Penyedia: ");
        long nip = scan.nextLong();
        if (getPenyedia(nip) == null) {
            System.out.print("Nama Penyedia: ");
            scan.nextLine();
            String nama = scan.nextLine();            
            Penyedia p = new Penyedia(nama, nip);
            addPenyedia(p);
        } else {
            System.out.println("NIP sudah ada");
        }
    }

    public void menuDaftarPetugas() {
        System.out.print("NIP Petugas: ");
        long nip = scan.nextLong();
        if (getPetugas(nip) == null) {
            System.out.print("Nama Petugas: ");
            String nama = scan.nextLine();
            Petugas p = new Petugas(nama, nip);
            addPetugas(p);
        } else {
            System.out.println("NIP sudah ada");
        }
    }

    public void menuLoginPenyedia() {
        System.out.print("NIP Penyedia: ");
        long nip = scan.nextInt();
        if (getPenyedia(nip) != null) {
            //do {
                System.out.println("1. Buat Barang");
                System.out.println("2. Daftar Barang");
                System.out.println("3. Logout");
                System.out.print("Pilih menu: ");
                int x = scan.nextInt();
                switch (x) {
                    case 1:
                        //utility.cls();
                        createBarang(getPenyedia(nip));
                        break;
                    case 2:
                        //utility.cls();
                        //menuDaftarBarang();
                        break;
                    case 3: 
                        //utility.cls();
                        MainMenu();
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                }
            //}while(x != 3);        
        } else {
            System.out.println("NIP salah");
            menuLoginPenyedia();
        }
    }

    public void menuLoginPetugas() {
        System.out.print("NIP Pegas: ");
        long nip = scan.nextInt();
        if (getPetugas(nip) != null) {
            //do {
                System.out.println("1. Tambah Barang");
                System.out.println("2. Hapus Barang");
                System.out.println("3. Lihat Gudang");
                System.out.println("4. Lihat Semua Barang");
                System.out.println("5. Logout");
                System.out.print("Pilih menu: ");
                int x = scan.nextInt();
                switch (x) {
                    case 1:
                        //utility.cls();
                        menuAddBarang();
                        break;
                    case 2:
                        //utility.cls();
                        menuDeleteBarang();
                        break;
                    case 3:
                        //utility.cls();
                        menuLihatGudang();
                        break;
                    case 4:
                        //utility.cls();
                        menuLihatSemuaBarang();
                        break;
                    case 5:
                        //utility.cls();
                        MainMenu();
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                }
            //}while(x != 5);
        }
	else {
            System.out.println("NIP salah");
            menuLoginPetugas();
        }
    }

    public void menuHapusGudang() {
        System.out.print("No Gudang: ");
        int no = scan.nextInt();
        for(int i=0; i<=daftarGudang.length; i++){
            if (no == daftarGudang[i].getNoGudang()) {
                deleteGudang(no);
                System.out.println("Gudang berhasil dihapus");
            } else {
                System.out.println("Gudang gagal dihapus, no Gudang tidak ditemukan");
            }
        }
    }

    public void menuHapusPenyedia() {
        System.out.print("NIP Penyedia: ");
        int nip = scan.nextInt();
        if (getPenyedia(nip) != null) {
            deletePenyedia(nip);
            System.out.println("Penyedia berhasil dihapus");
        } else {
            System.out.println("Penyedia gagal dihapus, NIP Penyedia tidak ditemukan");
        }
    }

    public void menuHapusPetugas() {
        System.out.print("NIP Petugas: ");
        int nip = scan.nextInt();
        if (getPetugas(nip) != null) {
            deletePetugas(nip);
            System.out.println("Petugas berhasil dihapus");
        } else {
            System.out.println("Petugas gagal dihapus, NIP Petugas tidak ditemukan");
        }
    }

    public void searchGudang() {
        System.out.print("No Gudang: ");
        int no = scan.nextInt();
        if (getGudang(no) != null) {
            System.out.println("No Gudang: " + getGudang(no).getNoGudang());
            System.out.println("Nama Gudang: " + getGudang(no).getNamaGudang());
        } else {
            System.out.println("Gudang tidak ditemukan");
        }
    }

    public void searchPenyedia() {
        System.out.print("NIP Penyedia: ");
        long nip = scan.nextInt();
        if (getPenyedia(nip) != null) {
            System.out.println("NIP Penyedia: " + getPenyedia(nip).getNip());
            System.out.println("Nama Penyedia: " + getPenyedia(nip).getNama());
        } else {
            System.out.println("Penyedia tidak ditemukan");
        }
    }

    public void searchPetugas() {
        System.out.print("NIP Petugas: ");
        long nip = scan.nextInt();
        if (getPetugas(nip) != null) {
            System.out.println("NIP Petugas: " + getPetugas(nip).getNip());
            System.out.println("Nama Petugas: " + getPetugas(nip).getNama());
        } else {
            System.out.println("Petugas tidak ditemukan");
        }
    }

    public void MainMenu() {
        //Scanner scan = new Scanner(System.in);
        int x;
        do {
            System.out.println("Aplikasi Gudang");
            System.out.println("---------------");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Hapus");
            System.out.println("4. Cari");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    int a;
                    //utility.cls();
                    System.out.println("1. Daftar Penyedia");
                    System.out.println("2. Daftar Petugas");
                    System.out.println("3. Back");
                    System.out.print("Pilih menu: ");
                    a = scan.nextInt();
                    switch (a) {
                        case 1:
                            //utility.cls();
                            menuDaftarPenyedia();
                            break;
                        case 2:
                            //utility.cls();
                            menuDaftarPetugas();
                            break;
                        case 3:
                            //utility.cls();
                            MainMenu();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                    break;
                case 2:
                    int b;
                    //utility.cls();
                    System.out.println("1. Login Penyedia");
                    System.out.println("2. Login Petugas");
                    System.out.println("3. Back");
                    System.out.print("Pilih menu: ");
                    b = scan.nextInt();
                    switch (b) {
                        case 1:
                            //utility.cls();
                            menuLoginPenyedia();
                            break;
                        case 2:
                            //utility.cls();
                            menuLoginPetugas();
                            break;
                        case 3:
                            //utility.cls();
                            MainMenu();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                    break;
                case 3:
                    int c;
                    //utility.cls();
                    System.out.println("1. Hapus Penyedia");
                    System.out.println("2. Hapus Petugas");
                    System.out.println("3. Hapus Gudang");
                    System.out.println("4. Back");
                    System.out.print("Pilih menu: ");
                    c = scan.nextInt();
                    switch (c) {
                        case 1:
                            //utility.cls();
                            menuHapusPenyedia();
                            break;
                        case 2:
                            //utility.cls();
                            menuHapusPetugas();
                            break;
                        case 3:
                            //utility.cls();
                            //menuHapusGudang();
                            break;
                        case 4:
                            //utility.cls();
                            MainMenu();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                case 4:
                    int d;
                    //c
                    System.out.println("1. Cari Penyedia");
                    System.out.println("2. Cari Petugas");
                    System.out.println("3. Cari Gudang");
                    System.out.println("4. Back");
                    System.out.print("Pilih menu: ");
                    d = scan.nextInt();
                    switch (d) {
                        case 1:
                            //utility.cls();
                            searchPenyedia();
                            break;
                        case 2:
                            //utility.cls();
                            searchPetugas();
                            break;
                        case 3:
                            //utility.cls();
                            searchGudang();
                            break;
                        case 4:
                            //utility.cls();
                            MainMenu();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
            }
        } while (x != 5);
    }

    /*private static class JavaHowTo {

        public JavaHowTo() {
        }

        private void cls() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/
}
