/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooplab02;
  import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class OOPlab02 {

    
      


    public static void main(String[] args) {
//        Rectangle rect_obj = new Rectangle();
//
//       int area = rect_obj.calculateArea();
//
//        System.out.println("The area of rectangle is  "+area);
//-----------------------------------------------------------------------------------------------

//      Q:
//      Create a class Account class with balance as data member. Create two constructors (no argument, and
//               two arguments) and methods to withdraw and deposit balance.
//
//        Runner class:--

//        Account zahra_account = new Account();
//        //zahra_account.displayBalance();
//
//         zahra_account.depositBalance();
//        zahra_account.withdrawBalance();
//        zahra_account.displayBalance();

        Scanner scanner = new Scanner(System.in);
        Accounts zahra_account = new Accounts();
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    zahra_account.depositBalance();
                    zahra_account.displayBalance();
                    break;
                case 2:
                    zahra_account.withdrawBalance();
                    zahra_account.displayBalance();
                    break;
                case 3:
                    zahra_account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;  // Exit the main method
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }


//-------------------------------------------------------------------------------------------------------
//     Q:
//     Write a class Marks with three data members to store three marks. Create two constructors and a method
//        to calculate and return the sum.

//        this can b write as same when we use default constructor

//Marks usman_obj = new Marks();
//usman_obj.display();
// ---------------------------------------------------------------------------------------------------------

//        Q:
//        Create a class circle class with radius as data member. Create two constructors (no argument, and two
//                arguments) and a method to calculate Circumference.

        //        Radius cir_obj = new Radius();
//         solve by calling method
//        cir_obj.pi = 3.14;
//        cir_obj.radius = 25;
//        double result = cir_obj.calculateCircumference();
//        System.out.println("The circumference of a circle is " + result);

        // call a constructor with no arguments
//        Circle cir_obj = new Circle();
//       System.out.println("the area of default constructor is"+cir_obj.calculateCircumference());
//        // call a constructor with two arguments
//        Circle cir1_obj =   new Circle(3.14,25);
//        System.out.println("the area of parameterized constructor is "+cir1_obj.calculateCircumference());
//        -----------------------------------------------------------------------------------------------------------

  //      Q:
//            Create a class-Distance with two constructor(no arguments , and two arguments), two data members (feet
//        and inches ). Also create a display function which display all data members.

//          Method to display results by using both constructors and methods
//
//       1-method Distance dis_obj = new Distance();
//
//        2-method Distance dis_obj = new Distance();
//
//        3-method Distance dis_obj = new Distance();
//        dis_obj.resultDisplay();

 //------------------------------------------------------------------------------------------------------------------

  //Q:
    //Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set
    //valid time. Also create display function which display all data members
//        Class time  time_obj = new Class time();
//       Class_time time_obj = new Class_time(23,46,56);
//        time_obj.displayFunction();
    }
}
