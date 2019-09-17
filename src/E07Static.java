/*
 * A class demonstrating the use of a static variable.
 */
public class E07Static {

    private int instanceInt;
    private static int staticInt;

    public E07Static(int instanceInt) {
        this.instanceInt = instanceInt;
        staticInt = instanceInt;
    }

    public void incrementInstanceInt() {
        instanceInt++;
    }

    public void incrementStaticInt() {
        staticInt++;
    }

    public String toString() {
        return "instanceInt: " + instanceInt + " staticInt: " + staticInt;
    }
}
