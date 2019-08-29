
/*
 * This file demonstrates the importance of understanding
 * the differences between passing by reference and passing
 * by value. All primitives are passed by value, all objects
 * are passed by reference.
 */
import java.util.ArrayList;
import java.util.List;

public class E03ReferenceVsValue {

    public static void main(String[] args) {
        /*
         * x is an int. int is a primitive type so it will
         * be passed by value. This means if we pass x to a method
         * we are only going to make a copy of whatever value x has.
         * So if we change that copy, the original value remains
         * unchanged.
         */
        int x = 67;
        foo(x);
        System.out.println("x = " + x);

        /*
         * List is an object (notice that is starts with a capital
         * letter). When we pass an object to another method, instead
         * of making a copy, we pass a reference to the very same list.
         * So any changes made in the 'bar' method will persist after
         * 'bar' returns!
         */
        List<Integer> list = new ArrayList<>();
        list.add(7);
        System.out.println("list = " + list);
        bar(list);
        System.out.println("list after bar call = " + list);
    }

    public static void foo(int x) {
        x = 42;
    }

    public static void bar(List<Integer> list) {
        list.add(42);
    }
}