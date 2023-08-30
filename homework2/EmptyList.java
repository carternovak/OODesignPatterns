public class EmptyList implements LispList {
  // 16.9
  public boolean empty(){
    return true;
  }

  public Object head() {
    throw new UnsupportedOperationException();
  }

  public LispList tail(){
    throw new UnsupportedOperationException();
  }

  public LispList cons(Object obj){
    return new NonEmptyList(obj, this);
  }

  public String toString(){
    return "";
  }

  // 16.10
  public int length(){
    return 0;
  }

  // 16.11
  public LispList merge(LispList other){
    Object[] tempArr = new Object[other.length()];
    LispList list = LispList.NIL;

    for(int i = 0; i < tempArr.length; i++){
      tempArr[i] = other.head();
      other = other.tail();
    }

    for(int i = tempArr.length - 1; i >= 0; i--){
      list = list.cons(tempArr[i]);
    }
    return list;
  }

  // 16.12
  public boolean contains(Object obj){
    return false;
  }
}
