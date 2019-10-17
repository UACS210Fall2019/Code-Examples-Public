
public class MyLinkedList<E> implements GenericListInterface<E> {

    /*
     * NOTE: When you are implementing similar code for PA6, you can
     * and should add other variables here to improve your performance.
     * 
     * The below code is JUST what we wrote in class. The actual
     * LinkedList implementation would use a few other techniques to
     * improve the efficiency of certain methods. I expect you to improve
     * upon this implementation for PA6.
     */
    private Node<E> front;
    private int size;

    public MyLinkedList() {
        front = null;
        size = 0;
    }

    @Override
    public void add(E value) {
        Node<E> newNode = new Node<E>(value, null);
        if (front == null) {
            front = newNode;
        } else {
            Node<E> curr = front;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size += 1;
    }

    @Override
    public void add(int index, E value) {
        if (index < 0 || index > size) {
            // Throw an exception
        }
        if (index == 0) {
            Node<E> newNode = new Node<E>(value, front);
            front = newNode;
            size += 1;
            return;
        }
        int count = 0;
        Node<E> curr = front;
        while (curr.next != null && count < index - 1) {
            curr = curr.next;
            count += 1;
        }
        // Curr is the node before the index that we want to insert
        Node<E> newNode = new Node<E>(value, curr.next);
        curr.next = newNode;
        size += 1;
    }

    @Override
    public void clear() {
        front = null;
        size = 0;
    }

    @Override
    public boolean contains(E value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        size -= 1;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        String result = "{ ";
        Node<E> curr = front;
        while (curr != null) {
            result += curr.data + ", ";
            curr = curr.next;
        }
        result += "}";
        return result;
    }

    public boolean equals(Object o) {
        return false;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

}
