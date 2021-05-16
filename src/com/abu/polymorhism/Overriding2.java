package com.abu.polymorhism;

//Java Program to demonstrate why we need method overriding
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle2 {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Creating a child class  
public class Overriding2 extends Vehicle2 {
    //defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        //creating an instance of child class
        Overriding2 obj = new Overriding2();
        //calling the method with child class instance
        obj.run();
    }
}  