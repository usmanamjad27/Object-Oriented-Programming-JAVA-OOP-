public class Act_01_Person {
    protected String name , id ;
    protected  int phone ;

    Act_01_Person(){
      name = "Usman";
      id = "369718-917910898-8";
      phone = 04 ;
    }

    public Act_01_Person(String name, String id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void display(){
        System.out.println("The name of person is "+name);
        System.out.println("The id/roll no of the person is "+id);
        System.out.println("The phone of "+name+" is "+phone);
    }

}
