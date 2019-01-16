import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class E02FileRead {

    public static void main(String[] args) {
        Scanner input = null;

        try {
            input = new Scanner(new File("TestCases/InputTest01"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String str = input.nextLine();
        System.out.println(str);

        // str = input.nextLine();
        // System.out.println(str);

        input.close();
    }

}
