
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

    public static String getCompanyMotto() {
        return "We are salespersons of this company.";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Salesperson)) {
            return false;
        }
        Salesperson other = (Salesperson) o;
        return super.equals(o)
                && other.salesAmount == this.salesAmount
                && other.commission == commission;
    }

}
