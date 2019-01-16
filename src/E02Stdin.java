
import java.util.Scanner;

public class E02Stdin {

    public static void main(String[] args) {
        System.out.println(args[0]);

        Scanner userInput = new Scanner(System.in);

        System.out.println("File name? ");

        String fileName = userInput.next();
        System.out.println("filename = " + fileName);

        fileName = userInput.next();
        System.out.println("filename2 = " + fileName);

        userInput.close();
   }

}