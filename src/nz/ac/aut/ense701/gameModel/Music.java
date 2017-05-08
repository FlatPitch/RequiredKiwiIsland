/*
 * This class imports a wav music file and turns it into a string for efficiency. 
 * It also provides controls for in-game music * 
 */
package nz.ac.aut.ense701.gameModel;

import javafx.scene.media.AudioClip;
import java.net.URL;
import static javafx.scene.media.AudioClip.INDEFINITE;

/**
 *
 * @author Thrishen
 */
public class Music {
    //import wav file for background music

    final URL URL1 = getClass().getResource("/nz/ac/aut/ense701/effects/music.wav");
    final AudioClip music = new AudioClip(URL1.toString());

    
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
