/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */
//The following example shows the declaration of class Point. It has two data members that represent
//the x and y coordinate. Create two constructors and a function to move the point. The runner class
//will create an object of Point class and move function will be called.

public class Point {

    private int x;
    private int y;

    public Point(){
        x = 1;
        y = 2;
    }
    // parameterized constructor
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
    public void display(){
       System.out.println(" The X coordinates are "+ x+" and the y coordinates are "+y);
    }

    public void setX(int a){
        this.x= a;
    }
    public void setY(int b){
        this.y=b;
    }


}

