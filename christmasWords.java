
import java.util.Scanner;

public class christmasWords{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many words would you like to enter? ");
    
    int amountOfWords = scan.nextInt();
      
    String [] words = new String[amountOfWords];
    
    String [] finalWords = new String[amountOfWords];
    
    words[0] = scan.nextLine();
    
    for(int i = 0; i < words.length; i++){
    
      System.out.println("Enter a word : ");
      
      words[i] = scan.nextLine();
    
    }
    
    String first = words[0];
    
    int firstLocation = 0;
    
    for(int i = 0; i < words.length; i++){
      
      first = "";
    
      for(int j = 0; j < words.length; j++){
      
      if(words[j] != ""){
        
        if(words[j].compareTo(first) >= 0){
          
          first = words[j];
          
          firstLocation = j;
          
          finalWords[j] = first;
      
          words[firstLocation] = "";
          
        }
        
      }
      
    }
    
  }
    
    for(int i = 0; i < finalWords.length; i++){
    
      System.out.println(finalWords[i]);
    
    }
  
  }

}