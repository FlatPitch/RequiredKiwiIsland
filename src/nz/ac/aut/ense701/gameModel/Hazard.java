
package nz.ac.aut.ense701.gameModel;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * This class represents a hazard that can be found on the island
 *  
 * @author AS
 * @version July 2011
 */

public class Hazard extends Occupant {
    
    private final double impact;
    private final double FATAL_IMPACT = 1.0;
    private final Sounds sound = Sounds.getSoundsSingletonReference();

    /**
     * Create a hazard on the island
     * @param position where hazard is.
     * @param name of hazard.
     * @param description a more detailed description of hazard
     * @param impact on player
     * @param hazardImage image of the hazard warning
     * @param iconImage the image of the icon used for the hazard
     */
    public Hazard(Position position, String name, String description, double impact, Image hazardImage, ImageIcon iconImage) {
        
        super(position, name, description, hazardImage, iconImage);
        this.impact = impact;
        
    }
    /**
     * Construct a hazard for the map
     * @param position location of hazard on map
     * @param name of the hazard
     * @param description of the hazard for description
     * @param impact to the player of hazard 
     */
    public Hazard(Position position, String name, String description, double impact){
        super(position, name, description, null,null);
        this.impact = impact;
    }
    
    /**
     * What is impact of hazard
     * @return impact
     */
    public double getImpact() {
        return this.impact;
    }
    
    /**
     * Checks if fatal impact
     * @return true if fatal
     */
    public boolean isFatal()
    {
        return impact == FATAL_IMPACT;
    }
    
    /**
     * Checks if this is broken trap hazard
     * @return true if this is broken trap hazard
     */
    public boolean isBreakTrap() 
    {
        sound.playBreakTrap();
        String name = this.getName();
        return name.equalsIgnoreCase("Broken trap");
    }
    
    @Override
    public String getStringRepresentation() {
        return "H";
    }   


    
}
