/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tubes.Barang;
import tubes.Penyedia;
import tubes.Petugas;

/**
 *
 * @author Baldo
 */
public class Database {
    private String server = "jdbc:mysql://localhost:3306/sisfogudang", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public Connection getConn() {
        return con;
    }

    public void savePenyedia(Penyedia py) {
        try {
            String query = "INSERT INTO `penyedia`(`nama`, `nip`) VALUES ("
                    + "'" + py.getNama() + "',"
                    + "'" + py.getNip() + "')";
            st.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            int generatedId = -1;
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
            py.setNip(generatedId);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Penyedia getPenyedia(int idPenyedia) {
        Penyedia py = null;
        try {
            String query = "SELECT * FROM `peneydia` WHERE `nip` = " + idPenyedia;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                py = new Penyedia(rs.getString(1), rs.getInt(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return py;
    }

    public String[] getListNipPenyedia() {
        ArrayList<String> listNip = new ArrayList<>();
        try {
            //Query?
            String query = "SELECT nip FROM `penyedia`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listNip.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listNip.toArray(new String[0]);
    }
    
    public void savePetugas(Petugas pt) {
        try {
            String query = "INSERT INTO `petugas`(`nama`, `nip`) VALUES ("
                    + "'" + pt.getNama() + "',"
                    + "'" + pt.getNip() + "')";
            st.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            int generatedId = -1;
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
            pt.setNip(generatedId);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Petugas getPetugas(int idPetugas) {
        Petugas pt = null;
        try {
            String query = "SELECT * FROM `petugas` WHERE `nip` = " + idPetugas;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                pt = new Petugas(rs.getString(1), rs.getInt(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pt;
    }

    public String[] getListNipPetugas() {
        ArrayList<String> listNip = new ArrayList<>();
        try {
            //Query?
            String query = "SELECT nip FROM `petugas`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listNip.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listNip.toArray(new String[0]);
    }
    
    public void saveBarang(Barang b) {
        try {
            String query = "INSERT INTO `barang`(`index`, `namab`, `jml`) VALUES ("
                    + "'" + b.getIndex() + "',"
                    + "'" + b.getNamaB() + "',"
                    + "'" + b.getJml() + "')";
            st.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            int generatedId = -1;
            if (rs.next()) {
                generatedId = rs.getInt(1);
            }
            b.setIndex(generatedId);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Barang getBarang(int idBrg) {
        Barang b = null;
        try {
            String query = "SELECT * FROM `barang` WHERE `index` = " + idBrg;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                b = new Barang(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return b;
    }

    public String[] getListIndexBarang() {
        ArrayList<String> listIndex = new ArrayList<>();
        try {
            //Query?
            String query = "SELECT nip FROM `barang`";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                listIndex.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listIndex.toArray(new String[0]);
    }
    
    public void deletePenyedia(long nip) throws SQLException {
        Penyedia py = null;
        String query = "DELETE * FROM `penyedia` WHERE `nip` = " + nip;
        ResultSet rs = st.executeQuery(query);
    }
    
    public void deletePetugas(long nip) throws SQLException {
        Petugas pt = null;
        String query = "DELETE * FROM `petugas` WHERE `nip` = " + nip;
        ResultSet rs = st.executeQuery(query);
            
    }
    
    public void deleteGudang(int no) throws SQLException {
        Penyedia py = null;
        String query = "DELETE * FROM `gudang` WHERE `noGudang` = " + no;
        ResultSet rs = st.executeQuery(query);
            
    }
    
    public boolean cekPenyedia(long nip) throws SQLException{
        st = getConn().createStatement();
        String query = "select * from penyedia where nip='"+nip+"'";
        ResultSet rs = st.executeQuery(query);
        if (rs != null && rs.next()) {
           return true;
        }else{
           return false;
        }
    }
    
    public boolean cekPetugas(long nip) throws SQLException{
        st = getConn().createStatement();
        String query = "select * from petugas where nip='"+nip+"'";
        ResultSet rs = st.executeQuery(query);
        if (rs != null && rs.next()) {
           return true;
        }else{
           return false;
        }
    }
    
    public Penyedia getDataPenyedia(long nip) throws SQLException{        
        st = getConn().createStatement();
        String query = "select * from penedia where nip='"+nip+"'";
        ResultSet rs = st.executeQuery(query);
        if (rs != null && rs.next()) {
           Penyedia py = new Penyedia(rs.getString("nama"),rs.getLong("nip"));
           return py;
        }
        
        return null;
    }
}
