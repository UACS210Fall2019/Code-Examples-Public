// Allison Obourn
// CSC 210 - lecture 16
// This interface describes all of the methods that a list should have.

public interface List<E> {
   public void add(E value);
   public void add(int index, E value);
   public E get(int index);
   public int indexOf(E value);
   public boolean isEmpty();
   public void set(int index, E value);
   public int size();
   public void remove(int index);  
}
