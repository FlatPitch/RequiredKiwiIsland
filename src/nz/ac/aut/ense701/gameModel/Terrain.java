package nz.ac.aut.ense701.gameModel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Enumeration class Terrain - represents terrain types on Kiwi Island.
 * 
 * @author AS
 * @version July 2011
 * 
 * Maintenance History
 * Representation strings changed Anne July 2011
 */
public enum Terrain
{
    SAND(".", 1.0, "Images/Terrain/Sand.jpeg"),
    FOREST("*", 2.0, "Images/Terrain/Tree.jpeg"),
    WETLAND ("#", 2.5, "Images/Terrain/Dirt.png"),
    SCRUB("^", 3.0, "Images/Terrain/Grass.png"),
    WATER("~", 4.0, "Images/Terrain/Water.jpeg");
    
    private final double difficulty;
    private final String stringRep;
    private final String terrainDescription;
    private Image terrainImg;
    
    /**
     * Creates a new terrain with a given difficulty 
     * and a string representation
     * @param stringRep the string representation of the terrain.
     * @param difficulty the difficulty of the terrain
     */
    private Terrain(String stringRep, double difficulty, String imageLocation)
    {
        this.stringRep  = stringRep;
        this.difficulty = difficulty;
        try {
            this.terrainImg = ImageIO.read(new File(imageLocation)).getScaledInstance(62, 65, java.awt.Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            this.terrainImg = null;
        }
        
        //description of different terrains
        if(stringRep.equals("*")){
            this.terrainDescription = "You walk through a thick forest";
            
        }else if(stringRep.equals(".")){
            this.terrainDescription = "You walk through the sand which slows your pace";

            
        }else if(stringRep.equals("#")){
            this.terrainDescription = "You walk through the wetlands";

            
        }else if(stringRep.equals("^")){
            this.terrainDescription = "You walk through the scrub";

            
        }else if(stringRep.equals("~")){
            this.terrainDescription = "You walk through water";

            
        }else{     
            this.terrainDescription = "";
        }
    }
       /**
     * Gets a description of the terrain
     * @return a description of the terrain
     */
    public String getTerrainDescription()
    {
        return this.terrainDescription;
    }
    /**
     * Gets the difficulty of the terrain
     * @return the difficulty of the terrain
     */
    public double getDifficulty()
    {
        return difficulty;
    }
    /**
     * 
     * @return the image to be dispalyed on the grid square tiles 
     */
    public Image getTerrainImage(){
        return this.terrainImg;
    }
    
    /**
     * Gets a string representation of the terrain to print on the console
     * @return string representation of the terrain
     */
    public String getStringRepresentation()
    {
        return stringRep;
    }
    
    /**
     * Returns a terrain object from the terrain string representation.
     * @param terrainString the string to compare
     * @return the terrain that is associated with this terrain,
     *         or null if the string is invalid
     */
    public static Terrain getTerrainFromStringRepresentation(String terrainString)
    {
        Terrain terrain = null;
        for ( Terrain item : values() ) 
        {
            if ( item.getStringRepresentation().equals(terrainString) )
            {
                terrain = item;
            }
        }
        return terrain;
    }
    
}

