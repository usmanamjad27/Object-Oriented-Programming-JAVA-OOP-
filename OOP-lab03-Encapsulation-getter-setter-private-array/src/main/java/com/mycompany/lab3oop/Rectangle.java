/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Q:
 The following example shows the declaration of class Rectangle. It has two data members that
represent the length and width of rectangle. Both data member are declared private and access is
provided by declaring set and get methods for both data members.*/
public class Rectangle {

    private  int length , width;


    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public  void display(){
        System.out.println(" The length of a rectangle is "+ length);
        System.out.println(" The width of a rectangle is "+ width);
        System.out.println("The area of rectangle is "+calculatearea());
    }
    public int calculatearea(){
        return length*width;
    }


}
