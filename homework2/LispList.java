public interface LispList {
  // 16.9
  boolean empty();
  Object head();
  LispList tail();
  LispList cons(Object obj);
  EmptyList NIL = new EmptyList();

  // 16.10
  int length();

  // 16.11
  LispList merge(LispList other);

  // 16.12
  boolean contains(Object obj);
}
