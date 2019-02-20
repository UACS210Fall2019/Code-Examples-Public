
public class Salesperson extends Employee {

    private double salesAmount;
    private double commission;

    public Salesperson(String name, double salary, double salesAmount,
            double commission) {
        /*
         * Calls the constructor of the superclass
         * Note this is necessary since we don't have access
         * to the private variables in the superclass.
         */
        super(name, salary);

        this.salesAmount = salesAmount;
        this.commission = commission;
    }

    /* Overrides getSalary() from superclass */
    public double getSalary() {
        return super.getSalary() + salesAmount * commission;
    }

    /* Hides Employee.example() */
    public static void example() {
        System.out.println("Salesperson Class");
    }
}
