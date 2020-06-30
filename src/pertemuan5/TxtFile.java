/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import pertemuan4.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class TxtFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //read txt file
        String fileName="D:/kuliah/AP/input.txt";//path
        String baris =null;
        
        //adalah class, //Objek
        FileReader fileReadejoss
                = new FileReader(fileName);
        
        BufferedReader bufferedReader
                = new BufferedReader(fileReadejoss);
        
        int bariske =0;
        while((baris = bufferedReader.readLine()) != null){
            System.out.println(baris);
        }
    }
    
}
