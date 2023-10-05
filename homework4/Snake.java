

import java.awt.*;
import java.util.*;

public class Snake extends ArrayList<Circle>{
  final static int RADIUS = 5;
  String direction = "stop";
  public Snake(){
    int d = 2 * Snake.RADIUS;
    this.add(new Circle(200 + 0 * d, 200 + 0 * d, d/2, Color.BLUE));
    this.add(new Circle(200 + 0 * d, 200 + 1 * d, d/2, Color.RED));
    this.add(new Circle(200 + 0 * d, 200 + 2 * d, d/2, Color.RED));
    this.add(new Circle(200 + 0 * d, 200 + 3 * d, d/2, Color.RED));
    this.add(new Circle(200 + 0 * d, 200 + 4 * d, d/2, Color.RED));
    this.add(new Circle(200 + 1 * d, 200 + 4 * d, d/2, Color.RED));
    this.add(new Circle(200 + 2 * d, 200 + 4 * d, d/2, Color.RED));
    this.add(new Circle(200 + 3 * d, 200 + 4 * d, d/2, Color.RED));
    this.add(new Circle(200 + 3 * d, 200 + 3 * d, d/2, Color.RED));
    this.add(new Circle(200 + 3 * d, 200 + 2 * d, d/2, Color.RED));
    this.add(new Circle(200 + 4 * d, 200 + 2 * d, d/2, Color.RED));
    this.add(new Circle(200 + 5 * d, 200 + 2 * d, d/2, Color.RED));
  }
  public void draw(Graphics g){
    for(int i = this.size() - 1; i >= 0; i--)
      this.get(i).draw(g);
  }
  public void setDirection(String direction){
    this.direction = direction;
  }
  public void move(){
    if(":north:east:west:south:".contains(this.direction)){
      int x = this.get(0).x;
      int y = this.get(0).y;
      int d = 2 * Snake.RADIUS;
      if(this.direction.equals("north")){
        this.add(0, new Circle(x + 0, y - d, d/2, Color.BLUE));
      }else if(this.direction.equals("east")){
        this.add(0, new Circle(x + d, y + 0, d/2, Color.BLUE));
      }else if(this.direction.equals("south")){
        this.add(0, new Circle(x + 0, y + d, d/2, Color.BLUE));
      }else if(this.direction.equals("west")){
        this.add(0, new Circle(x - d, y + 0, d/2, Color.BLUE));
      }
      this.get(1).setColor(Color.RED);
      this.remove(this.size() - 1);
    }else { }
  }
}

