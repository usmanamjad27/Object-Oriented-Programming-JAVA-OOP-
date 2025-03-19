/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Dell
 */

/*Q:
The following example shows the declaration of class Circle. It has one data members radius. The
data member is declared private and access is provided by declaring set and get methods.*/

public class Circle {

    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;

    }


    public int getRadius() {
        return radius;
    }
    public void display(){
        System.out.println("The radius of the circle is  "+ radius);
        System.out.println("The circumferences of  Circle is "+ calculateCircumferneces());
    }
    public double calculateCircumferneces(){
        return 3.14*radius*radius;

    }
}

