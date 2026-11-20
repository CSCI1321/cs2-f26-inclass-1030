package cs2.adt;

public class LinkedPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {
  private class Node {
    public T data; public Node next;
    public Node(T d, Node n) { data=d; next=n; }
  }

  Node head;
  public LinkedPriorityQueue() { head = null; }

  public void add(T elem) {
    if(head == null || elem.compareTo(head.data) > 0) {
      head = new Node(elem, head);
    }
    Node rover = head;
    while(rover.next != null && rover.next.data.compareTo(elem) < 0) {
      rover = rover.next;
    }
    rover.next = new Node(elem, rover.next);
  }
  public T get() {
    T retVal = head.data;
    head = head.next;
    return retVal;
  }
  public T peek() {
    return head.data;
  }
  public boolean isEmpty() {
    return head == null;
  }


  /*
  public void add(T elem) {
    head = new Node(elem, head);
  }
  public T get() {
    Node rover = head;
    Node obr = null;
    Node biggest = head; //biggest.data
    Node obb = null;
    while(rover != null) {
      if(rover.data.compareTo(biggest.data) > 0) {
        biggest = rover;
        obb = obr;
      }
      obr = rover;
      rover = rover.next;
    }
    obb.next = biggest.next;
    return biggest.data;
  }
  public T peek() {
    T biggest = head.data;
    Node rover = head;
    while(rover != null) {
      if(rover.data.compareTo(biggest) > 0) {
        biggest = rover.data;
      }
      rover = rover.next;
    }
    return biggest;
  }
  public boolean isEmpty() {
    return head == null;
  }*/

}
