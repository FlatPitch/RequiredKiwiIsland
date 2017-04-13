
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
    }
    
    
    @Test
    public void testCatchAllPredatorsGetReward(){ 
        while (!game.getPrevMap().equals("maps\\IslandData.txt")){
        game = new Game();
    }
        trapAllPredators();
        assertTrue("Coupon should be given",game.getWinMessage().contains("Your $2 tuck shop discount code:"));
    }    
    
    /**
 * Private helper methods
 */
    
    private boolean trapAllPredators()
    {
        //Firstly player needs a trap
        Tool trap = new Tool(playerPosition,"Trap", "A predator trap",1.0, 1.0);
        game.collectItem(trap);
        
        //Now player needs to trap all predators
        //Predator 1
        boolean moveOK = playerMoveEast(5);
        game.useItem(trap);
        //Predator 2
        if(moveOK){
            moveOK = playerMoveWest(1);
        }
        if(moveOK){
            moveOK = playerMoveSouth(2);
            game.useItem(trap);
        }
        //Predator 3
        if(moveOK){
            moveOK = playerMoveWest(2);
        }
        if(moveOK){
            moveOK = playerMoveSouth(1);
            game.useItem(trap);
        }
        //Predator 4
        if(moveOK){
            moveOK = playerMoveWest(3);
        }
        if(moveOK){
            moveOK = playerMoveSouth(1);
            game.useItem(trap);
        }
        //Predator 5
        if(moveOK){
            moveOK = playerMoveEast(1);
        }
        if(moveOK){
            moveOK = playerMoveSouth(1);
            game.useItem(trap);
        }
         //Predator 6
        if(moveOK){
            moveOK = playerMoveEast(2);
        }
        if(moveOK){
            moveOK = playerMoveSouth(1);
            game.useItem(trap);
        }
        //Predator 7
        if(moveOK){
            moveOK = playerMoveNorth(1);
        }
        if(moveOK){
            moveOK = playerMoveEast(3);
        }
        if(moveOK){
            moveOK = playerMoveSouth(4);
            game.useItem(trap);
        }
        return moveOK;
    }
    
    private boolean playerMoveNorth(int numberOfMoves)
    {
        boolean success = false;
        for (int i = 0; i < numberOfMoves; i++) {
            success = game.playerMove(MoveDirection.NORTH);
            if(!success)break;
            
        }
        return success;
    }
    
    private boolean playerMoveSouth(int numberOfMoves)
    {
        boolean success = false;
        for (int i = 0; i < numberOfMoves; i++) {
            success = game.playerMove(MoveDirection.SOUTH);
            if(!success)break;
            
        }
        return success;
    }
    
    private boolean playerMoveEast(int numberOfMoves)
    {
        boolean success = false;
        for (int i = 0; i < numberOfMoves; i++) {
            success = game.playerMove(MoveDirection.EAST);
            if(!success)break;
            
        }
        return success;
    }
    
    private boolean playerMoveWest(int numberOfMoves)
    {
        boolean success = false;
        for (int i = 0; i < numberOfMoves; i++) {
            success = game.playerMove(MoveDirection.WEST);
            if(!success)break;
            
        }
        return success;
    }
    
}
