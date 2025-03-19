/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;

/**
 *
 * @author Dell
 */

    //Q:
//Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set
//valid time. Also create display function which display all data members

public class Class_time {
    int hr;
    int mint;
    int sec;

    public Class_time(){
        hr = 0;
        mint = 0;
        sec = 0;
    }

    public Class_time(int hr , int mint , int sec) {
    if(isValidTime(hr,mint,sec)) {
        this.hr = hr;
        this.mint = mint;
        this.sec = sec;
        System.out.println("THis is Valid Time");
    }else {
        System.out.println("Invalid Time!!!!!!!!!");
        this.hr = 0;
        this.mint = 0;
        this.sec = 0;
    }
    }

    public boolean isValidTime( int hr, int mint, int sec) {
        return (hr >= 0 && hr < 24) && (mint >= 0 && mint < 60) && (sec >= 0 && sec < 60);
    }

    public void displayFunction(){
        System.out.println("Time is "+hr+"hr : "+mint+"mint : "+sec+"sec");
    }

}


