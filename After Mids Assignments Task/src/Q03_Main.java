
//Question 1:
//Create an abstract class “Person”, with data member “name”. Create set and get methods, and an abstract
//Boolean method “isOutstanding()”. Derive two classes Student and Professor. Student class has data member
//        CGPA. Professor Class has data member numberOfPublications. Provide setters and getters and implementation
//of abstract function in both classes. In student class isOutstanding() will return true if CGPA is greater than 3.5.
//In the Professor class isOutstanding() will return true, if numberOfPublications&gt; 50. In the main class create an
//        array of Person class and call isOutstanding() function for student and professor. isOutstanding() for professor
//should be called after setting the publication count to 100.

public class Q03_Main {
    public static void main(String[] args) {

        Q03_Person [] Person = {
                new Q03_Student("Usman",3.45),
                new Q03_Student("Ahmad",3.76),
                new Q03_Professor("Ali",34),
                new Q03_Professor("Hassan",53)
        };

        for (Q03_Person person :Person){
            System.out.println("Is Outstanding  "+person.isOutstanding());
            person.display();
            System.out.println("--------------");

        }

    }
}
