
// In class: what if we comment out this import?
import java.util.Scanner;

public class E02Stdin {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("File name? ");

        String fileName = userInput.next();
        System.out.println("filename = " + fileName);

        fileName = userInput.next();
        System.out.println("filename2 = " + fileName);


        // In class: what is the warning for?
        userInput.close();
   }
}