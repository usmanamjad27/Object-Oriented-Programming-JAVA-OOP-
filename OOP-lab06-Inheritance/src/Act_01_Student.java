public class Act_01_Student extends Act_01_Person{
    private String rollno;
    private int marks;

    public Act_01_Student() {
        // supper is used to call parent class constructor
        super();
        this.rollno = "Sp24-BCS-067";
        this.marks = 576;
    }

    public Act_01_Student(String name, String id, int phone, String rollno, int marks) {
        super(name, id, phone);
        this.rollno = rollno;
        this.marks = marks;
    }

    public String getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

   public void display(){
     super.display();
       System.out.println("Roll : "+rollno+" \n Marks : "+marks);
   }
}
