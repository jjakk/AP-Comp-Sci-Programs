
import java.util.Scanner;
import java.util.ArrayList;

public class Dealership{
  
  public ArrayList<Car> stock;
  
  public Dealership(String [] models, int [] years){
  
    for(int i = 0 ; i < models.length; i++){
    
      stock.add(new Car(models[i], years[i]));
    
    }
  
  }
  
  public void printList(){
  
    for(Car current : stock){
    
      System.out.println(current);
    
    }
  
  }

  public void selectionSort(String field){
  
    if(field.equals("model")){
    
      stringSelectionSort();
    
    }
    
    else{
    
      intSelectionSort();
    
    }
  
  }
  
  public void stringSelectionSort(){}
  
  public void intSelectionSort(){
  
    int first = 9999;
    
    Car temp = null;
    
    for(int i = 0; i < stock.size(); i++){
    
      if(stock.get(i).getYear() < first){
      
        first = stock.get(i).getYear();
        
        temp = stock.get(i);
        
        stock.set(i, stock.get(i));
        
        stock.set(i, temp);
      
      }
    
    }
  
  }

}