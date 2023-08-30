public class LispListTester{
  public static void main(String[] args){
    // 16.9
    LispList list = LispList.NIL.cons("C").cons("B").cons("A");
    System.out.println(list.toString());
    
    // 16.10
    System.out.println(list.length());

    LispList list1 = LispList.NIL.cons(4).cons(3).cons(2).cons(1);
    LispList list2 = LispList.NIL.cons(6).cons(5);
    
    // 16.11
    System.out.println(list1.merge(list2));
    System.out.println(list2.merge(list1));
    // 16.12
    System.out.println(list.contains("C"));
    System.out.println(list.contains("G"));
  }
}
