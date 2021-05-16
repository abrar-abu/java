package com.abu.abc1;

import com.abu.abc.Animal;

public class Cat extends Animal {

    /*
    public void walk() {
    }
    */

    public static void main(String[] args) {
        Cat c = new Cat();
        
        System.out.println(c.age);
        c.walk(); // will not work
    }
}