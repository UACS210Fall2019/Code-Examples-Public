import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E06ReverseLines {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("TestCases/InputTest01"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        reverseLines(scanner);
        scanner.close();
    }

    /*
     * This function takes in a scanner and prints the lines
     * in reverse order.
     */
    public static void reverseLines(Scanner scanner) {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Recursive leap of faith. Take that jump!
            reverseLines(scanner);
            System.out.println(line);
        }
    }

}
