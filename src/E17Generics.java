import java.util.ArrayList;

public class E17Generics {

    public static void main(String[] args) {

        // 1. Annoying Casting
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("CS210");
        String str = (String) list.get(1);

        // 2. Not type safe
        list.add(67);
        // The below line would cause a classCastException
        // String strTwo = (String) list.get(2);

    }

}
