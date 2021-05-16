package com.abu.polymorhism;

class Overloading4 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        Overloading4 obj = new Overloading4();
        obj.sum(20, 20);//now second int literal will be promoted to long
        obj.sum(20, 20, 20);

    }
}  