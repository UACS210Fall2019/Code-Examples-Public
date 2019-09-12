
public class E06GenSubsets {

    public static void main(String[] args) {
        printSubsets("abc");
    }

    /*
     * Prints out all possible subsets of characters from the
     * passed in string.
     */
    public static void printSubsets(String chars) {
        helperSubsets(chars, "");
    }

    /*
     * We want another parameter so we have to make a helper function!
     */
    public static void helperSubsets(String chars, String soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            char firstCharacter = chars.charAt(0);

            // Include this character in all possible subsets
            helperSubsets(chars.substring(1), soFar + firstCharacter);

            // Don't include this character in all possible subsets
            helperSubsets(chars.substring(1), soFar);
        }
    }

}
