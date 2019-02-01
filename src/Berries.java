/*
 * This class does have a toString method.
 * Look at what happens when you try to print out
 * an instance of the class.
 */
// 'extends' shows that Berries inherits from its superclass Fruit.
public class Berries extends Fruit {

    public Berries(int numBerries) {
        // Instance variables are initialized inside of the constructor.
        this.numBerries = numBerries;
    }

    public String toString() {
        return "We are berries";
    }

    // Instance variables need to be declared outside of any methods.
    private int numBerries;
}
