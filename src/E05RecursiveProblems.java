public class E05RecursiveProblems {

    public static void main(String[] args) {
        System.out.println(frequency("Mississippi", 's'));

        System.out.println(indexOf("baboon", "cat"));
        System.out.println(indexOf("baboon", "boon"));

        System.out.println(subsequences("xyz"));
        System.out.println(subsequences("apple"));
        System.out.println(subsequences("xy"));

    }

    /*
     * Returns the number of occurrences of a character in a word
     */
    public static int frequency(String s, char c) {
        if (s.length() == 0) {
            return 0;
        } else if (s.charAt(0) == c) {
            return 1 + frequency(s.substring(1), c);
        } else {
            return frequency(s.substring(1), c);
        }
    }


    /*
     * Takes two strings as parameters returns the index of where
     * the second string starts in the first. If the second isn't in
     * the first, returns -1.
     */
    public static int indexOf(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return -1;
        } else if (s1.substring(0, s2.length()).equals(s2)) {
            return 0;
        } else {
            int pos = indexOf(s1.substring(1), s2);
            if (pos == -1) {
                return pos; // very important to have this if/else separation
            } else {
                return pos + 1;
            }
        }
    }

    /*
     * Return a string with all possible subsequences of a word
     * separated by commas where a subsequence is a string with
     * the letters appearing in the same order.
     * Example "xyz" could return "xyz, xy, yz, xz, x, y, z"
     * Any subsequence can appear more than once.
     * You can use a helper method.
     * 
     */
    public static String subsequences(String word) {
        return subsequencesAfter("", word);
    }

    /*
     * Return all subsequences of word (as defined above) separated by commas,
     * with partialSubsequence prepended to each one.
     */
    private static String subsequencesAfter(String partialSubsequence,
            String word) {
        if (word.isEmpty()) {
            return partialSubsequence;
        } else {
            return subsequencesAfter(partialSubsequence, word.substring(1))
                    + ","
                    + subsequencesAfter(partialSubsequence + word.charAt(0),
                            word.substring(1));
        }
    }
}