/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 *
 * @author ASUS
 */
public class wavplayer {
    
    private static AudioClip musik;
    
    public void mainMusik(String source){
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.play();
    
    }
    public void stopMusik(String source){
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.stop();
    
    }
    public static void main(String[] args) {
        wavplayer sik = new wavplayer();
        sik.mainMusik("lathi.wav");
        
    }
    
    
}
