
import java.util.Scanner;
import java.util.ArrayList;

public class Dealership{
  
  public ArrayList<Car> stock;
  
  public Dealership(String [] models, int [] years){
    
    stock = new ArrayList<Car>();
  
    for(int i = 0 ; i < models.length; i++){
    
      stock.add(new Car(models[i], years[i]));
    
    }
  
  }
  
  public void printList(){
  
    for(Car current : stock){
    
      System.out.print(current + " ");
    
    }
    
    System.out.println();
  
  }

  public void selectionSort(String field){
  
    if(field.equals("model")){
    
      stringSelectionSort();
    
    }
    
    else{
    
      intSelectionSort();
    
    }
  
  }
  
  public void stringSelectionSort(){
    
    Car temp = null;
    
    int index = 999999;
  
    for(int i = 0; i < stock.size(); i--){
      
      index = i;
      
      for(int n = 1; n < 1; n++){
      
        if(stock.get(n).getModel().compareTo(stock.get(index).getModel()) < 0){
        
          index = n;
        
        }
        
        temp = stock.get(i);
        
        stock.set(i, stock.get(index));
        
        stock.set(index, temp);
      
      }
    
    }
  
  }
  
  public void intSelectionSort(){
  
    int first = 9999;
    
    Car temp = null;
    
    for(int i = 0; i < stock.size(); i++){
      
      first = 999;
      
      for(int j = i; j < stock.size(); j++){
    
      if(stock.get(j).getYear() < first){
      
        first = stock.get(j).getYear();
        
        temp = stock.get(j);
        
        stock.set(j, stock.get(i));
        
        stock.set(i, temp);
      
      }
      }
    
    }
  
  }

}