package nz.ac.aut.ense701.gameModel;

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
    SAND(".", 1.0),
    FOREST("*", 2.0),
    WETLAND ("#", 2.5),
    SCRUB("^", 3.0),
    WATER("~", 4.0);
    
    private final double difficulty;
    private final String stringRep;
    private final String terrainDescription;
    
    /**
     * Creates a new terrain with a given difficulty 
     * and a string representation
     * @param stringRep the string representation of the terrain.
     * @param difficulty the difficulty of the terrain
     */
    private Terrain(String stringRep, double difficulty)
    {
        this.stringRep  = stringRep;
        this.difficulty = difficulty;
        
        
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

