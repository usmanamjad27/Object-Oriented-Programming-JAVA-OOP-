/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Q:
 Create an Encapsulated class Student with following
characteristics:
Data Members:
String Name
Int [] Result_array[5] // Result array contains the marks for 5 subjects
Methods:
Student ( String, int[]) // argument Constructor
Average () // it calculates and returns the average based on the marks in the array.
Runner:
Create two objects of type Student and call the Average method.

25
Compare the Average of both Students and display which student has higher average. Create a
third student with name as object 1 and result array as object 2*/
import java.util.Arrays;

public class Student {

    private String name ;
    private int[] result_array;

    public void setName(String name) {
        this.name = name;
    }

    public void setResult_array(int[] result_array) {
        this.result_array = result_array;
    }

    public String getName() {
        return name;
    }

    public int[] getResult_array() {
        return result_array;
    }

    // constructor
    public  Student(String name , int[] result_array){
        this.name =name;
        this.result_array = result_array;
    }
    public  Student(){
        name = "Usman";
        result_array = getResult_array();
    }
    public double average() {
        int sum = Arrays.stream(result_array).sum();
        return sum / 5.0; // Dividing by 5.0 to get a floating-point average
    }
    public void display(){
        System.out.println(name + "'s average: " + average());
    }
}

