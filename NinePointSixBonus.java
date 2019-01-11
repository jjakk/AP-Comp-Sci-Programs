
import java.util.Scanner;

public class NinePointSixBonus{

  public static void main(String [] args){
    
    int value = 0;
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a how many rows you would like : ");
    
    int rows = scan.nextInt();
    
    String [][] array = new String [rows][10000];
    
    for(int i = 0; i < array.length; i++){
    
      for(int j = 0; j < array[i].length; j++){
      
        array[i][j] = "";
      
      }
    
    }
    
    for(int i = 0; i < array.length; i++){
    
      System.out.println("Enter how many Asterix : ");
      
      value = scan.nextInt();
      
      for(int j = 0; j < value; j++){
      
        array[i][j] = "*";
      
      }
    
    }
    
    for(int i = 0; i < array.length; i++){
    
      for(int j = 0; j < array[i].length; j++){
      
        System.out.print(array[i][j]);
      
      }
      
      System.out.println();
    
    }
  
  }

}