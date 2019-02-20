
public class Employee {

    /* Note these instance variables are private */
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /* Instance method that is overridden in Salesperson class */
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " earns a salary of " + salary;
    }

    /* Static method that is hidden in Salesperson class */
    public static void example() {
        System.out.println("Employee Class");
    }

}
