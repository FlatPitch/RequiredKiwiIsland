/*
 * Glen Osborne 14852903
 * Software Engineering Sem 1 2017
 * This project is for educational purposes
 */
package nz.ac.aut.ense701.gameModel;

/**
 *
 * @author Liandri
 * This class measures the number of moves the player has made on the current map
 */
public class Moves {
    //the number of moves for the current map
    private int numberOfMoves;
    //constructor
    public Moves(){
        this.numberOfMoves = 0;
    }
    //increment the number of moves
    public void addMove(){
        this.numberOfMoves++;
    }
    //return the number of moves
    public int getNumberOfMoves(){
        return this.numberOfMoves;
    }
    //set the number of moves to zero to restart a new map
    public void resetMoves(){
        this.numberOfMoves = 0;
    }
    
    public boolean testIfNewLowestMoves(int current){
        boolean testScore = false;
        if(current<this.numberOfMoves){
            testScore = true;
        }
        return testScore;
    }
}
