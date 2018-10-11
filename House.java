/* 
 * This is a program in charge of making houses
 * John Khachian
 * 9/25
*/
public class House{
  
  //fields
  
  private int number;
  
  private String street;
  
  private String color;
  
  private int bedrooms;
  
  private double bathrooms;
  
  //constructors
  
  public House(int n, String s){
  
    number = n;
    
    street = s;
    
    color = null;
    
    bedrooms = 0;
    
    bathrooms = 0;
  
  }

  public House(int n, String s, String c, int be, double ba){
  
    number = n;
    
    street = s;
    
    color = c;
    
    bedrooms = be;
    
    bathrooms = ba;
  
  }
  
  //Accessors
  
  public int getNumber(){return  number;}
  public String getStreet(){return  street;}
  public String getColor(){return  color;}
  public int getBedrooms(){return  bedrooms;}
  public double getBathrooms(){return  bathrooms;}
  
  public String toString(){
  
    return number + ", " + street + ", " + color + ", " + bedrooms + ", " + bathrooms;
    
  }
  
  //Mutators
  
  public void changeNumber(int n){number = n;}
  public void changeStreet(String s){street = s;}
  public void changeColor(String c){color = c;}
  public void changeBedrooms(int be){bedrooms = be;}
  public void changeBathrooms(double ba){bathrooms = ba;}

}