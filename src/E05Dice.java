import java.util.ArrayList;
import java.util.List;

// CSC 210
// Lecture 5

// Prints out all the possible combinations of outcomes from rolling two
// dice

public class E06Dice {
	public static void main(String[] args) {
		rollDice(2, new ArrayList<Integer>());
	}
	
	// takes a number of dice to roll and a list of previous roll results 
	// as parameters and prints out all the possible combinations of numbers
	// that can appear on the dice
	public static void rollDice(int dice, List<Integer> choices) {
		if (dice == 0) {
			System.out.println(choices);
		} else {
			for(int i = 1; i <= 6; i++) {
				choices.add(i);
				rollDice(dice - 1, choices);
				choices.remove(choices.size() -1);
			}
		}
	}
}
