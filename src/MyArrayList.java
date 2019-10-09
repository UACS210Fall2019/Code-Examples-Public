
public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
        capacity = DEFAULT_CAPACITY;
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
        // TODO
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
        // TODO
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
        // TODO
        return false;
    }

}
