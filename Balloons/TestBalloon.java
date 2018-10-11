import java.awt.Color;

public class TestBalloon
{
  public static void main(String [] args)
  {
    //Create a balloon called Greenie, centered at x = 50, y = 100
    //with radius 30 and color Color.GREEN
    Balloon greenie = new Balloon(50,100,30,Color.GREEN);
    System.out.println("x = " + greenie.getX());
    System.out.println("y = " + greenie.getY());
    System.out.println("radius = " + greenie.getRadius());
    System.out.println("color = " + greenie.getColor());
    
    //Call Greenie's move method to move its center to (60,110)
    greenie.move(60,110);
    System.out.println("x = " + greenie.getX());
    System.out.println("y = " + greenie.getY());
    
    //Call Greenie's isOnBorder method to see if (81,131)
    //is on the border
    boolean onBorder = greenie.isOnBorder(81,131);
    System.out.println("(81,131) is on the border: " + onBorder);
  }
}