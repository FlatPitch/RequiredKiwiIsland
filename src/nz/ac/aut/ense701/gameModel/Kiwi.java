
package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Kiwi represents a kiwi living on the island
 * @author AS
 * @version July 2011
 */
public class Kiwi  extends Fauna
{
    private boolean counted;
    private Image kiwiImage;
    /**
     * Constructor for objects of class Kiwi
     * @param pos the position of the kiwi object
     * @param name the name of the kiwi object
     * @param description a longer description of the kiwi
     */
    public Kiwi(Position pos, String name, String description, Image faunaImage) 
    {
        super(pos, name, description, faunaImage);
        counted = false;
    } 
    
    public Kiwi(Position pos, String name, String description) 
    {
        super(pos, name, description, null);
        counted = false;
    } 
    
    /**
    * Count this kiwi
    */
    public void count() {
        counted = true;
    }
 
   /**
    * Has this kiwi been counted
    * @return true if counted.
    */
    public boolean counted() {
        return counted;
    }


    @Override
    public String getStringRepresentation() 
    {
        return "K";
    }     
}
