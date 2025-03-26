//Lab Task 1
//        (The Person, Student, Employee, Faculty, and Staff classes)
//Design a class named Person and its two subclasses named Student and Employee. Design two more
//        classes; Faculty and Staff and extend them from Employee. The detail of classes is as under:
//A person has a name, address, phone number, and email address.
//A student has a status (String)
//An employee has an office, salary, and date hired. Use the Date class to create an object for date hired.
//A faculty member has office hours and a rank.
//A staff member has a title.
//Create display method in each class

public class T1_Main {
    public static void main(String[] args) {
        T1_Employee empUsman = new T1_Employee("Usman Amjad","B 652 /- Pakpattan","+92 326 1131932 ","usmanamjad270704@gmail.com","Comsats Institue of Information Technology","12 Feb 2024",127500);
        T1_student stUsman = new T1_student("Usman Amjad","B 652 /- Pakpattan","+92 326 1131932","meusmanamjad@gmail.com","Active");
        T1_Staff staffUsman = new T1_Staff("Usman amjad","B62 /- Pakpattan","+923261131932","Usmanamjad270704@gmail.com","Comsats Institute Information technology","13 Feb 2024",25400,"Bus Driver ");
        T1_Faculty facUsman = new T1_Faculty("Usman amjad","B62 /- Pakpattan","+923261131932","Usmanamjad270704@gmail.com","Comsats Institute Information technology","13 Feb 2024",25400,8,12);
        empUsman.display();
        stUsman.display();
        staffUsman.display();
        facUsman.display();
    }
}
