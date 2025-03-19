/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Q:
Create an Encapsulated class Marks with three data members to store three marks. Create set and get
methods for all data members. Test the class in runner */

public class Marks {

    private int marks1 , marks2 , marks3;
    public String name;

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    // for name using parimetrized constructor;
    public Marks(String name){
        this.name = name;
        System.out.println("The marks of "+name);
    }
    public void display(){
        System.out.println("Math = "+marks1 );
        System.out.println("Biology = "+marks2 );
        System.out.println("Computer = "+marks3 );
    }
}

