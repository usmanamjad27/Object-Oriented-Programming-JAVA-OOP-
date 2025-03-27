//Lab Task 1
//Create a class named Movie that can be used with your video rental business. The Movie class should
//track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number,
//and movie title with appropriate accessor and mutator methods. Also create an equals() method that
//overrides Object ’s equals() method, where two movies are equal if their ID number is identical. Next,
//create three additional classes named Action , Comedy , and Drama that are derived from Movie .
//Finally, create an overridden method named calcLateFees that takes as input the number of days a movie
//is late and returns the late fee for that movie. The default late fee is $2/day. Action movies have a late fee
//of $3/day, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main method.

public class T1_Main {
    public static void main(String[] args) {
        T1_Drama obj1 = new T1_Drama("Love Bites", "9.8", 12);
        T1_Drama obj2 = new T1_Drama("Your Dream Doctor", "8.7", 20);
        T1_Comedy objj1 = new T1_Comedy("Manji bistray", "7.6", 45);
        T1_Comedy objj2 = new T1_Comedy("Ni Ma Sas Kutni ", "9.9", 48);
        T1_Action ob1 = new T1_Action("Metal City", "7.9", 89);
        T1_Action ob2 = new T1_Action("Money Heist", "8.8", 78);

//       If we want to change fee so we use setter and getter
        obj1.setLatefee(10);
        obj1.getLatefee();
        obj2.setLatefee(6.8);
        obj2.getLatefee();
        objj1.setLatefee(8);
        objj1.getLatefee();
        objj2.setLatefee(11.5);
        objj2.getLatefee();
        ob1.setLatefee(6);
        ob1.getLatefee();
        ob1.setLatefee(6);
        ob1.getLatefee();
        ob2.setLatefee(15);
        ob2.getLatefee();

        // display function and calculate total fee
        obj1.display();
        obj1.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        obj2.display();
        obj2.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        objj1.display();
        objj1.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        objj2.display();
        objj2.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        ob1.display();
        ob1.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        ob2.display();
        ob2.calclatefee();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();


    }
}