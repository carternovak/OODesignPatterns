import java.util.ArrayList;

public class Range {

  char start, stop;
  public Range(char start, char stop) {
    this.start = start;
    this.stop = stop;
  }
  public char word(){
    return (char)(start + (int)(Math.random() * (stop - start + 1)));
  }
  public static void main(String[] args){
    ArrayList<Range> test = new ArrayList<Range>();
    test.add(new Range('0', '3'));
    test.add(new Range('5', '6'));
    test.add(new Range('8', '8'));
    for(int i = 0; i < test.size(); i++){
      for(int j = 0; j < 12; j++){
        System.out.print(test.get(i).word());
      }
      System.out.println();
    }
  }
}
