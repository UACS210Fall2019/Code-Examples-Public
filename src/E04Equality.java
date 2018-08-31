
public class E04Equality {

    public static void main(String[] args) {

        String s1 = "hi";
        String s2 = "h";
        s2 += "i";

        System.out.println("s1==s2 is " + (s1 == s2));
        System.out.println("s1.equals(s2) is " + s1.equals(s2));
    }

}
