
//Static imports
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleArea {

    public static double radius = 4.2;

    public static void main(String[] args) {
        // No import for Scanner. Just using full name here.
        java.util.Scanner in = new java.util.Scanner(System.in);

        // Note that you don't need to call Math.PI, you can just use PI
        double area = PI * pow(radius, 2);

        System.out.println(area);

        someFunction();
    }

    private static void someFunction() {
        anotherFunction();
    }

    /*
     * When running this code look at the call stack produced when this
     * exception is thrown.
     */
    private static void anotherFunction() {
        int x = 6 / 0;
    }

}
