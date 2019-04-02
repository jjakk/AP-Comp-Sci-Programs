/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) 
 {
  String[] ranks = {"10","jack", "queen", "king"};
  String[] suits = {"spades", "hearts"};
  int[] values = {10, 11, 12, 13};
  Deck sample = new Deck(ranks, suits, values);

  System.out.println("**** Original Deck Methods ****");
  System.out.println("isEmpty: " + sample.isEmpty());
  System.out.println(sample.toString());

  System.out.println("**** Deal a Card ****");
  System.out.println("deal: " + sample.deal());
  System.out.println("**** Deck Methods After 1 Card Dealt ****");
  System.out.println(sample.toString());
  
  System.out.println("**** Deal Remaining Cards ****");
  int numCards = sample.size();
  for (int i = 1; i <= numCards; i++) {
   System.out.println(i+" deal: " + sample.deal());
     }
  System.out.println();
  System.out.println("**** Deck Methods After All Cards Dealt ****");
  System.out.println("isEmpty: " + sample.isEmpty());
  System.out.println(sample.toString());
  
  System.out.println("**** Deal a Card From Empty Deck ****");
  System.out.println("deal: " + sample.deal());
 }
}
