import java.util.HashSet;
import java.util.Set;

public class E05Combinations {

    public static void main(String[] args) {
        combinations("GOOGLE", 3);
    }

    /* Prints out all possible k-letter combinations of letters. */
    public static void combinations(String s, int k) {
        Set<String> solutions = new HashSet<String>();
        combinationsHelper(s, k, "", solutions);
        System.out.println(solutions);
    }

    public static void combinationsHelper(String s, int numChars, String soFar,
            Set<String> solutions) {

        if (numChars == 0) {
            solutions.add(soFar);
        } else {
            for (int i = 0; i < s.length(); i++) {
                String chosen = s.substring(i, i + 1);
                if (!soFar.contains(chosen)) {
                    String newString = s.substring(0, i) + s.substring(i + 1);

                    combinationsHelper(newString, numChars - 1, chosen + soFar,
                            solutions);
                }
            }
        }

    }
}
