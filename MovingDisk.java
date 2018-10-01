import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingDisk extends JPanel
implements ActionListener{
  private int time;

  public MovingDisk(){
    time = 0;
    Timer clock = new Timer(30, this);
    clock.start();
  }

  public void paintComponent(Graphics g){
    int x = 150 - (int)(100 * Math.cos(0.05 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.05 * Math.PI * time));
    int r = 30;

    Color sky;
    if (y > 130) sky = Color.ORANGE;
    else sky = Color.GREEN;
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.RED);
    g.fillOval(x - r, y - r, 2*r, 2*r);
  }

  public void actionPerformed(ActionEvent e){
    time++;
    repaint();
  }

  public static void main(String [] args){
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);

    Container c = w.getContentPane();
    c.add(new MovingDisk());

    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setResizable(false);
    w.setVisible(true);
  }
}

