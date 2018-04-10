import java.util.NoSuchElementException;

public interface Queue<T> {
  
  public boolean add(T e);
  
  public T element() throws NoSuchElementException ;
  
  boolean offer(T e);
  
  public T peek();
  
  public T poll();
  
  public T remove() throws NoSuchElementException ;

  public int size();
}
