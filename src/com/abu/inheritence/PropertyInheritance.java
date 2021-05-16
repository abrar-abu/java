package com.abu.inheritence;


class Employee{
    float salary=40000;
}
public class PropertyInheritance extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        PropertyInheritance p=new PropertyInheritance();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}

