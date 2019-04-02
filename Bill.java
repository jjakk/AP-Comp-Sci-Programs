public class Bill implements Money{

  private int dollars;
  
  public Bill(int d){
  
    dollars = d;
  
  }
  
  public double getAmount(){
  
    return dollars;
  
  }
  
  public String toString(){
  
    return "$" + dollars;
  
  }

}