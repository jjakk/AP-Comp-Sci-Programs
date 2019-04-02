//This is a class that tests the Card class.
public class CardTester {

 //The main method in this class checks the Card operations for consistency.
  public static void main(String[] args) 
  {
    Card aceClubs1 = new Card("ace", "clubs", 1);
    Card aceClubs2 = new Card("ace", "clubs", 1);
    Card sixHearts = new Card("6", "hearts", 6);
    
    System.out.println("**** ace of clubs #1 Tests ****");
    System.out.println("  rank: " + aceClubs1.getRank());
    System.out.println("  suit: " + aceClubs1.getSuit());
    System.out.println("  pointValue: " + aceClubs1.getValue());
    System.out.println("  toString: " + aceClubs1.toString());
    System.out.println();
    
    System.out.println("**** ace of clubs #2 Tests ****");
    System.out.println("  rank: " + aceClubs2.getRank());
    System.out.println("  suit: " + aceClubs2.getSuit());
    System.out.println("  pointValue: " + aceClubs2.getValue());
    System.out.println("  toString: " + aceClubs2.toString());
    System.out.println();
    
    System.out.println("**** six of hearts Tests ****");
    System.out.println("  rank: " + sixHearts.getRank());
    System.out.println("  suit: " + sixHearts.getSuit());
    System.out.println("  pointValue: " + sixHearts.getValue());
    System.out.println("  toString: " + sixHearts.toString());
    System.out.println();
    
    System.out.println("**** matches Tests ****");
    System.out.println("  matching: " + aceClubs1.matches(aceClubs2));
    System.out.println("  not matching: " + aceClubs1.matches(sixHearts));
 }
}
