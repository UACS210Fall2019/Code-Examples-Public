
public class E09A {
    public int field1;
    protected int field2;
    private int field3;

    public String toString() {
        String retval = "class A:";
        retval += " field1 = " + field1;
        retval += " field2 = " + field2;
        retval += " field3 = " + field3;
        return retval;
    }

    public static void foo() {
        System.out.println("foo defined in class A");
    }

    public static void bar() {
        System.out.println("bar defined in class A");
    }

}
