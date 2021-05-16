package com.abu.collection;

import java.util.*;

public class HashMapTryout {
    public void AllFunctionTryout(){
        System.out.println("-----------------------------HASH MAP-------------------------------------------");
        Map hashMap = new HashMap<Object, Object>();
        hashMap.put("Abrar","1");
        hashMap.put("Abrar","2"); // This will return false and not add
        hashMap.put("Abu","3");
        hashMap.put("Abc",new Integer(4));
        hashMap.put("Abc2",4); // But this des not work
        hashMap.put("Abc1",5.5);


        // To iterate the data using iterator
        Collection values = hashMap.values();
        for (Object value: values) {
            System.out.println(value);
        }

        // To check if its empty or not
        System.out.println(hashMap.isEmpty());


    }
}
