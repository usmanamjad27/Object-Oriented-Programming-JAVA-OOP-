public class Activity_01_Manager {
    private String title;
    private double dues;
    private Activity_01_Employee emp;
    private Activity_01_studentRecord stu;

    public Activity_01_Manager(String t, double d,
                               Activity_01_Employee e, Activity_01_studentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }

    public void display() {
        System.out.println("Title is : " +
                title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:");
        System.out.println("EmployeeId is : " +
                emp.getEmp_id());
        System.out.println("EmployeeId is : " +
                emp.getSalary());
        System.out.println("Student record is as under: ");
        System.out.println("Degree is : "+ stu.getDegree());
    }
}
