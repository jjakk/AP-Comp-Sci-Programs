public class TwoDArray{

  public static void main(String [] args){
  
    int [] start = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    
    for(int i = 0; i < start.length; i++){
    
      System.out.println(start[i]);
    
    }
    
    int [][] finish = new int [4][4];
    
    for(int i = 0; i < finish.length; i++){
    
      for(int j = 0; j < finish.length; j++){
      
        finish[i][j] = i + j;
      
      }
    
    }
  
  }

}