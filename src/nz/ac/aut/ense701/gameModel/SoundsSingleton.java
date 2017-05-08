/*
 * This class imports the wav files URL
 * Then it turns the wav file into a string to make playing it more efficient
 */
package nz.ac.aut.ense701.gameModel;
import javafx.scene.media.AudioClip;
import java.net.URL;
/**
 *
 * @author Glen Osborne
 * returns a reference to a single SoundsSingleton object
 */
public class SoundsSingleton {
    //create a singleton to prevent mulitpule instances of sound effects in memory
    private static SoundsSingleton instance = null;
    //protected constructor
    protected SoundsSingleton() {
      // Exists only to defeat instantiation.
   }
    //method to allow acces to single instance of class
    public static SoundsSingleton getSoundsSingletonReference() {
      if(instance == null) {
         instance = new SoundsSingleton();
      }
      return instance;
   }
    //increase the amount of stamina sound effect
    final  URL URL1 = getClass().getResource("/nz/ac/aut/ense701/effects/consume.wav");
    final AudioClip clip1 = new AudioClip(URL1.toString());
    //stumble on hazard sound effect
    final  URL URL2 = getClass().getResource("/nz/ac/aut/ense701/effects/hazard.wav");
    final AudioClip clip2 = new AudioClip(URL2.toString());
    //break the trap during harzard
    final  URL URL3 = getClass().getResource("/nz/ac/aut/ense701/effects/break.wav");
    final AudioClip clip3 = new AudioClip(URL3.toString());
    //you have died sound effect
    final  URL URL4 = getClass().getResource("/nz/ac/aut/ense701/effects/death.wav");
    final AudioClip clip4 = new AudioClip(URL4.toString());
    //you have won the round sound effect
    final  URL URL5 = getClass().getResource("/nz/ac/aut/ense701/effects/win.wav");
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
