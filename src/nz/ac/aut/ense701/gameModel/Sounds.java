/*
 * This class imports the wav files URL
 * Then it turns the wav file into a string to make playing it more efficient
 */
package nz.ac.aut.ense701.gameModel;

import javafx.scene.media.AudioClip;
import java.net.URL;
import static javafx.scene.media.AudioClip.INDEFINITE;

/**
 *
 * @author Glen Osborne 
 * allows each effect to be called individually 
 */
public class Sounds {

    //create a singleton to prevent mulitpule instances of sound effects in memory
    private static Sounds instance = null;

    //protected constructor
    protected Sounds() {
        // Exists only to defeat instantiation.
    }

    //method to allow acces to single instance of class
    public static Sounds getSoundsSingletonReference() {
        if (instance == null) {
            instance = new Sounds();
        }
        return instance;
    }
        //import wav file for background music

    final URL URL = getClass().getResource("/nz/ac/aut/ense701/effects/music.wav");
    final AudioClip music = new AudioClip(URL.toString());
    //increase the amount of stamina sound effect
    final URL URL1 = getClass().getResource("/nz/ac/aut/ense701/effects/consume.wav");
    final AudioClip clip1 = new AudioClip(URL1.toString());
    //stumble on hazard sound effect
    final URL URL2 = getClass().getResource("/nz/ac/aut/ense701/effects/hazard.wav");
    final AudioClip clip2 = new AudioClip(URL2.toString());
    //break the trap during harzard
    final URL URL3 = getClass().getResource("/nz/ac/aut/ense701/effects/break.wav");
    final AudioClip clip3 = new AudioClip(URL3.toString());
    //you have died sound effect
    final URL URL4 = getClass().getResource("/nz/ac/aut/ense701/effects/death.wav");
    final AudioClip clip4 = new AudioClip(URL4.toString());
    //you have won the round sound effect
    final URL URL5 = getClass().getResource("/nz/ac/aut/ense701/effects/win.wav");
    final AudioClip clip5 = new AudioClip(URL5.toString());
    //correct question answer
    final URL URL6 = getClass().getResource("/nz/ac/aut/ense701/effects/chime.wav");
    final AudioClip clip6 = new AudioClip(URL6.toString());
    //incorrect question answer
    final URL URL7 = getClass().getResource("/nz/ac/aut/ense701/effects/wrong.wav");
    final AudioClip clip7 = new AudioClip(URL7.toString());
    //play methods called to make sound effects play
    
    //increase the amount of stamina sound effect
    public void playStaminaIncrease() {
        clip1.play();
    }
    //stumble on hazard sound effect
    public void playHazard() {
        clip2.play();
    }
    //break the trap during harzard
    public void playBreakTrap() {
        clip3.play();
    }
    //you have died sound effect
    public void playDeath() {
        clip4.play();
    }
    //you have won the round sound effect
    public void playwin() {
        clip4.play();
    }
    //correct question answer
    public void playCorrect() {
        clip6.play();
    }
    //incorrect question answer
    public void playWrong() {
        clip7.play();
    }
        /* 
     * Starts game music. Plays it indefinitely.
     *   
     */
    public void startMusic() {
        music.setCycleCount(INDEFINITE);
        music.play();
    }

    /* 
     * Stops game music.
     *   
     */
    public void stopMusic() {
        music.stop();
    }
}
