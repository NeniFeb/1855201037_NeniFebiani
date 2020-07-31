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
public class insert {

    Koneksi konek = new Koneksi();

    public void insert(String kode, String judul, String penulis, String penerbit, String tahun, String stock) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            
            String sql = "INSERT INTO `perpustakaan`.`buku` (`id_buku`, `kode_buku`, `judul_buku`, `penulis_buku`, "
                    + "`penerbit_buku`, `tahun_penerbit`, `stok`) "
                    + "VALUES (NULL, '" + kode + "', '" + judul + "', '" + penulis + "', '" + penerbit + "', '" 
                    + tahun + "', '" + stock + "');";
            //String sql = "insert into buku values('"+ null +"'," + kode + "','" + judul + "','" + penulis + "','" + penerbit + "','" + tahun + "','" + stock + "');";

            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
