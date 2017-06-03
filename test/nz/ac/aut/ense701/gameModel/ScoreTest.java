/*
 * @author Thrishen
 */
package nz.ac.aut.ense701.gameModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thrishen
 */
public class ScoreTest {    
    private Predator rat;
    private Kiwi kiwi;
    private Position position;
    private Island island;
    private Score score; 
    Hazard nonFatal;
    
    @Before
    public void setUp() {
        score = new Score();
        island = new Island(5,5);
        position = new Position(island, 4,4);
        rat = new Predator(position, "Rat", "A norway rat");  
        kiwi = new Kiwi(position, "Kiwi", "A little spotted kiwi");  
        nonFatal = new Hazard(position, "Cliff", "A small cliff", 0.5);
    }
    
    @After
    public void tearDown() {
        island = null;
        position = null;
        rat = null;   
    }
    
    /**
     * Test of scoreTrappredator, of class Score.
     */
    @Test
    public void testscoreTrappredator() {
        int expResult = 100;
        score.scoreTrappredator();
        int result = score.getSCore();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of scoreKiwicount, of class Score.
     */
    @Test
    public void testscoreKiwicount() {
        int expResult = 100;
        score.scoreKiwicount();
        int result = score.getSCore();
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of scoreHazard, of class Score.
     */
    @Test
    public void testscoreHazard() {
        int expResult = 0;
        score.scoreHazard();
        int result = score.getSCore();
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of getSCore, of class Score.
     */
    @Test
    public void testgetSCore() {  
        //100(Count kiwi) - 50 ( hazard) = 50
        int expResult = 50;
        score.scoreKiwicount();
        score.scoreHazard();
        int result = score.getSCore();
        assertEquals(expResult, result);
    }     
}
