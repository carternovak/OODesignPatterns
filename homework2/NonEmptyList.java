public class NonEmptyList implements LispList{
  // 16.9
  private Object head;
  private LispList tail;

  public boolean empty(){
    return false;
  }

  public NonEmptyList(Object head, LispList tail){
    this.head = head;
    this.tail = tail;
  }

  public Object head(){
    return head;
  }

  public LispList tail(){
    return tail;
  }

  public LispList cons(Object obj){
    LispList list = new NonEmptyList(obj, this);
    return list;
  }

  public String toString(){
    return head() + " " + tail().toString();
  }

  // 16.10
  public int length(){
    return 1 + tail().length();
  }

  // 16.11
  public LispList merge(LispList other){
    int maxLen = Math.max(other.length(), length()) + Math.abs(other.length() - length());
    Object[] tempArr = new Object[maxLen];
    LispList tempList = this;
    int i = 0;
    while(i < tempArr.length){
      if(!tempList.empty()){
        tempArr[i] = tempList.head();
        tempList = tempList.tail();
        i++;
      }
      if(!other.empty()){
        tempArr[i] = other.head();
        other = other.tail();
        i++;
      }
    }
    LispList result = LispList.NIL;
    for(i = tempArr.length - 1; i >= 0; i--){
      result = result.cons(tempArr[i]);
    }
    return result;
  }

  // 16.12
  public boolean contains(Object obj){
    if(obj == null){
      if(this.head == null){
        return true;
      }
    }else if(obj.equals(this.head)){
      return true;
    }
    return tail().contains(obj);
  }

}
