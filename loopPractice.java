
import java.util.Scanner;

public class loopPractice{
  private static void sumLimit(){
    Scanner scan = new Scanner(System.in);
    int total = 0;
    int input;
    do{
    System.out.println("Enter a number : ");
    input = scan.nextInt();
    if(input > 0){
      total += input;
    }
    }while(input > 0);
    System.out.println(total);
  }
  private static void multipleTo200(){
    Scanner scan = new Scanner(System.in);
    int total = 0;
    int input;
    System.out.println("Enter an increment : ");
    input = scan.nextInt();
    for(int i = 0;  i < 200; i++){
    
      
    
    }
  }

  public static void main(String [] args){
  
    sumLimit();
  
  }

}