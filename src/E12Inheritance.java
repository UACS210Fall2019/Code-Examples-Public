
public class E12Inheritance {

    public static void main(String[] args) {
        Salesperson tyler = new Salesperson("Tyler", 50000, 10000, 0.1);
        tyler.uniqueMethod();

        System.out.println(tyler.getSalary());

        /* Example of polymorphism */
        Employee susan = new Salesperson("Susan", 60000, 10000, 0.1);
        // The below gives a compiler error.
        // susan.uniqueMethod();

        /*
         * Note how this calls the getSalary instance method from the
         * Salesperson
         * class even though the declared type of susan is Employee
         */
        System.out.println(susan.getSalary());

        Employee.example();
        Salesperson.example();

        Employee clark = new Employee("Clark", 20);

        System.out.println(susan instanceof Employee);
        System.out.println(susan instanceof Salesperson);
        System.out.println(clark instanceof Employee);
        System.out.println(clark instanceof Salesperson);
        System.out.println(clark instanceof Object);
    }

}
