public class printStars{
  
  public static void main(String [] args){
    
    //printTriangles(5);
    printTrianglesB(5);
  
  }
  
  public static void printTriangles(int layer){
    
    if(layer > 0){
    
      printTriangles(layer - 1);
      
      printStars(layer);
      
      System.out.println();
    
    }
    
  }
  
  private static int temp = 0;
  
  private static boolean temp2 = false;
  
  public static void printTrianglesB(int layer){
    
    if(!temp2){
    
      temp = layer;
      
      temp2 = true;
    
    }
    
    if(layer > 0){
      
      printTrianglesB(layer - 1);
      
      printStars(temp);
      
      temp -= 1;
      
      System.out.println();
    
    }
    
    else{
    
      System.out.print("");
    
    }
    
  }
  
  public static void printStars(int input){
  
    if(input > 0){
      printStars(input - 1);
    
      System.out.print("*");
    
    }
    
    else{
    
      System.out.print("");
    
    }
  
  }

}

