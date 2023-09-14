package homework4;
import java.awt.*;

public class Circle{
  int x, y, r;
  Color c;
  public Circle(int x, int y, int r, Color c){
    this.x = x;
    this.y = y;
    this.r = r;
    this.c = c;
  }
  public void draw(Graphics g){
    g.setColor(c);
    g.fillOval(x - r, y - r, 2 * r, 2 * r);
    g.setColor(Color.BLACK);
    g.drawOval(x - r, y - r, 2 * r, 2 * r);
  }
  public void setColor(Color c){
    this.c = c;
  }
}

