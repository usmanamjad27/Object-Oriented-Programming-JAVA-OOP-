/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Q:
 Suppose you operate several hot dog stands distributed throughout town. Define an Encapsulated class
named HotDogStand that has an instance variable for the hot dog stand’s ID number and an instance
variable for how many hot dogs the stand has sold that day.
Create a constructor that allows a user of the class to initialize both values. Also create a method named
justSold that increments by one the number of hot dogs the stand has sold. The idea is that this method
will be invoked each time the stand sells a hot dog so that you can track the total number of hot dogs sold
by the stand.
Write a main method to test your class with at least three hot dog stands that each sell a variety of hot
dogs. Use get function to display the hot dogs sold for each object.
 */
class Hot_dogStand {
    
    private final String stand_Id_Number;
    private int hot_dog_sale_that_day;

    // there is no need because we used parametrized constructor
//    public void setHot_dog_sale_that_day(int hot_dog_sale_that_day) {
//        this.hot_dog_sale_that_day = hot_dog_sale_that_day;
//    }
//
//    public void setStand_Id_Number(String stand_Id_Number) {
//        this.stand_Id_Number = stand_Id_Number;
//    }

    public int getHot_dog_sale_that_day() {
        return hot_dog_sale_that_day;
    }

    public String getStand_Id_Number() {
        return stand_Id_Number;
    }

    // constructor
    public Hot_dogStand( String stand_Id_Number , int hot_dog_sale_that_day){
        this.stand_Id_Number = stand_Id_Number;
        this.hot_dog_sale_that_day = hot_dog_sale_that_day;
    }
    // method of justSold
    public void justSold(){
        hot_dog_sale_that_day++;
    }

    public  void getdisplay(){
        System.out.println("Hot Dog Stand "+stand_Id_Number+" has sold "+hot_dog_sale_that_day+" hot dogs.");
    }
}
