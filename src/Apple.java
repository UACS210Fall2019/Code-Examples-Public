/*
 * This class does NOT have a toString method.
 * Look at what happens when you try to print out
 * an instance of the class.
 * 
 * This class has two methods with the same name. 
 * However the two methods have different parameters.
 * This is called overloading.
 */
public class Apple extends Fruit {

    public Apple(String kind) {
        this.kind = kind;
    }

    // Overload methods by specifying different parameters.
    public void makeSauce() {
        System.out.println("Made sauce.");
    }
    public void makeSauce(int numCups) {
        System.out.println("Made " + numCups + " cups of sauce");
    }

    private String kind;
}
