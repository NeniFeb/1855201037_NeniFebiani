/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author ASUS
 */
class Music extends Thread{
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("D://lathi.mp3");
            Player player = new Player(file);
            System.out.println("song play...");
            
            player.play();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        
        } catch (JavaLayerException ex) {
            ex.printStackTrace();
        }
    }
}
