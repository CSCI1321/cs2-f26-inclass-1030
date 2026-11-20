package cs2.adt;

public class DoubleLinkList<T> implements List<T> {
  private class Node {
    public T data;
    public Node prev, next;
    public Node(T d, Node p, Node n) { data=d; prev=p; next=n; }
    public Node getAfter(int idx) {
      Node rover = this;
      for(int i=0; i<idx; i++) {
        rover = rover.next;
      }
      return rover;
    }
  }

  private Node head;

  public DoubleLinkList() {
    head = null;
  }

  public void set(int idx, T item) {
    Node rover = head.getAfter(idx);
    rover.data = item;
  }
  public T get(int idx) {
    Node rover = head.getAfter(idx);
    return rover.data;
  }
  public void insert(int idx, T item) {
    Node rover = head.getAfter(idx-1);
    rover.next = new Node(item, rover, rover.next);
    rover.next.next.prev = rover.next;
  }
  public void remove(int idx) {
    
  }
  public int size();

}
