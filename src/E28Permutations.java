import java.util.ArrayList;
import java.util.List;

public class E28Permutations {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<Character>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printPermutations(chars);
    }

    private static void printPermutations(List<Character> chars) {
        permutationsHelper(chars, new ArrayList<Character>());
    }

    private static void permutationsHelper(List<Character> chars,
            List<Character> soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            // Going through all possible choices
            for (int i = 0; i < chars.size(); i++) {
                // choose
                Character choice = chars.get(i);
                chars.remove(choice);
                soFar.add(choice);

                // explore
                permutationsHelper(chars, soFar);

                // unchoose
                soFar.remove(choice);
                chars.add(i, choice);
            }
        }
    }


}
