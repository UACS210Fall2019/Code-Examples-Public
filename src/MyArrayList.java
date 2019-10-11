import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList
        implements MyListInterface, Iterable<Integer>, Iterator<Integer> {

    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int size;
    private int capacity;

    private int iteratorIndex;

    public MyArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
        capacity = DEFAULT_CAPACITY;
        iteratorIndex = 0;
    }

    private void growArray() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity *= 2;
    }

    public void add(int value) {
        if (size >= capacity) {
            this.growArray();
        }
        array[size] = value;
        size += 1;
    }

    public void add(int index, int value) {
        // NOTE: Would want to check that the index is valid here first.
        if (size >= capacity) {
            growArray();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size += 1;
    }

    public void clear() {
        size = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < size) {
            return array[index];
        } else {
            // NOTE this is not proper error checking.
            // Should throw an exception.
            System.out.println("Index greater than size");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove(int index) {
        // NOTE: Would want to check that the index is valid here first.
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size -= 1;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "{ ";
        for (int i = 0; i < size; i++) {
            result += array[i] + " ";
        }
        result += "}";
        return result;
    }

    public boolean equals(Object o) {
        if (!(o instanceof MyArrayList)) {
            return false;
        }
        MyArrayList other = (MyArrayList) o;
        return size == other.size && Arrays.equals(array, other.array);
    }

    /*
     * NOTE: This is not the optimal way to provide a for-each loop
     * for the MyArrayList class, but it works!
     */
    @Override
    public Iterator<Integer> iterator() {
        iteratorIndex = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return iteratorIndex < size;
    }

    @Override
    public Integer next() {
        int result = array[iteratorIndex];
        iteratorIndex += 1;
        return result;
    }

}
