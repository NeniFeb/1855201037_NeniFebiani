/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import pertemuan11.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class delet {
    Koneksi konek = new Koneksi();
    
    public void delet(String kodeBuku)
    {
        try
        {
            konek.koneksi();
          Statement statement = konek.con.createStatement();
          
    String sql="DELETE FROM `buku` WHERE kode_buku = '"+ kodeBuku+"';";

          statement.executeUpdate(sql);
          statement.close(); 
          JOptionPane.showMessageDialog(null,"Berhasil Dihapus");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
