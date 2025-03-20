public class T1_Staff extends T1_Employee {
    private  String title;

    public T1_Staff(String name, String address, String phone, String email_address, String office, String date_hired, int salary, String title) {
        super(name, address, phone, email_address, office, date_hired, salary);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title : "+title);
    }

    public String getTitle() {
        return title;
    }
}
