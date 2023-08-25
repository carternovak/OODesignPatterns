import java.util.ArrayList;

public class RandomStringGenerator {

  public ArrayList<Range> arrayList = new ArrayList<Range>();

  public static void main(String[] args){
    RandomStringGenerator generator = new RandomStringGenerator();
    generator.addRange('a', 'z');
    generator.addRange('A', 'Z');
    generator.addRange('0', '9');
    String s = generator.nextString(Integer.parseInt(args[0]));

    System.out.println(s);
  }

  public void addRange(char start, char stop){
    this.arrayList.add(new Range(start, stop));
    //System.out.println(this.arrayList);
  }

  public String nextString(int length){
    String result = "";
    for(int i = 0; i < length; i++){
      int j = (int)(Math.random() * arrayList.size());
      result += (this.arrayList.get(j).word() + "");
    }
    return result;
  }
}
