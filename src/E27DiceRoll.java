import java.util.ArrayList;
import java.util.List;

public class E27DiceRoll {

    public static void main(String[] args) {
        diceRoll(2);
    }

    private static void diceRoll(int numDie) {
        diceRollHelper(numDie, new ArrayList<Integer>());
    }

    private static void diceRollHelper(int numDie, List<Integer> soFar) {
        // Base Case
        if (numDie == 0) {
            System.out.println(soFar);
        } else {
            for (int i = 1; i <= 6; i++) {
                // Choose
                soFar.add(i);
                // Explore
                diceRollHelper(numDie - 1, soFar);
                // Unchoose
                // Try removing the below line and see what happens.
                // Can you understand why?
                soFar.remove(soFar.size() - 1);
            }
        }
    }


}
