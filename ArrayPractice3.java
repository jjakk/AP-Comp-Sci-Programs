
import java.util.Scanner;

public class ArrayPractice3{

  public static void main(String [] args){
    
    String [] words = new String[14];
    
    Scanner scan = new Scanner(System.in);
    
    String current;
    
    boolean gotten = false;
    
    for(int i = 0; i < 14; i++){
    
      System.out.println("Enter a word to add : ");
      
      current = scan.nextLine();
      
      words[i] = current;
      
      for(int j = 0; j < words.length; j++){
        
        if(words[j] != null){
          
          if(j != words.length) System.out.print(words[j] + ", ");
          
        }
      
      }
    
    }
    
  }

}