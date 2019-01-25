import java.util.ArrayList;
import java.util.List;

public class E05Enumerate {

    public static void main(String[] args) {
        enumerate(3, new ArrayList<Integer>());
    }

    /* Enumerates all possible binary numbers with N digits. */
    public static void enumerate(int N, List<Integer> sofar) {
        if (sofar.size() == N) { // base case: all decisions made?
            System.out.println(sofar);
            return;
        }
        for (int i = 0; i < 2; i++) { // all possible decisions
            sofar.add(i); // make decision
            enumerate(N, sofar);
            sofar.remove(sofar.size() - 1); // undo decision
        }
    }


}
