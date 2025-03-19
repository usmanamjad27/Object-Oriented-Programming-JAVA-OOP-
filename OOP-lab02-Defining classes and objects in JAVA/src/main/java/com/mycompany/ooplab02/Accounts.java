/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooplab02;
import java.util.Scanner;
/**
 *
 * @author Dell
 */

    //Create a class Account class with balance as data member. Create two constructors (no argument, and
//        two arguments) and methods to withdraw and deposit balance.


        
public class Accounts {

    int balance;

    public Accounts(){
        balance = 0;
    }

    public Accounts (int setbalance){
        balance = setbalance;
    }

    public void depositBalance(){
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter amount to deposit in your Account! ");
        int amount = scanner_obj.nextInt();
        balance += amount;

        System.out.println("Amount deposited successfully!!!");
    }

    public void withdrawBalance(){
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter amount to withdraw from your Account! ");
        int amount = scanner_obj.nextInt();

        if(amount<balance) {
            balance -= amount;
            System.out.println("Amount withdraw successfully!!!");
        }else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance(){
        System.out.println("Balance available in your account is : "+balance);
    }


}

    

