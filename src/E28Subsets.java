import java.util.Set;
import java.util.TreeSet;

public class E28Subsets {

    public static void main(String[] args) {
        TreeSet<Character> chars = new TreeSet<>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printSubsets(chars);
    }

    /*
     * Print all possible subsets of the set of characters passed
     * into the function.
     */
    public static void printSubsets(TreeSet<Character> chars) {
        recPrintSubsets(new TreeSet<Character>(), chars);
    }

    private static void recPrintSubsets(Set<Character> soFar,
            TreeSet<Character> choices) {
        if (choices.isEmpty()) {
            System.out.println(soFar);
        } else {
            Character choice = choices.first();
            TreeSet<Character> newSet = new TreeSet<Character>(choices);
            newSet.remove(choice);

            // Include choice in subsets
            soFar.add(choice);
            recPrintSubsets(soFar, newSet);

            // Don't include choice in subsets
            soFar.remove(choice);
            recPrintSubsets(soFar, newSet);
        }
    }

}
