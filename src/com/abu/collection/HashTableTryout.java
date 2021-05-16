package com.abu.collection;

import java.util.*;

public class HashTableTryout {
    public void AllFunctionTryout(){
        System.out.println("-----------------------------HASH TABLE-------------------------------------------");
        Map hashtable = new Hashtable();
        hashtable.put("Abrar","1");
        hashtable.put("Abrar","2"); // This will return false and not add
        hashtable.put("Abu","3");
        hashtable.put("Abc",new Integer(4));
        hashtable.put("Abc2",4); // But this des not work
        hashtable.put("Abc1",5.5);

        // To iterate the data using iterator
        Collection values = hashtable.values();
        for (Object value: values) {
            System.out.println(value);
        }

        // To check if its empty or not
        System.out.println(hashtable.isEmpty());


    }
}
