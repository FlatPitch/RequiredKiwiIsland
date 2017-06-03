package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * This class represents food that can be found on the island
 * and supplies energy when being consumed (used) by the player.
 * 
 * @author AS
 * @version July 2011
 */
public class Food extends Item
{
    private double energy;

    /**
     * Construct a food object with known attributes.
     * @param pos the position of the food object
     * @param name the name of the food object
     * @param description a longer description of the food object
     * @param weight the weight of the food object
     * @param size the size of the food object
     * @param energy stamina contribution of the food object
     *               when the player uses the object
     * @param foodImage the images for food
     * @param iconImage the image for the icon
     */
    public Food(Position pos, String name, String description, double weight, double size, double energy, Image foodImage, ImageIcon iconImage) 
    {
        super(pos, name, description,weight, size, foodImage, iconImage);
        this.energy = energy;
    }
    /**
     * 
     * @param pos the position of the food item
     * @param name the name of the food item
     * @param description the description of the food item
     * @param weight the weight of the food item
     * @param size the size of the food item
     * @param energy 
     */
    public Food(Position pos, String name, String description, double weight, double size, double energy) 
    {
        super(pos, name, description,weight, size, null,null);
        this.energy = energy;
    }

    /**
     * Gets the energy of the food.
     * @return the energy of the food
     */
    public double getEnergy() {
        return this.energy;
    }
    
    /**
     * @return string representation of food
     */
    @Override
    public String getStringRepresentation() 
    {
        return "E";
    }
}
