
import java.util.Scanner;

public class ArrayPractice{
  
  public static void fillArray(int [] numbers){
  
    for(int i = 0; i < 20; i++){
    
      numbers[i] = (int) (Math.random() * 50);
    
    }
  
  }
  public static void printArray(int [] numbers){
  
    for(int i = 0; i < 20; i++){
    
      System.out.println(numbers[i]);
    
    }
  
  }
  public static int arraySum(int [] numbers){
    
    int total = 0;
  
    for(int i = 0; i < 20; i++){
    
      total += numbers[i];
    
    }
    
    return total;
  
  }
  
  public static int arrayAvg(int [] numbers){
    
    int total = 0;
  
    for(int i = 0; i < 20; i++){
    
      total += numbers[i];
    
    }
    
    return total/20;
  
  }
  
  public static int arraySm(int [] numbers){
    
    int smallest = 100;
  
    for(int i = 0; i < 20; i++){
      
      if(numbers[i] < smallest){
      
        smallest = numbers[i];
      
      }
    
    }
    
    return smallest;
  
  }
  public static int arrayLg(int [] numbers){
    
    int largest = 0;
  
    for(int i = 0; i < 20; i++){
      
      if(numbers[i] > largest){
      
        largest = numbers[i];
      
      }
    
    }
    
    return largest;
  
  }
  
  public static boolean arraySearch(int [] numbers, int input){
  
    for(int i = 0; i < 20; i++){
      
      if(numbers[i] == input){
      
        return true;
      
      }
    
    }
    
    return false;
  
  }

  public static void main(String [] args){
    
    Scanner scan = new Scanner(System.in);
  
    int [] numbers = new int [20];
    
    fillArray(numbers);
    
    printArray(numbers);
    
    System.out.println("Array Sum : " + arraySum(numbers));
    
    System.out.println("Array Average : " + arrayAvg(numbers));
    
    System.out.println("Array Minimum : " + arraySm(numbers));
    
    System.out.println("Array Maximum : " + arrayLg(numbers));
    
    System.out.println("Enter a number : ");
    
    int input = scan.nextInt();
    
    if(arraySearch(numbers, input)){System.out.println("It is in the array");}
    
    if(!arraySearch(numbers, input)){System.out.println("It is not in the array");}
  
  }

}