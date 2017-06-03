package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 * This class represents an item that can be found on the island.
 * 
 * @author AS
 * @version July 2011
 */
public  abstract class Item extends Occupant
{
    private double weight;
    private double size;

    /**
     * Construct an item with known attributes.
     * @param pos the position of the item
     * @param name the name of the item
     * @param description a longer description of the item
     * @param weight the weight of the item
     * @param size the size of the item
     * @param itemImage the image of the item
     * @param iconImage the icon sized image used for the item
     */
    public Item(Position pos, String name, String description, double weight, double size, Image itemImage,ImageIcon iconImage) 
    {
        super(pos, name, description, itemImage, iconImage);
        this.weight = weight;
        this.size = size;
    }
    /**
     * the individual item created
     * @param pos position of the grid square in the game 
     * @param name of the item in this square
     * @param description of the item in the square
     * @param weight of the item for the backpack calculation
     * @param size of the item to calculate if you can carry it 
     */
    public Item(Position pos, String name, String description, double weight, double size){
        super(pos, name, description, null,null);
        this.weight = weight;
        this.size = size;
    }
    
     /**
     * Gets the weight of the item
     * @return the weight of the item
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the size of the item
     * @return the size of the item
     */
    public double getSize() {
        return this.size;
    }    

    
    /**
     * Is it OK to pick up and carry this item?
     * Items with size > 0 can be carried.
     * 
     * @return true if item can be carried, false if not
     */
    public boolean isOkToCarry()
    {
        return size > 0;
    }
}
