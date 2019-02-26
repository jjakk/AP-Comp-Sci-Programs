public class Coins{
  
  private int cents;
  
  private int quarters;
  
  private int nickels;
  
  private int dimes;
  
  private int pennies;
  
  private String finalAmount;
  
  public Coins(int c){
    
    cents = c;
    
    int quarters = cents/25;
    
    int nickels = 0;
    
    int dimes = 0;
    
    int pennies = 0;
  
    if(cents % 25 != 0){
    
      dimes = (cents % 25) / 10;
      
      if((cents % 25) % 10 != 0){
      
        nickels = ((cents % 25) % 10) / 5;
        
        if(((cents % 25) % 10) % 5 != 0){
        
          pennies = ((cents % 25) % 10) % 5;
          
          finalAmount = "That's " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.";
        
        }
      
      }
    
    }
    
  }
  
  public int getQuarters(){
    
    return quarters;
    
  }
  public int getNickels(){
    
    return nickels;
  
  }
  public int getDimes(){
    
    return dimes;
  
  }
  public int getPennies(){
    
    return pennies;
  
  }
  
  public String toString(){
    
    return finalAmount; 
  
  }
  
  public static void main(String [] args){
    
    Coins coin = new Coins(283);
    
    System.out.println(283 + " quarters");
    
    System.out.println(coin);
    
    /*System.out.println("That's " + coin.getQuarters() + " quarters.");
    System.out.println("That's " + coin.getNickels() + " nickels.");
    System.out.println("That's " + coin.getDimes() + " dimes.");
    System.out.println("That's " + coin.getPennies() + " pennies.");*/
    
  }
  
}