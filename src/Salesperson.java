
public class Salesperson extends Employee {

    public enum State {
        AZ, CA, TX, UT, CO
    }

    private double salesAmount;
    private double commission;
    private State state = State.AZ;

    public Salesperson(String name, double salary, double salesAmount,
            double commission) {
        super(name, salary);
        this.salesAmount = salesAmount;
        this.commission = commission;
    }

    public Salesperson(String name, double salary, double salesAmount,
            double commission, State state) {
        this(name, salary, salesAmount, commission);
        this.state = state;
    }

    public State getTerritory() {
        return this.state;
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
