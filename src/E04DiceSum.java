import java.util.ArrayList;
import java.util.List;

public class E04DiceSum {

    public static void main(String[] args) {
        diceSum(3, 7);
    }

    public static void diceSum(int numDie, int desiredSum) {
        List<Integer> chosen = new ArrayList<Integer>();
        diceSumHelper(numDie, desiredSum, chosen);
    }

    public static void diceSumHelper(int numDie, int desiredSum,
            List<Integer> chosen) {

        if (numDie == 0 && desiredSum == 0) {
            System.out.println(chosen);
        } else if (numDie != 0 && numDie <= desiredSum
                && desiredSum <= numDie * 6) {
            for (int i = 1; i <= 6; i++) {
                // choose
                chosen.add(i);

                // explore
                diceSumHelper(numDie - 1, desiredSum - i, chosen);

                // unchoose
                chosen.remove(chosen.size() - 1);
            }
        }
    }
}
