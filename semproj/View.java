package semproj;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class View extends JComponent implements KeyListener {
    int time;
    ArrayList<Point> world;
    String name;
    Controller c;
    boolean showNames = false;
    public View(String name) {
        this.name = name;
        JFrame a = new JFrame(name);
        a.add(this);
        a.setSize(400, 400);
        a.setVisible(true);
        a.addKeyListener(this);
    }
    int RADIUS = 20;
    public void paintComponent(Graphics g) {
        g.drawString("World time " + this.time, 10, 20);
        if (this.world == null) {

        } else {
            for (int i = 0; i < this.world.size(); i++) {
                int x = this.world.get(i).x;
                int y = this.world.get(i).y;
                if(this.showNames){
                    g.setColor(Color.GREEN);
                    g.fillOval(x - RADIUS / 2, y - RADIUS, 3 * RADIUS, 2 * RADIUS);
                    g.setColor(Color.BLACK);
                    g.drawOval(x - RADIUS / 2, y - RADIUS, 3 * RADIUS, 2 * RADIUS);
                    g.drawString(this.c.model.clients.get(i).view.name, x + RADIUS / 5, y+ RADIUS / 4);
                }
                if (i == this.c.id) {
                    g.setColor(Color.GREEN);
                    g.fillOval(x - RADIUS / 2, y - RADIUS, 3 * RADIUS, 2 * RADIUS);;
                    g.setColor(Color.BLACK);
                    g.drawOval(x - RADIUS / 2, y - RADIUS, 3 * RADIUS, 2 * RADIUS);;
                    g.drawString(name, x + RADIUS / 5, y + RADIUS / 4);
                }
                else {
                    g.setColor(Color.BLACK);
                    g.drawOval(x - RADIUS / 2, y - RADIUS, 3 * RADIUS, 2 * RADIUS);;
                }
            }
        }
    }
    public void showTime(int time) {
        this.time = time;
        this.repaint();
    }
    public void keyPressed(KeyEvent e) {
        int input = e.getKeyCode();
        if(input == 32){
            this.showNames = !this.showNames;
        }
        c.move(input);
    }
    public void keyTyped(KeyEvent e) { }
    public void keyReleased(KeyEvent e) { }
    public void addController(Controller c) {
        this.c = c;
    }
    public void draw(ArrayList<Point> world) {
        this.world = world;
        this.repaint();
    }
}
