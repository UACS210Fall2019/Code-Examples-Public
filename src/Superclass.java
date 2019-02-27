
public class Superclass {

    private int number;

    /*
     * Java automatically provides a default, zero argument
     * constructor. However, if we create a different constructor
     * with arguments, the class no longer has a default, zero
     * argument constructor. This means that any subclass must
     * call a constructor that we defined (since there is no
     * zero argument constructor).
     */
    public Superclass(int number) {
        this.number = number;
    }

}
