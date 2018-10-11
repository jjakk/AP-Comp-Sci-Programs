import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a fancy balloon in the DrawingEditor program.
 */
public class FancyBalloon extends Balloon{

  public FancyBalloon(){
    // super();
  }

  public FancyBalloon(int x, int y, int r, Color c){
    super(x, y, r, c);
  }

  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled indicates whether to draw a solid circle
   */
  public void draw(Graphics g, boolean makeItFilled){
    g.setColor(getColor());
    int r = getRadius();
    int x = getX();
    int y = getY();

    if (makeItFilled)
      g.fillOval(x - r, y - r, r*5, r);
    else
      g.drawOval(x - r, y - r, r*5, r);
  }
}