public class E16BoxTester {

    public static void main(String[] args) {
        E16GenericBox box = new E16GenericBox("CS210");
        System.out.println(box.getContent());
        System.out.println(box);

        E16GenericBox<Integer> numberBox = new E16GenericBox<Integer>(123);
        System.out.println(numberBox.getContent());
        System.out.println(numberBox);
    }

}
