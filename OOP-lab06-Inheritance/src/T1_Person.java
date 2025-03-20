public class T1_Person {
    protected String name , address , phone , email_address ;

    public T1_Person(String name, String address, String phone, String email_address) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email_address = email_address;
    }

    public void display() {

        System.out.println("Name : "+name+"\nAddress : "+address+"\nPhone No : "+phone+"\n Email Address : "+email_address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail_address() {
        return email_address;
    }
}
