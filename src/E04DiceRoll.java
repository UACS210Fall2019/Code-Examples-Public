import java.util.ArrayList;
import java.util.List;

public class E04DiceRoll {

    public static void main(String[] args) {
        diceRoll(2);
    }


    public static void diceRoll(int numDie) {
        List<Integer> rolls = new ArrayList<Integer>();
        diceRollHelper(numDie, rolls);
    }


    public static void diceRollHelper(int numDie, List<Integer> chosen) {
        if (numDie == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 1; i <= 6; i++) {
                // choose
                chosen.add(i);

                // explore
                diceRollHelper(numDie - 1, chosen);

                // unchoose
                chosen.remove(chosen.size() - 1);
            }
        }

    }

}
