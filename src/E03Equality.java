/* 
 * A dumb example to demonstrate the importance of using .equals()
 * with objects and strings.
 */
public class E03Equality {

    public static void main(String[] args) {

        String s1 = "hi";
        String s2 = "h";
        s2 += "i";

        // Note this will print false!
        System.out.println("s1==s2 is " + (s1 == s2));

        // This will print true.
        System.out.println("s1.equals(s2) is " + s1.equals(s2));
    }

}