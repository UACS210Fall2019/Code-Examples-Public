import java.util.ArrayList;
import java.util.List;

public class E03RefvsValue {

    public static void main(String[] args) {
        Integer x = 67;
        foo(x);
        System.out.println("x = " + x);

        List<Integer> list = new ArrayList<>();
        list.add(7);
        System.out.println("list = " + list);
        bar(list);
        System.out.println("list after bar call = " + list);
    }

    public static void foo(Integer n) {
        n = 42;
    }

    public static void bar(List<Integer> l) {
        l.add(42);
    }
}
