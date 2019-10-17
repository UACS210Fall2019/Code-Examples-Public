
public interface GenericListInterface<E> {

    public void add(E value);

    public void add(int index, E value);

    public void clear();

    public boolean contains(E value);

    public E get(int index);

    public boolean isEmpty();

    public void remove(int index);

    public int size();

}
