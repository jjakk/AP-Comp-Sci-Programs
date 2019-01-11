
import java.util.Scanner;

public class TwoDArray{
  
  public int thisIsABadVariableNameButWhatEverImGonnaPutItInThisProgramJustCause = 0;

  public static void main(String [] args){
    
    Scanner scan = new Scanner(System.in);
    
    int guess = 0;
    
    boolean got = false;
    
    String input = "";
    
    while(true){
      
      System.out.println("Initial start array : ");
      
      int [] start = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
      
      for(int i = 0; i < start.length; i++){
        
        System.out.println(start[i]);
        
      }
      
      int [][] finish = new int [4][4];
      
      for(int i = 0; i < finish.length; i++){
        
        for(int j = 0; j < finish[0].length; j++){
          
          while(!got){
            
            guess = (int) (Math.random() * 16);
            
            if(start[guess] != 0){
              
              finish[i][j] = start[guess];
              
              start[guess] = 0;
              
              got = true;
              
            }
            
          }
          
          got = false;
          
        }
        
      }
      
      System.out.println("After Start Array : ");
      
      for(int i = 0; i < start.length; i++){
        
        System.out.println(start[i]);
        
      }
      
      System.out.println("Finish Array : ");
      
      for(int i = 0; i < finish.length; i++){
        
        for(int j = 0; j < finish[0].length; j++){
          
          System.out.print(finish[i][j] + " ");
          
        }
        
        System.out.println();
        
      }
      
      System.out.println("Sum of Corners : " + (finish[0][0] + finish[0][finish.length-1] + finish[finish.length-1][0] + finish[finish.length-1][finish.length-1]));
      
      System.out.println("Sum of Center numbers : " + (finish[1][1] + finish[1][2] + finish[2][1] + finish[2][2]));
      
      System.out.println("Would you like to go again? [y/n]");
      
      input = scan.nextLine();
      
      if(input.equals("y")){}
      else break;
      
    
    }
  
  }

}