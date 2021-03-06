import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner{

 /**
  * Create a Magpie, give it user input, and print its replies.
  */
 public static void main(String[] args){
  Scanner keyboard = new Scanner (System.in);
  Magpie maggie = new Magpie();
  
  System.out.print ("Whats your name");
  String name = keyboard.nextLine();
  
  maggie.setName(name);
  
  System.out.print (maggie.getGreeting());
  String statement = keyboard.nextLine();
  
  while (!statement.equals("Bye") && !statement.equals("bye")){
   System.out.println(maggie.getResponse(statement));
   statement = keyboard.nextLine();
  }
  keyboard.close();
 }

}
