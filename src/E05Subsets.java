import java.util.Set;
import java.util.TreeSet;

public class E05Subsets {

    public static void main(String[] args) {
        Set<Character> chars = new TreeSet<>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printSubsets(chars);
    }


    /*
     * Print all possible subsets of the set of characters passed
     * into the function.
     */
    public static void printSubsets(Set<Character> chars) {
        recPrintSubsets(new TreeSet<Character>(),
                new TreeSet<Character>(chars));
    }

    public static void recPrintSubsets(Set<Character> soFar,
            TreeSet<Character> rest) {

        if (rest.isEmpty()) {
            System.out.println(soFar);
        } else {
            // Choose
            Character chosen = rest.first();
            TreeSet<Character> newSet = new TreeSet<Character>(rest);
            newSet.remove(chosen);

            // Explore
            // With the chosen character added
            soFar.add(chosen);
            recPrintSubsets(soFar, newSet);

            // With the chosen character removed
            soFar.remove(chosen);
            recPrintSubsets(soFar, newSet);
        }
    }

}
