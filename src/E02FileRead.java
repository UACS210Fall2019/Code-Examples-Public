import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Steps in Eclipse demo
    (1) Create E02FileRead project and class.  (done already, how?)
    (2) Print out args[0] and experience that exception
    (3) Pass in file.in to command line
    (4) Scanner input = new Scanner(new File(args[0]));
    (5) Deal with compile time errors
        (a) Imports
        (b) Try { } catch (Exception ex) { ex.printStackTrace(); }
    (6) Now run and see file not found exception
    (7) Then create file.in
    (8) Loop that prints out all lines in the file: hasNextLine(), nextLine()
        ==> Activity: have students try to write loop in group
 */
public class E02FileRead {

    public static void main(String[] args) {
        Scanner input = null;

        try {
            input = new Scanner(new File("infile"));
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
