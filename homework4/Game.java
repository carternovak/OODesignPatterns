package homework4;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Game implements World {
  Snake snake;
  public Game() {
    this.snake = new Snake();
  }
  public void teh(){
    this.snake.move();
  }
  public void meh(MouseEvent e){ }
  public void keh(KeyEvent e){
    if(e.getKeyCode() == KeyEvent.VK_LEFT){
      this.snake.setDirection("west");
    }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
      this.snake.setDirection("east");
    }else if(e.getKeyCode() == KeyEvent.VK_UP){
      this.snake.setDirection("north");
    }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
      this.snake.setDirection("south");
    }else{
      System.out.println(e);
      char c = e.getKeyChar();
      if(c == '5') this.snake.setDirection("stop");
      else if(c == '8') this.snake.setDirection("north");
      else if(c == '2') this.snake.setDirection("south");
      else if(c == '4') this.snake.setDirection("west");
      else if(c == '6') this.snake.setDirection("east");
      else {  }
    }
  }
  public void draw(Graphics g){
    this.snake.draw(g);
  }
  public static void main(String[] args){
    BigBang big = new BigBang(new Game());
    big.start(200, 400);
  }

}
