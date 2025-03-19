/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */

    //The following example shows the declaration of class Rectangle. It has two data members that
//represent the length and width of rectangle. The method calculateArea will return the area of
//rectangle. The runner class will create an object of Rectangle class and area function will be called.

public class Rectangle {
    int height;
    int width;



    public int calculateArea(){
      return   height*width;
    }

    public Rectangle(){
        height = 5;
        width = 5;

        System.out.println("Data members are initialized in default constructor");
    }
    public Rectangle(int a, int b){
        this.height = 5;
        this.width = 5;
        System.out.println("Data members are initialized in default constructor");
    }
}

    
