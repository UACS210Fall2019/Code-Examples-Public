
public class Subclass extends Superclass {

    private String name;

    /*
     * Note that the below constructor gives a compiler error.
     * Since we do not explicitly invoke the superclass constructor
     * with the super() keyword, the superclass constructor with
     * zero arguments will be implicitly called. However there is no
     * zero argument constructor in our superclass, so we get an error.
     */
    public Subclass(String name) {
        this.name = name;
    }

}
