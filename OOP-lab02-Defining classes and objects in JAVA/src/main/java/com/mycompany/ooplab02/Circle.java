/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */
    //Create a class circle class with radius as data member. Create two constructors (no argument, and two
//arguments) and a method to calculate Circumference.

public class Circle {

    double pi;
    int radius;

    //    Create method to calculate circumference
    public double calculateCircumference(){
        return 2*pi*radius;
    }

    //  Create a constructor with no arguments (default constructor)
    public Circle(){
        pi = 3.14;
        radius = 25;
        System.out.println("The circumference of a circle is " + calculateCircumference());
    }

    // Create a constructor with two Arguments (Permitted constructor)
    public Circle(double pi , int radius){
        this.pi = pi;
        this.radius = radius;
//        System.out.println("The circumference of a circle is " + calculateCircumference());

    }

}



    

