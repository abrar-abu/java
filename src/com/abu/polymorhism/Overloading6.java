package com.abu.polymorhism;

class Overloading6 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        Overloading6 obj = new Overloading6();
        // obj.sum(20, 20);//now ambiguity
    }
}  