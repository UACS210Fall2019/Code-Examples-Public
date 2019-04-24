import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionPractice {
	
	public static void main(String[] args) {

        // Multiple catch blocks
        // Use of a finally block
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(args[0]));

            while (scanner.hasNextInt()) {
                int result = 6 / scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + args[0]);
        } catch (ArithmeticException e) {
            System.out.println("Entered 0, cannot divide by zero.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // Try with resources
        try (Scanner input = new Scanner(new File(args[0]))) {
            // Use input here.
        } catch (FileNotFoundException e) {
            // Catch exceptions here.
        }
        // Automatically cleaned up.

	}
	
    /*
     * Try using this function in main. Since this function throws an exception,
     * you need to catch or throw that exception whereever you call this
     * function.
     */
	private static void openFile(String filename) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
	}

} 
