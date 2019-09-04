
/*
 * An example demonstrating the use of maps and sets.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class E03HashMapHashSet {

    public static void main(String[] args) {
        Map<String, Set<String>> friends = createFriendMap(
                "TestCases/friendList");

        System.out.println(friends);

        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.println("Enter first friend's name");
            String first = userInput.next();
            System.out.println("Enter second friend's name");
            String second = userInput.next();
            if (first.equals("") || second.equals("")) {
                break;
            }

            Set<String> firstFriends = friends.get(first);
            firstFriends.retainAll(friends.get(second));
            System.out.println(firstFriends);

        }
        userInput.close();
    }

    /*
     * Creates and returns a map from a person to the set of friends for that
     * person.
     */
    private static Map<String, Set<String>> createFriendMap(String filename) {
        Map<String, Set<String>> friendMap = new HashMap<String, Set<String>>();

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String key = fileScanner.nextLine();
        while (fileScanner.hasNext()) {
            String friend = fileScanner.nextLine();
            if (friend.equals("") && fileScanner.hasNext()) {
                key = fileScanner.nextLine();
            } else {

                if (friendMap.containsKey(key)) {
                    friendMap.get(key).add(friend);
                } else {
                    Set<String> set = new HashSet<String>();
                    set.add(friend);
                    friendMap.put(key, set);
                }

            }
        }
        fileScanner.close();
        return friendMap;
    }

}
