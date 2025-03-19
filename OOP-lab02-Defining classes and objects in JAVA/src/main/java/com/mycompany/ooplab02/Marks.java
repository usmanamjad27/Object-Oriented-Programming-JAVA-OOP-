/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */
//Write a class Marks with three data members to store three marks. Create two constructors and a method
//to calculate and return the sum.


public class Marks {
    int eng;
    int urdu;
    int math;
// Default constructor
    public Marks(){
        eng=78;
        math=77;
        urdu=87;

    }
    // Perimeter constructor
    public Marks(int a, int b, int c){
        this.eng = a;
        this.urdu = b;
        this.math = c;
        System.out.println("This is your obtained marks of three subjects "+result());

    }
//    Method for doing operation
  public int result(){
        return eng+urdu+math;
  }
  public void display(){
        System.out.println("This is your obtained marks of three subjects "+result());
    }
}


