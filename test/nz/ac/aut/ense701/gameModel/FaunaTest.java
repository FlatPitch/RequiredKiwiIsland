package nz.ac.aut.ense701.gameModel;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AS
 * @version 2011
 */
public class FaunaTest {
    
    public FaunaTest() {
        
    }

    /**
     * Test of getStringRepresentation method, of class Fauna.
     */
    @Test
    public void testGetStringRepresentation() throws IOException {
        Island island = new Island(5,5);
        Position position = new Position(island, 4,4);
        Fauna instance = new Fauna(position, "Oystercatcher", " A nesting oystercatcher", 
                        ImageIO.read(new File("Images/Oystercatcher.jpg")),ImageIO.read(new File("Images/Icons/Oystercatcher_icon.png")));
        String expResult = "F";
        String result = instance.getStringRepresentation();
        assertEquals(expResult, result);
    }
    
}
