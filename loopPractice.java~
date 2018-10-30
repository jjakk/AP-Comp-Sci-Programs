
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
  }
  private static void fizzBuzz(){
    Scanner scan = new Scanner(System.in);
    int input;
    System.out.println("Enter an ending number : ");
    input = scan.nextInt();
    for(int i = 0; i < input; i++){
      if(i % 3 == 0){
        System.out.print("Fizz");
      }
      if(i % 5 == 0){
        System.out.print("Buzz");
      }
      if(i % 5 != 0 && i % 3 != 0){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  private static void printCheckerboard(){
    Scanner scan = new Scanner(System.in);
    int input;
    System.out.println("Enter an ending number : ");
    input = scan.nextInt();
    for(int i = 0; i < input; i++){
      for(int j = 0; j < input; j++){
        if(j % 2 == 0){
          System.out.print("#");
        }
        else{
          System.out.print("o");
        }
      }
      System.out.println();
    }
  }
  private static void perfectNum(){
    Scanner scan = new Scanner(System.in);
    int input;
    int total = 0;
    System.out.println("Enter a number : ");
    input = scan.nextInt();
    for(int i = 0; i < input; i++){
    
      if(input % i == 0){
        
        total += i;
      
      }
    
    }
    if(total == input){
    
      System.out.println("it's perfect");
      
    }
    else{
    
      System.out.println("It's not perfect");
    
    }
  }
  public static void main(String [] args){
  
    perfectNum();
  
  }

}