public class Die{

  //Fields
  
  private int dots;
  
  //Constructor
  
  //No Constructor
  
  //Methods
  
  //Mutator
    
  public void roll(){
  
    dots = (int) (Math.random() * 6) + 1;
  
  }
  
  //Accessor
  
  public int getNumDots(){
  
    return dots;
  
  }

}