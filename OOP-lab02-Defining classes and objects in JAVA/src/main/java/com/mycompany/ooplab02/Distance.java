/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */

    //      Q:
//            Create a class-Distance with two constructor(no arguments , and two arguments), two data members (feet
//        and inches ). Also create a display function which display all data members.


public class Distance {

    double feet;
    double inches;

    public Distance(){
        feet = 12;
        inches = 43.5;
//        System.out.println("Feet are " +feet+" Inches are " + inches);

    }

    public Distance(double feet , double inches){
        this.feet = feet;
        this.inches = inches;
        System.out.println("Feet are " +feet+" Inches are " + inches);

    }
    public void resultDisplay(){
        System.out.println(" The object has approximately height of "+feet + " feet and "+inches+" inches.");
    }
}

    

