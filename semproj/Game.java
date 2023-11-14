package semproj;

import java.util.ArrayList;

public class Game {
  public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Wyatt");
      names.add("Ross");
      names.add("David");
      Model a = new Model(1000);
      for (String name : names ) {
          Controller c = new Controller(a);
          View view = new View(name);
          c.addView(view);
      }
      a.start();
  }
}