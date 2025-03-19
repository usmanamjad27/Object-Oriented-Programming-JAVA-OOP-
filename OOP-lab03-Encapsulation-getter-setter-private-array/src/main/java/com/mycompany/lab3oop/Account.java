/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3oop;

/**
 *
 * @author Q:
 Create an Encapsulated class Account class with balance as data member. Create two constructors and
methods to withdraw and deposit balance. In the runner create two accounts. The second account should
be created with the same balance as first account. (Hint: use get function)*/
import java.util.Scanner;

public class Account {

    private int balance;
    public String name;
    
    
    //constructor for name
    public Account(String name){
        this.name = name;
        System.out.println(name + " Account :");
    }

    // setter
    public void setBalance(int balance) {
        this.balance = balance;
        
    }

    //  getter
    public int getBalance() {
        return balance;
    }

    // Default construtor
    public Account() {
        balance = 0;
    }

    // Parametrized constructor
    public Account(int balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Dear coustomer , the balance of your account is   Rs." + balance);
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount for deposit");
        int addamount = sc.nextInt();
        balance += addamount;
        System.out.println("The balance of your account  after deposit   Rs." + addamount + " is  Rs." + balance );

    }

    public void widthdraw() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount for withdrawal");

        int withdrawamount = sc.nextInt();
        
        if (withdrawamount < 500  ) {
            System.out.println(" The  minimum withdraw amount is   Rs.500");
        
        } else if (withdrawamount > balance) {
        
          System.out.println("Insufficient Balance ");
             System.out.println("Your balance amount is     Rs." + balance);
           
        }
    else {
            balance -= withdrawamount;
            System.out.println("The balance of your account after widthdraw  Rs." + withdrawamount + " is Rs." + balance );

        }
    }
}