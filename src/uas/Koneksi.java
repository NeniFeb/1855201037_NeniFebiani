/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import pertemuan11.*;
import pertemuan10.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    public static void main(String[] args) {
        Koneksi tesKoneksi = new Koneksi();
        tesKoneksi.koneksi();
        
    }
    String statusKoneksi;
    Connection con=null;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/perpustakaan";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statusKoneksi = "Berhasil";
        }

        catch(Exception e)
        {
         statusKoneksi ="Gagal";
        //JOptionPane.showMessageDialog(null, e);
        //System.exit(0);
        }
    }
}
