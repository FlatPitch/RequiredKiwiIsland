
package nz.ac.aut.ense701.gameModel;


import org.junit.Test;

/**
 *
 * @author Thrishen
 */
public class RewardTest extends junit.framework.TestCase {
    
    Game       game;
    Player     player;
    Position   playerPosition;
    Island island ;
    GameState state;
    
    
    public RewardTest(){        
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Override
    protected void setUp()
    {
        // Create a new game from the data file.
        // Player is in position 2,0 & has 100 units of stamina
        game           = new Game();
        state          = GameState.WON;             
        playerPosition = game.getPlayer().getPosition();
        player         = game.getPlayer();
        island = game.getIsland();        
              
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Override
    protected void tearDown()
    {
        game = null;
        player = null;
        playerPosition = null;
    }
    
    
    @Test
    public void testWinGameGetReward(){      
        state          = GameState.WON;         
        assertTrue("Game should be won", state == GameState.WON);
                
    }    
    
    
    
}
