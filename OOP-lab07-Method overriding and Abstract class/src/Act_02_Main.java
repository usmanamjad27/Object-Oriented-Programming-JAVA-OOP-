
//The following activity explains the use of overriding for customizing the method of super class. The
//classes below include a CommisionEmployee class that has attributes of firstname, lastName, SSN,
//        grossSales, CommisionRate. It has a constructor to initialize, set and get functions, and a function to
//display data members. The other class BasePlusCommisionEmployee is inherited from
//        CommisionEmployee. It has additional attributes of Salary. It also has set and get functions and
//display function. The Earning method is overridden in this example.

public class Act_02_Main {
    public static void main(String[] args) {
        Act_02_BasePluscommisionEmployee obj = new Act_02_BasePluscommisionEmployee("Usman","Amjad","Manager","10% increase",15,1500);
        obj.display();
        obj.earning();
    }
}
