public class recursiveStars{
  
  public static int printStars(int layers){
  
    if(layers == 5){
    
      System.out.println("");
    
    }
    
    else{
    
      System.out.print("*");
      
      return printStars(layer + 1);
    
    }
  
  }

  public static void main(String [] args){
    
    System.out.println(printStars(5));
    
  }

}