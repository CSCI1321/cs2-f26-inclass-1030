package cs2.adt;

import java.util.EmptyStackException;

public interface Stack<T> {
  public abstract void push(T elem);
  public abstract T pop() throws EmptyStackException;
  public abstract T peek() throws EmptyStackException;
  public abstract boolean isEmpty();
}
