public class T1_Employee extends T1_Person{
    private String office , date_hired;
    private int salary;

    public T1_Employee(String name, String address, String phone, String email_address, String office, String date_hired, int salary) {
        super(name, address, phone, email_address);
        this.office = office;
        this.date_hired = date_hired;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee details : ");
        super.display();
        System.out.println(" The Company name is "+office+"\nThe date on which employee hired is "+date_hired+"\n And his/him salary is "+salary);

    }

    public String getOffice() {
        return office;
    }

    public String getDate_hired() {
        return date_hired;
    }

    public int getSalary() {
        return salary;
    }
}
