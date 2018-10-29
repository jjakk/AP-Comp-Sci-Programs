/** 
 * In the game RollTen, a player rolls the die ten times.  
 * The score for the turn is the sum of the rolls.
 * 
 * Mrs. Westervelt
 * October 17, 2018
*/
public class RollTen{
  private int score = 1;
  private void processRoll(int total){
    score += total;
  }
  public static void main (String [] args){
    RollTen player = new RollTen();
    Die spotty = new Die();
    for (int turn = 1; turn <= 10; turn++){
      spotty.roll();
      System.out.println(spotty.getNumDots());
      player.processRoll(spotty.getNumDots());
    }
    System.out.println("Player's score: "+player.score);
  }
}