
package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 * Fauna at this point represents any species that is not a kiwi or a predator on the island.
 * If we need additional endangered species this class should have descendant classes created.
 * @version July 2011
 * @author AS
 **/  

public class Fauna extends Occupant
{
    private ImageIcon faunaImage;

    /**
     * Constructor for objects of class Endangered
     * @param pos the position of the kiwi
     * @param name the name of the kiwi
     * @param description a longer description of the kiwi
     * @param faunaImage a picture of the fauna
     * @param iconImage a small picture for the icon
     */
    public Fauna(Position pos, String name, String description, Image faunaImage, ImageIcon iconImage) 
    {
        super(pos, name, description, faunaImage, iconImage);
    } 
    /**
     * 
     * @param pos position in grid
     * @param name name of the fauna
     * @param description description string of the fauna
     */
    public Fauna(Position pos, String name, String description){
        super(pos, name, description, null, null);
    }
 


    @Override
    public String getStringRepresentation() 
    {
          return "F";
    }    
    /**
     * 
     * @return the image in icon size for the fauna
     */
    public ImageIcon getImageRepresentation(){
        return this.faunaImage;
    }
}
