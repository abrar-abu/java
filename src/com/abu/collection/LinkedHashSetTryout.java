package com.abu.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTryout {

    public void AllFunctionTryout(){
        System.out.println("-----------------------------LINKED HASH SET-------------------------------------------");
        Set hashSet = new LinkedHashSet();
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
