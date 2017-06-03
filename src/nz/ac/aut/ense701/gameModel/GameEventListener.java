/*
 * Interface for classes that want to be informed 
 * about changes in the game state.
 * 
 * @author AS
 * @version 1.0 - created
 */

package nz.ac.aut.ense701.gameModel;
/**
 * event listener for game state
 * @author Liandri
 */
public interface GameEventListener 
{
    /**
     * call the game state changed method to update the game for view
     */
    public void gameStateChanged();
}
