package cs2.sandbox;

import java.util.ArrayList;

public class GenericSorting {
  public static <T> ArrayList<T> arrayToArrayList(T[] arr) {
    ArrayList<T> lst = new ArrayList<>();
    for(T t : arr) { lst.add(t); }
    return lst;
  }

  public static void bubbleSort(int[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i] > a[i+1]) {
          int tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static <T extends Comparable<T>> void genericBubbleSort(T[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i].compareTo(a[i+1]) > 0) {
          T tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    String[] sarr = {"Hello","You","Today","Here"};
    Integer[] iarr = {3,2,5,6,1,9,4};
    System.out.println(iarr);
    //System.out.println(arrayToArrayList(iarr));
    for(int x:iarr) { System.out.print(x + ","); }
    genericBubbleSort(iarr);
    System.out.println();
    for(int x:iarr) { System.out.print(x + ","); }
    for(String x:sarr) { System.out.print(x + ","); }
    genericBubbleSort(sarr);
    for(String x:sarr) { System.out.print(x + ","); }
  }
}
