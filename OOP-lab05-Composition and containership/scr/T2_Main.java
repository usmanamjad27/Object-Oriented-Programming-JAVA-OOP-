//Create a class Book that contains an author of type Person (Note: Use the Person class created in the
//        first exercise). Other data members are bookName and publisher. Modify the address of the author in
//runner class.

public class T2_Main {
    public static void main(String[] args) {
        T1_Address usman = new T1_Address("F 14/- 5 no street","34","Pakpattan",57400);
        T1_Person Usman = new T1_Person("Usman Amjad",usman);

        T2_Book obj = new T2_Book(Usman,"Fundamentals of Human nature and thing that effect","Orhan");
        System.out.println(Usman);
      obj.display();
    }
}
