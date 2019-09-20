
public class Salesperson extends Employee {

    private double salesAmount;
    private double commission;

    public Salesperson(String name, double salary, double salesAmount,
            double commission) {
        super(name, salary);
        this.salesAmount = salesAmount;
        this.commission = commission;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + salesAmount * commission;
    }

    public String getSalesPitch() {
        return "Buy buy buy - Nsync";
    }

}
