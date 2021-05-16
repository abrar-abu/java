package com.abu.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTryout {
    public void AllFunctionTryout(){
        System.out.println("-----------------------------TREE SET-------------------------------------------");
        Set hashSet = new TreeSet();
        System.out.println(hashSet.add("Abrar"));
        System.out.println(hashSet.add("Abrar")); // This will return false and not add
        System.out.println(hashSet.add("Abu"));
        System.out.println(hashSet.add("Abc"));

        // To iterate the data using iterator
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // To check if its empty or not
        System.out.println(hashSet.isEmpty());

    }

}
