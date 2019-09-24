
public class E09VisibilityMain {

    public static void main(String[] args) {
        System.out.println(new E09B().toString());

        E09A.foo();
        E09B.foo();
        E09A.bar();
        E09B.bar();
    }

}
