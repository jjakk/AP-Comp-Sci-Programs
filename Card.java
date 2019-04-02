public class Card{

  String rank;
  
  String suit;
  
  int value;
  
  public Card(String r, String s, int v){
    
    rank = r;
    
    suit = s;
    
    value = v;
    
  }
  
  public String getRank(){return rank;}
  public String getSuit(){return suit;}
  public int getValue(){return value;}
  
  public boolean matches(Card second){
  
    if(this.getValue() == second.getValue()){
      
      return true;
    
    }
    
    return false;
  
  }
  
  public String toString(){
  
    return rank + " of " + suit + "(Point Value = " + value + ")";
  
  }

}