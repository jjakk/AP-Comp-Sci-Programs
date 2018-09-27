/**
 * Creates a collection of information about houses in a neightborhood.
 * John Khachian
 * 9/27/16
 */
public class Neighborhood
{
  public static void main(String [] args)
  {
    House bob = new House(25, "Wood Rd", "red", 3, 4);
    House kevin = new House(36, "Random Drive");
    
    System.out.println(bob);
    System.out.println(kevin);
    
    bob.changeNumber(21);
    bob.changeStreet("Other Rd");
    bob.changeColor("blue");
    bob.changeBedrooms(6);
    bob.changeBathrooms(3.5);
    
    System.out.println(bob.getNumber() + " " + bob.getStreet());
    System.out.println(bob.getColor());
    System.out.println(bob.getBedrooms() + " bedrooms and "+ bob.getBathrooms() + " bathrooms");
  } 
}