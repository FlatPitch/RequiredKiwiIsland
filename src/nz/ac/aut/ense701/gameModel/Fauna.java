
package nz.ac.aut.ense701.gameModel;

import java.awt.Image;


/**
 * Fauna at this point represents any species that is not a kiwi or a predator on the island.
 * If we need additional endangered species this class should have descendant classes created.
 * 
 * @author AS
 * @version July 2011
 */
public class Fauna extends Occupant
{
    private Image faunaImage;

    /**
     * Constructor for objects of class Endangered
     * @param pos the position of the kiwi
     * @param name the name of the kiwi
     * @param description a longer description of the kiwi
     */
    public Fauna(Position pos, String name, String description, Image faunaImage) 
    {
        super(pos, name, description, faunaImage);
    } 
    
    public Fauna(Position pos, String name, String description){
        super(pos, name, description, null);
    }
 


    @Override
    public String getStringRepresentation() 
    {
          return "F";
    }    
    
    public Image getImageRepresentation(){
        return this.faunaImage;
    }
}
