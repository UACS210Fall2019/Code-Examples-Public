
/*
 * An example of Queue and Stack usage.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class E04Mirror {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("a");
        q.add("b");
        q.add("c");
        mirror(q);
        System.out.println(q);
    }

    public static void mirror(Queue<String> q) {
        Stack<String> qs = new Stack<String>();
        int qSize = q.size();
        for (int i = 0; i < qSize; i++) {
            String str = q.remove();
            q.add(str);
            qs.push(str);
        }
        while (!qs.empty()) {
            q.add(qs.pop());
        }
    }

}
