import java.util.ArrayList;
import java.util.List;

public class E27DiceSum {

    public static void main(String[] args) {
        diceSum(3, 5);
    }

    private static void diceSum(int numDie, int sum) {
        diceSumHelper(numDie, sum, new ArrayList<Integer>());
    }

    private static void diceSumHelper(int numDie, int sum,
            List<Integer> soFar) {
        // Base Case
        if (numDie == 0) {
            if (sum == 0) {
                System.out.println(soFar);
            }
        } else if (numDie * 1 <= sum && sum <= numDie * 6) {
            for (int i = 1; i <= 6; i++) {
                // Choose
                soFar.add(i);
                // Explore
                diceSumHelper(numDie - 1, sum - i, soFar);
                // Unchoose
                soFar.remove(soFar.size() - 1);
            }
        }
    }


}
