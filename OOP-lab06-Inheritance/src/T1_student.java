public class T1_student extends T1_Person {
    private String status;

    public T1_student(String name, String address, String phone, String email_address, String status) {
        super(name, address, phone, email_address);
        this.status = status;
    }

    @Override
    public void display() {
        System.out.println("Student details : ");
        super.display();
        System.out.println("Academic status of this student is "+status);
    }

    public String getStatus() {
        return status;
    }
}
