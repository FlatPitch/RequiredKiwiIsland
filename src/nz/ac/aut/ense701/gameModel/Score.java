package nz.ac.aut.ense701.gameModel;

/**
 * This class keeps track of a player's score
 * 
 * @author Thrishen
 */
public class Score {
     private int score;
     private final static int hazardPenalty = -50;
     private final static int kiwicountPoints = 100;
     private final static int trapPredatorPoints = 100;
     
     /**
      * constructor
      **/
     public Score(){
         this.score = 0;
    }
          
     /**
     * Updates score when player moves to hazard
     **/
     public void scoreHazard(){
         this.score += hazardPenalty;
     }
     
     /**
      * Updates score when player counts a kiwi
     **/
     public void scoreKiwicount(){
         this.score += kiwicountPoints;
     }
     
     /**
      * Updates score when player moves to hazard
     **/
      public void scoreTrappredator(){
         this.score += trapPredatorPoints;
     }  
     /**
      * 
      * @return the current score
      */
      public int getSCore(){
          if(this.score < 0){
              return 0;              
          }else{
              return this.score;
          }          
      }     
}

