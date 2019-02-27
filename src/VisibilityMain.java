public class VisibilityMain {
    public static void main(String[] args) {
        // instance variable visibility
        System.out.println(new B().toString());

        // Call some static methods
        A.foo();
        B.foo();
        A.bar();
        B.bar();
    }
}
