/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class insert {
    Koneksi konek = new Koneksi();
    
    public void insert(int nim,String nama,String alamat,String jk)
    {
        try
        {
            konek.koneksi();
          Statement statement = konek.con.createStatement();
          
    String sql="insert into identitas values('"+nim+"','"+nama+"','"+alamat+"','"+jk+"');";

          statement.executeUpdate(sql);
          statement.close(); 
          JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
