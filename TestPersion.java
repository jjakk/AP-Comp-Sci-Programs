import java.util.Scanner;

public class TestPersion{

  public static void main(String [] args){
  
    Scanner scan = new Scanner(System.in);
    
    String userName;
    
    int userInches;
    
    int userAge;
    
    System.out.print("Whats your name? : ");
    
    userName = scan.nextLine();
    
    System.out.print("Whats your height in inches? : ");
    
    userInches = scan.nextInt();
    
    System.out.print("Whats your age? : ");
    
    userAge = scan.nextInt();
    
    Person fetter = new Person(userName, userInches, userAge);
    
    System.out.println(fetter.getName() + "\n" + fetter.inchesToFeet());
    
    System.out.println(fetter.yearsTo100());
  
  }

}