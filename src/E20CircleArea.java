
/*
 * This file demonstrating that you do not strictly need imports.
 * It also demonstrates static imports.
 */
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class E20CircleArea {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = Double.valueOf(scanner.nextLine());

        // PI * r^2
        double area = PI * pow(radius, 2);

        System.out.println(area);

        scanner.close();
    }

}
