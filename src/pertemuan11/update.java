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
public class update {
    Koneksi konek = new Koneksi();
    
    public void update(int nim,String nama,String alamat,String jk)
    {
        try
        {
            konek.koneksi();
          Statement statement = konek.con.createStatement();
          
    String sql="UPDATE identitas SET nama ='"+ nama +"', alamat= '"+ alamat +"',jk='"+ jk +"'  WHERE nim = '"+ nim +"';";

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
