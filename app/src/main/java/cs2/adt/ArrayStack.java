package cs2.adt;

public class ArrayStack<T> implements Stack<T> {
  private T[] arr;
  private int len;

  public ArrayStack() {
    arr = (T[]) new Object[10];
    len = 0;
  }

  public T pop() {
    len--;
    return arr[len];
  }
  public void push(T elem) {
    if(len >= arr.length) {
      T[] tmp = (T[]) new Object[arr.length*2];
      for(int i=0; i<arr.length; i++) {
        tmp[i] = arr[i];
      }
      arr = tmp;
    }

    arr[len] = elem;
    len++;
  }


  /*
  public void push(T elem) {
    T[] tmp = (T[])new Object[arr.length + 1];
    for(int i=0; i<arr.length; i++) {
      tmp[i] = arr[i];
    }
    tmp[tmp.length - 1] = elem;
    arr = tmp;
  }
  public T pop() {
    T retVal = arr[arr.length-1];
    T[] tmp = (T[]) new Object[arr.length - 1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = arr[i];
    }
    arr = tmp;
    return retVal;
  }*/
  public T peek() {
    return arr[arr.length-1];
  }
  public boolean isEmpty() {
    return arr.length == 0;
  }
}
