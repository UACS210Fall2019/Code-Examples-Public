
public class Employee extends Object {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " earns a salary of " + salary;
    }

    public static String getCompanyMotto() {
        return "We are employees of this company.";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) o;
        return other.name.equals(this.name) && other.salary == this.salary;
    }

}
