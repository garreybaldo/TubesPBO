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
public class Barang {
    private long idPenyedia;
    private String index;
    private String namab;
    private int jml;
    
    public Barang(String index, String namab, int jml){
        this.index = index;
        this.namab = namab;
        this.jml = jml;
    }

    public Barang() {
    }
    
    

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNamaB() {
        return namab;
    }

    public void setNama(String namab) {
        this.namab = namab;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    /**
     * @return the idPenyedia
     */
    public long getIdPenyedia() {
        return idPenyedia;
    }

    /**
     * @param idPenyedia the idPenyedia to set
     */
    public void setIdPenyedia(long idPenyedia) {
        this.idPenyedia = idPenyedia;
    }
}
