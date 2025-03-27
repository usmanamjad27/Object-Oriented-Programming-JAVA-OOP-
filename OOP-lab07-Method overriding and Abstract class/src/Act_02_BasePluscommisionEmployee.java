public class Act_02_BasePluscommisionEmployee extends Act_02CommissionEmployee {
    private int salary ;

    public Act_02_BasePluscommisionEmployee(String fName, String lName, String SSN, String grossSale, double commissionRate, int salary) {
        super(fName, lName, SSN, grossSale, commissionRate);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Your salary is $"+salary);
    }

    @Override
    public double earning() {
        double totalSalary = (super.earning() * salary )+salary;
        System.out.println("Your total salary with " + getCommissionRate() + "% commission is: $" + totalSalary);
        return totalSalary;
    }}