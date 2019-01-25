import java.util.ArrayList;
import java.util.List;

public class E05Permutations {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printPermutations(chars);
    }

    /*
     * Print out all possible permutations of the passed in list of
     * characters.
     */
    public static void printPermutations(List<Character> chars) {
        recPrintPermutations(new ArrayList<Character>(), chars);
    }

    public static void recPrintPermutations(List<Character> sofar,
            List<Character> rest) {
        if (rest.isEmpty()) { // base case: all decisions made?
            System.out.println(sofar.toString());
            return;
        }

        for (int i = 0; i < rest.size(); i++) { // all possible decisions
            sofar.add(rest.get(i)); // make decision

            List<Character> new_rest = new ArrayList<Character>();
            new_rest.addAll(rest.subList(0, i));
            new_rest.addAll(rest.subList(i + 1, rest.size()));
            recPrintPermutations(sofar, new_rest);

            sofar.remove(sofar.size() - 1); // undo local decision
        }
    }
}
