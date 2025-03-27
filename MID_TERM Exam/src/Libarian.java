import java.util.ArrayList;

public class Libarian {
    private String name ;
    private int employeeID;
    private ArrayList<Book> list;

    public Libarian(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String display(){
       return "Librarian Name : "+name +"\nEmployee ID : "+ employeeID;

    }
}
