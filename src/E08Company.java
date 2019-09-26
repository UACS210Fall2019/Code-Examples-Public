public class E08Company {

    public static void main(String[] args) {
        Salesperson empl = new Salesperson("Susan", 60000, 20000, 0.1,
                Salesperson.State.TX);
        Salesperson empl1 = new Salesperson("Arjun", 60000, 30000, 0.1,
                Salesperson.State.TX);
        System.out.println(empl.getTerritory().equals(empl1.getTerritory()));
        // Salesperson empl2 = new Salesperson("Susan", 60000, 20000, 0.1);
        // System.out.println(empl.equals(empl2));
        // Salesperson tyler = new Salesperson("Tyler", 50000, 10000, 0.1);
        // System.out.println(tyler.getSalary());
        // System.out.println(tyler.getSalesPitch());
        //
        // Employee clark = new Salesperson("Clark", 50000, 20000, 0.1);
        // System.out.println(clark.getSalary());
        // The below is commented out due to a compiler error.
        // System.out.println(clark.getSalesPitch());
        //
        // Salesperson tyler = new Salesperson("Tyler", 50000, 10000, 0.1);
        //
        // System.out.println(tyler.getSalary());

        /* Example of polymorphism */
        // Employee susan = new Salesperson("Susan", 60000, 10000, 0.1);
        // The below gives a compiler error.
        // susan.getSalesPitch();
        /*
         * Note how this calls the getSalary instance method from the
         * Salesperson class even though the declared type of susan is
         * Employee
         */
        // System.out.println(susan.getSalary());
        //
        // Employee arjun = new Employee("Arjun", 20);
        //
        // System.out.println(tyler instanceof Employee);
        // System.out.println(tyler instanceof Salesperson);
        //
        // System.out.println(susan instanceof Employee);
        // System.out.println(susan instanceof Salesperson);
        //
        // System.out.println(arjun instanceof Employee);
        // System.out.println(arjun instanceof Salesperson);
        // System.out.println(arjun instanceof Object);

    }

}
