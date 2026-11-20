package cs2.adt;

public interface List<T> {
  public void set(int idx, T item);
  public T get(int idx);
  public void insert(int idx, T item);
  public void remove(int idx);
  public int size();
}
