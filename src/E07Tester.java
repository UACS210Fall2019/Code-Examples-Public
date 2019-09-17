/*
 * A class used to test our E07Static class.
 * Play around with this and E07Static to see the behavior of
 * static variables.
 */
public class E07Tester {

    public static void main(String[] args) {
        E07Static first = new E07Static(10);
        System.out.println(first);

        first.incrementInstanceInt();
        first.incrementStaticInt();

        E07Static second = new E07Static(5);

        second.incrementStaticInt();

        System.out.println(first);
        System.out.println(second);
    }

}
