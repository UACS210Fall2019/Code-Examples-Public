
public class E07Fruit {

    public static void main(String[] args) {
        // Note how snack is declared as a 'Fruit' type.
        Fruit snack = new Berries(3);
        Apple secondSnack = new Apple("red");

        // Example of implicit call to toString()
        System.out.println("snack = " + snack.toString());
        System.out.println("secondSnack = " + secondSnack);

        // overloading example
        secondSnack.makeSauce();
        secondSnack.makeSauce(3);

    }

}
