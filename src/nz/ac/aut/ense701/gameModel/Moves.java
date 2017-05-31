/*
 * Glen Osborne 14852903
 * Software Engineering Sem 1 2017
 * This project is for educational purposes
 */
package nz.ac.aut.ense701.gameModel;

/**
 *
 * @author Liandri
 */
public class Moves {
    
    private int numberOfMoves;
    
    public Moves(){
        this.numberOfMoves = 0;
    }
    public void addMove(){
        this.numberOfMoves++;
    }
    public int getNumberOfMoves(){
        return this.numberOfMoves;
    }
    
}
