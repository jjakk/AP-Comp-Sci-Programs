public class arrayPractice2{

  public static void main(String [] args){
  
    arrayPractice2 object = new arrayPractice2();
    
    object.refresh();
    
    object.insert(8);
    
    object.insert(13);
    
    object.delete(18);
    
    object.print();
  
  }
  
  //Feilds
  
  public int [] mainArray = {1, 7, 12, 15, 18, 20, 21, 22, 0, 0, 0};
  
  public int [] newArry = new int[11];
  
  public void refresh(){
     
     for(int i = 0; i < mainArray.length; i++){
       
       newArry[i] = mainArray[i];
       
     }
     
   }
   
  //Methods
  
  public void insert(int newNum){
  
    boolean gotten = false;
    
    for(int i = 0; i < mainArray.length; i++){
    
      if(newNum > mainArray[i] && mainArray[i] != 0){
      
        newArry[i] = mainArray[i];
          
        gotten = true;
        
      }
      
      else{
      
        if(gotten){
        
          newArry[i] = newNum;
          
          gotten = false;
        
        }
        
        else{
          
          if(i != newArry.length){
            
            newArry[i] = mainArray[i - 1];
            
          }
          
        }
      
      }
    
    }
    
    for(int i = 0; i < mainArray.length; i++){
    
      mainArray[i] = newArry[i];
        
    
    }
  
  }
  
  public void delete(int position){
    
    boolean got = false;
  
    for(int i = 0; i < newArry.length; i++){
    
      if(newArry[i] == position){
        
        got = true;
        
        newArry[i] = 0;
      
      }
      
      else{
      
        if(got){
        
          newArry[i - 1] = mainArray[i - 1];
        
        }
      
      }
    
    }
    
    for(int i = 0; i < mainArray.length; i++){
    
      mainArray[i] = newArry[i];
    
    }
  
  }
  
  public void print(){
  
    for(int i = 0; i < newArry.length; i++){
    
      if(i != newArry.length) System.out.print(newArry[i] + ", ");
      
    }
    
    System.out.println();
  
  }

}