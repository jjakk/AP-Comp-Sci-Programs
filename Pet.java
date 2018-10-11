/*
 * This Class defines the attributes and actions of a pet.
 * John Khachian
 * 9/21/2018
*/

public class Pet{
  
  //Fields
  
  private String type;
  private String breed;
  private String name;
  
  //Constructors
  
  public Pet(String t){
    
    type = t;
    breed = null;
    name = null;
    
  }
  
  public Pet(String t, String b, String n){
  
    type = t;
    breed = b;
    name = n;
  
  }
  
  //Methods
  
  //Accesor methods
  
  public String getType(){return type;}
  public String getBreed(){return breed;}
  public String getName(){return name;}
  
  public String toString(){
  
    return type + ", " + breed + ", " + name;
  
  }
  
  //Mutator methods
  
  public void changeType(String t){type = t;}
  public void changeBreed(String b){breed = b;}
  public void changeName(String n){name = n;}
  
}