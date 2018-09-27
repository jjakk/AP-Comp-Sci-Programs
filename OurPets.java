/* This class is the test class for the pet class
 * John Khachian
 * 9/21/18
*/

public class OurPets{

  public static void main(String [] args){
  
    Pet mrsWestervelt = new Pet("Dog");
    
    Pet john = new Pet("Dog", "German Shepard", "Max");
    
    Pet natalie = new Pet("Dog", "Golden Doodle", "Lincoln");
    
    System.out.println(mrsWestervelt.getType());
    
    System.out.println(john.getBreed());
    
    System.out.println(natalie.getName());
    
    mrsWestervelt.changeType("cat");
    
    System.out.println(mrsWestervelt.getType());
    
    mrsWestervelt.changeBreed("poodle");
    
    System.out.println(mrsWestervelt.getBreed());
    
    mrsWestervelt.changeName("Spot");
    
    System.out.println(mrsWestervelt.getName());
    
    System.out.println(mrsWestervelt);
    
    System.out.println();
  
  }

}