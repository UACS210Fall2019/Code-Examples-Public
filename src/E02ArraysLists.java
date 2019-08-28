// Lecture 3 in class examples
// Please note that this code is NOT well structured
// as it is several separate examples of the useage of arrays
// and lists.


import java.util.ArrayList;
import java.util.List;

public class E02ArraysLists {
	public static void main(String[] args) {
		// Creates an array of Strings and prints everything in it
		String[] names = {"cat", "dog", "rabbit"};
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Creates a list of Strings and prints everything in it
		List <String> livestock = new ArrayList<String>();
		livestock.add("cat");
		livestock.add("dog");
		livestock.add("rabbit");
		for(int i = 0; i < livestock.size(); i++) {
			System.out.println(livestock.get(i));
		}
		
		// Creates a list of integers and fills it with the
		// numbers 0 - 100. 
		List <Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 101; i++) {
			nums.add(i);
		}

		// example method call
		int[] numbers = {2, 3, 4};
		int theAnswer = hello(numbers, "cat");
	}
	
    // takes an array of integers and a string as parameters
	// returns an integer
	public static int hello(int[] nums, String word) {
		System.out.println(word);
		return 42 + nums[0];
	}	
}
