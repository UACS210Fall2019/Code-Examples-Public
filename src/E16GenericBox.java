
public class E16GenericBox<T> {

    private T item;

    public E16GenericBox(T item) {
        this.item = item;
    }

    public T getContent() {
        return item;
    }

    public void put(T item) {
        this.item = item;
    }

    public String toString() {
        return "The item is: " + item + " " + item.getClass();
    }
}
