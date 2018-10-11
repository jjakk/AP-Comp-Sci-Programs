import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a square balloon in the DrawingEditor program.
 */
public class SquareBalloon extends Balloon{

  public SquareBalloon(){
    // super();
  }

  public SquareBalloon(int x, int y, int r, Color c){
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
      g.fillRect(x - r, y - r, 2*r, 2*r);
    else
      g.drawRect(x - r, y - r, 2*r, 2*r);
  }
}