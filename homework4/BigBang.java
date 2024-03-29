

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BigBang extends JComponent implements ActionListener, MouseListener, KeyListener {
  Timer timer;
  World world;
  public BigBang(World world) {
    this.world = world;
    this.addMouseListener(this);
    this.addKeyListener(this);
    this.setFocusable(true);
    this.requestFocus();
  }

  public void start(int delay, int size) {
    JFrame j = new JFrame();
    j.add(this);
    j.setVisible(true);
    j.setSize(size, size);
    this.timer = new Timer(delay, this);
    this.timer.start();
  }

  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){ }
  public void mousePressed(MouseEvent e){
    this.world.meh(e);
    this.repaint();
  }
  public void mouseReleased(MouseEvent e){ }
  public void mouseClicked(MouseEvent e){ }
  public void keyPressed(KeyEvent e){
    this.world.keh(e);
    this.repaint();
  }
  public void keyReleased(KeyEvent e){ }
  public void keyTyped(KeyEvent e){ }

  public void actionPerformed(ActionEvent e){
    this.world.teh();
    this.repaint();
  }
  public void paintComponent(Graphics g){
    this.world.draw(g);
  }
}


