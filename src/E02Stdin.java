
import java.util.Scanner;

public class E02Stdin {

    public static void main(String[] args) {
        /*
         * These come from the command-line arguments. To change these,
         * in your top menu bar, click 'Run'->'Run Configurations...'
         * Then a new box will pop up. Click on the 'arguments' tab.
         * Then in the first box, under 'Program Arguments:' type in
         * whichever arguments you would like.
         */
        System.out.println(args[0]);
        System.out.println(args[1]);

        /*
         * The below scanner object allows us to read in from the user since
         * we created a new Scanner and passed in 'System.in'
         */
        Scanner userInput = new Scanner(System.in);

        // Prints to the console asking the user for a file name.
        System.out.println("File name? ");
        // Reads in whatever the user types next.
        String fileName = userInput.next();
        // Prints what fileName the user typed in.
        System.out.println("filename = " + fileName);

        // Prints to the console to ask for another file name.
        System.out.println("Second file name? ");
        // Reads in whatever the user types in next
        fileName = userInput.next();
        // Prints out the second file name read in
        System.out.println("filename2 = " + fileName);

        // Don't forget to close all Scanners!
        userInput.close();
   }

}