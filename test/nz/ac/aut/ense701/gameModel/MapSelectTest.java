/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import org.junit.Test;

/**
 *
 * @author brend
 */
public class MapSelectTest extends junit.framework.TestCase{
    Game game;
    Island island;
    GameState state;
    
    public MapSelectTest(){
    }

    @Override
    public void setUp(){
        game = new Game();
    }
    
    @Override
    public void tearDown(){
        game = null;
    }
    
    @Test
    public void testMapChangeForNewGame(){
        String firstMap = game.getPrevMap();
        game.createNewGame();
        assertNotSame(firstMap, game.getPrevMap());
    }
}
