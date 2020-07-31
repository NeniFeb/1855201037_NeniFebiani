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
public class update {
    Koneksi konek = new Koneksi();
    
    public void update(int id,String kodeBuku,String judul,String penulis,String penerbit,String tahun,String stok)
    {
        try
        {
            konek.koneksi();
          Statement statement = konek.con.createStatement();
          
    String sql="UPDATE buku SET kode_buku ='"+ kodeBuku +"', judul_buku= '"
            + judul +"',penulis_buku='"+ penulis +"' ,penerbit_buku='"+ penerbit 
            +"',tahun_penerbit='"+ tahun +"',stok='"+ stok +"' WHERE id_buku = '"+ id +"';";

          statement.executeUpdate(sql);
          statement.close(); 
          JOptionPane.showMessageDialog(null,"Berhasil Ubah");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
