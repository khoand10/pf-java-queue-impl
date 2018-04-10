import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListQueue<T> extends LinkedList<T> implements Queue<T>{
  
  public boolean add(T obj) {
    if (obj == null) {
      throw new NullPointerException();
    } else if (tail == null) {
      head = new Node<T>(obj);
      tail = head;
      currPos++;
    } else {
      Node<T> node = new Node<T>(obj);
      tail.setNext(node);
      tail = node;
      currPos++;
    }
    return true;
  }
  
  public int size() { return currPos; }
  
  @Override
  public T element() throws NoSuchElementException {
    if(size() == 0){
      throw new NoSuchElementException();
    } else {
      return head();
    }
  }

  @Override
  public boolean offer(T obj) {
    if(obj == null) {
      return false;
    }
    //TODO: call super.add(..) ?
    if(tail == null) {
      head = new Node<T>(obj);
      tail= head;
      currPos ++;
    } else {
      Node<T> node = new Node<T>(obj);
      tail.setNext(node);
      tail = node;
      currPos++;
    }
    return true;
  }

  @Override
  public T peek() {
    if(size() == 0){
      return null;
    } else {
      return head();
    }
  }

  @Override
  public T poll() {
    if(size() == 0) { return null; } else {
      //TODO: call removeHead();
      T val = head.getValue();
      head = head.getNext();
      currPos --;
      return val;
    }
  }

  @Override
  public T remove() throws NoSuchElementException, NullPointerException {
    if(size() == 0) {
      throw new NoSuchElementException();
    }
    return removeHead();
  }
}
