public class T1_Person {
   private String name;
    private T1_Address address;


    public T1_Person(String name, T1_Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T1_Address getAddress() {
        return address;
    }

    public void setAddress(T1_Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person: " + name + "\n" + address.toString();
    }

}
