
public class E08Fruit {

    public static void main(String[] args) {
        Fruit snack = new Berries(3);
        Apple secondSnack = new Apple("red");

        // Example of implicit call to toString()
        System.out.println("snack = " + snack);
        System.out.println("secondSnack = " + secondSnack);

        // overloading example
        secondSnack.makeSauce();
        secondSnack.makeSauce(3);

    }

}
