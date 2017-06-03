package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Predator represents a predator on the island.
 * If more specific behaviour is required for particular predators, descendants 
 * for this class should be created
 * @author AS
 * @version July 2011
 */
public class Predator extends Fauna
{

    /**
     * Constructor for objects of class Predator
     * @param pos the position of the predator object
     * @param name the name of the predator object
     * @param description a longer description of the predator object
     * @param predImage the image of the Predator for the description box
     * @param iconImage the image for the tile square
     */
    public Predator(Position pos, String name, String description, Image predImage, ImageIcon iconImage) 
    {
        super(pos, name, description, predImage, iconImage);
    } 
    /**
     * when the map creates a Predator
     * @param pos position of the Predator
     * @param name of the Predator
     * @param description  of the Predator
     */
    public Predator(Position pos, String name, String description) 
    {
        super(pos, name, description, null, null);
    } 


    @Override
    public String getStringRepresentation() 
    {
        return "P";
    }    
}
