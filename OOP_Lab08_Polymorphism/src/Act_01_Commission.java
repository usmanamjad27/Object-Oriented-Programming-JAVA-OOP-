public class Act_01_Commission extends Act_01_Employee {
    private double grossSales , commissionRate;

    public Act_01_Commission(String fName, String lName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(fName, lName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earning() {
        return commissionRate * grossSales;
    }
}
