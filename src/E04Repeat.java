
/*
 * An example of Queue usage.
 */
import java.util.LinkedList;
import java.util.Queue;

public class E04Repeat {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        repeat(q);
        System.out.println(q);
    }

    public static void repeat(Queue<Integer> q) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            q.add(q.peek());
            q.add(q.remove());
        }
    }

}
