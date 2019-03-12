import java.util.ArrayList;

public class E16Generics {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("Nice to meet you");

        String first = list.get(0);
    }

}
