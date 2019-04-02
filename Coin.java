import java.util.Scanner;
public abstract class Coin implements Money{

  private int cents;
  
  public Coin(int c){
  
    cents = c;
  
  }
  
  public double getAmount(){
  
    return cents*0.01;
  
  }
  
}