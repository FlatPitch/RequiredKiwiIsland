/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;
import javafx.scene.media.AudioClip;
import java.net.URL;
/**
 *
 * @author Liandri
 */
public class Sounds {
    final  URL URL1 = getClass().getResource("/nz/ac/aut/ense701/effects/consume.wav");
    final AudioClip clip1 = new AudioClip(URL1.toString());
    
    final  URL URL2 = getClass().getResource("/nz/ac/aut/ense701/effects/hazard.wav");
    final AudioClip clip2 = new AudioClip(URL2.toString());
    
    final  URL URL3 = getClass().getResource("/nz/ac/aut/ense701/effects/break.wav");
    final AudioClip clip3 = new AudioClip(URL3.toString());
    
    final  URL URL4 = getClass().getResource("/nz/ac/aut/ense701/effects/death.wav");
    final AudioClip clip4 = new AudioClip(URL4.toString());
    
    final  URL URL5 = getClass().getResource("/nz/ac/aut/ense701/effects/death.wav");
    final AudioClip clip5 = new AudioClip(URL5.toString());
    
    
public void playStaminaIncrease(){
    clip1.play();
}
public void playHazard(){
    clip2.play();
}
public void playBreakTrap(){
    clip3.play();
}
public void playDeath(){
    clip4.play();
}
public void playwin(){
    clip4.play();
}
    
}
