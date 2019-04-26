/**
 * Creates a collection of information about houses in a town.
 * Mrs. Westervelt
 * 9/21/16
 */

import java.util.ArrayList;

public class Town{
  
  private ArrayList<Integer> numbers = new ArrayList<Integer>();
  
  private ArrayList<String> streets = new ArrayList<String>();
  
  private ArrayList<String> colors = new ArrayList<String>();
  
  private ArrayList<Integer> beds = new ArrayList<Integer>();
  
  private ArrayList<Double> baths = new ArrayList<Double>();
  
  public Town(int [] n, String [] s, String [] c, int [] be, double [] ba){
  
    for(int i = 0; i < n.length; i++)numbers.add(n[i]);
    
    for(int i = 0; i < s.length; i++)streets.add(s[i]);
    
    for(int i = 0; i < c.length; i++)colors.add(c[i]);
    
    for(int i = 0; i < be.length; i++)beds.add(be[i]);
    
    for(int i = 0; i < ba.length; i++)baths.add(ba[i]);
  
  }
  
  public void selectionSort(String field){
    
    if(field.equals("numbers")){
    
      intSelectionSort(numbers);
    
    }
  
    else if(field.equals("streets")){
    
      stringSelectionSort(streets);
    
    }
    
    else if(field.equals("colors")){
    
      stringSelectionSort(colors);
    
    }
    
    else if(field.equals("beds")){
    
      intSelectionSort(beds);
    
    }
    
    else if(field.equals("Baths")){
    
      doubleSelectionSort(baths);
    
    }
    
    else{
    
      System.out.println("Invalid input");
    
    }
  
  }
  
  public void stringSelectionSort(ArrayList<String> stock){
    
    int index = 0;
    
    ArrayList<String> tempArray = new ArrayList<String>();
    
    int go = stock.size();
    
    for(int i = 0; i < go; i++){
      
      index = 0;
    
      for(int j = 0; j < stock.size(); j++){
      
        if(stock.get(j).compareTo(stock.get(index)) < 0){
          
          index = j;
        
        }
      
      }
      
      tempArray.add(stock.get(index));
          
      stock.remove(index);
    
    }
    
    for(int i = 0; i < tempArray.size(); i++)stock.add(tempArray.get(i));
  
  }
  
  public void intSelectionSort(ArrayList<Integer> stock){
  
    int first = 9999;
    
    int temp = 0;
    
    for(int i = 0; i < stock.size(); i++){
      
      first = 9999;
      
      for(int j = i; j < stock.size(); j++){
    
        if(stock.get(j) < first){
          
          first = stock.get(j);
          
          temp = stock.get(j);
          
          stock.set(j, stock.get(i));
          
          stock.set(i, temp);
          
        }
        
      }
    
    }
  
  }

  public void doubleSelectionSort(ArrayList<Double> stock){
  
    double first = 9999;
    
    double temp = 0;
    
    for(int i = 0; i < stock.size(); i++){
      
      first = 9999;
      
      for(int j = i; j < stock.size(); j++){
    
      if(stock.get(j) < first){
      
        first = stock.get(j);
        
        temp = stock.get(j);
        
        stock.set(j, stock.get(i));
        
        stock.set(i, temp);
      
      }
      }
    
    }
  
  }
  
  public void printList(){
    
    for(int i = 0; i < numbers.size(); i++)System.out.print("Number : " + numbers.get(i) + " Street : " + streets.get(i) + " Color : " + colors.get(i) + " Beds : " + beds.get(i) + " Baths : " + baths.get(i) + "\n");
    
    System.out.println();
  
  }
  
  public static void main(String [] args){
    House sally = new House(18, "Mayflower Rd", "gray", 3, 2);
    House billy = new House(21, "Mayflower Rd");
    
    System.out.println(sally);
    System.out.println(billy);
    
    sally.changeNumber(6);
    sally.changeStreet("Plymouth Rd");
    sally.changeColor("blue");
    sally.changeBedrooms(5);
    sally.changeBathrooms(2.5);
    
    System.out.println(sally.getNumber() + " " + sally.getStreet());
    System.out.println(sally.getColor());
    System.out.println(sally.getBedrooms() + " bedrooms and "+sally.getBathrooms() + " bathrooms");
  } 
}