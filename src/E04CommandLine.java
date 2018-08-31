
public class E04CommandLine {

    public static void main(String[] whatever) {
        System.out.println("Command line arguments");
        for (int i = 0; i < whatever.length; i++) {
            System.out.println("args[" + i + "] = " + whatever[i]);
        }

    }

}
