package com.abu.polymorhism;

//Java Program to demonstrate why we need method overriding
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

//Creating a child class  
public class Overriding1 extends Vehicle {
    public static void main(String args[]) {
        //creating an instance of child class
        Overriding1 obj = new Overriding1();
        //calling the method with child class instance
        obj.run();
    }
}  