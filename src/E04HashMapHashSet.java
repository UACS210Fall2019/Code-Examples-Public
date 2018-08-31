import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class E04HashMapHashSet {

    public static void main(String[] args) {
        Map<String, HashSet<String>> movieCharacters = new HashMap<String, HashSet<String>>();

        HashSet<String> characters = new HashSet<String>();
        characters.add("Wesley");
        characters.add("ButterCup");
        characters.add("Fesik");
        movieCharacters.put("Princess Bride", characters);

        characters.add("Humperdink");

        for (String name : movieCharacters.get("Princess Bride")) {
            System.out.println(name);
        }

        System.out.println("==========\nAnother list");
        ArrayList<String> characterList = new ArrayList<String>(characters);
        Collections.sort(characterList);
        for (String name : characterList) {
            System.out.println(name);
        }

    }

}
