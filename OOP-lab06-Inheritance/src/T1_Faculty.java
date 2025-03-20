public class T1_Faculty extends T1_Employee {
    private int office_hours , rank ;

    public T1_Faculty(String name, String address, String phone, String email_address, String office, String date_hired, int salary, int office_hours, int rank) {
        super(name, address, phone, email_address, office, date_hired, salary);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The employee office hours are "+office_hours+"\nAnd rank is "+rank);
    }

    public int getOffice_hours() {
        return office_hours;
    }

    public int getRank() {
        return rank;
    }
}
