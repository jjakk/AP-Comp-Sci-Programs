
import java.util.Scanner;

public class ArrayPractice3{

  public static void main(String [] args){
    
    String [] words = new String[14];
    
    Scanner scan = new Scanner(System.in);
    
    String current;
    
    ArrayPractice3 object = new ArrayPractice3();
    
    boolean gotten = false;
    
    for(int i = 0; i < 11; i++){
    
      System.out.println("Enter a word to add : ");
      
      current = scan.nextLine();
      
      object.insert(current);
      
      object.refresh();
      
      object.print();
    
    }
    
  }
  
  public String [] mainArray = {"", "", "", "", "", "", "", "", "", "", ""};
  
  public String [] newArry = new String[11];
  
  public void refresh(){
     
     for(int i = 0; i < mainArray.length; i++){
       
       newArry[i] = mainArray[i];
       
     }
     
   }
   
  //Methods
  
  public void print(){
  
    for(int i = 0; i < newArry.length; i++){
    
      if(i != newArry.length) System.out.print(newArry[i] + ", ");
      
    }
    
    System.out.println();
  
  }
  
  public void insert(String newStr){
  
    boolean gotten = false;
    
    for(int i = 0; i < mainArray.length; i++){
    
      if(newStr.compareTo(mainArray[i]) > 0 && mainArray[i] != ""){
      
        newArry[i] = mainArray[i];
          
        gotten = true;
        
      }
      
      else{
      
        if(gotten){
        
          newArry[i] = newStr;
          
          gotten = false;
        
        }
        
        else{
          
          if(i != newArry.length && i != 0){
            
            newArry[i] = mainArray[i - 1];
            
          }
          else if(i == 0){
          
            newArry[i] = mainArray[i];
          
          }
          
        }
      
      }
    
    }
    
    for(int i = 0; i < mainArray.length; i++){
    
      mainArray[i] = newArry[i];
        
    
    }
  
  }
  
  /*public void insert(String newStr){
    
    boolean gotten = false;
    
    boolean inserted = false;
    
    int added = 0;
    
    for(int i = 0; i < mainArray.length; i++){
    
      if(!mainArray[i].equals(""))added++;
    
    }
  
    for(int i = 0; i < mainArray.length; i++){
      
      if(!inserted){
        
        if(mainArray[i] == ""){
          
          mainArray[i] = newStr;
          
          inserted = true;
          
        }
        
        else if(mainArray[i].compareTo(newStr) > 0){
          
          gotten = false;
          
          for(int j = i; j < mainArray.length; j++){
          
            if(j != mainArray.length - 1 && j != mainArray.length && !gotten){
              
              if(j == i) mainArray[added] = mainArray[added - 1];
              
              for(int k = 0; k < mainArray.length; k++) newArry[k] = mainArray[k];
              
              newArry[j + 1] = mainArray[j];
              
              for(int k = 0; k < mainArray.length; k++) mainArray[k] = newArry[k];
              
              gotten = true;
            
            }
          
          }
          
          gotten = false;
            
           mainArray[i] = newStr;
          
          inserted = true;
        
        }
        
      }
    
    }
  
  }*/

}