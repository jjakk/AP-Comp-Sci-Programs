
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
    
    int index = 0;
    
    ArrayList<Car> tempArray = new ArrayList<Car>();
    
    int go = stock.size();
    
    for(int i = 0; i < go; i++){
      
      index = 0;
    
      for(int j = 0; j < stock.size(); j++){
      
        if(stock.get(j).getModel().compareTo(stock.get(index).getModel()) < 0){
          
          index = j;
        
        }
      
      }
      
      tempArray.add(stock.get(index));
          
      stock.remove(index);
    
    }
    
    stock = tempArray;
  
  }
  
  public void intSelectionSort(){
  
    int first = 9999;
    
    Car temp = null;
    
    for(int i = 0; i < stock.size(); i++){
      
      first = 9999;
      
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