package com.abu.collection;

import java.util.*;

public class LinkedHashMapTryout {

    public void AllFunctionTryout(){
        System.out.println("-----------------------------LINKED HASH MAP-------------------------------------------");
        Map<Object, Object> linkedHashMap = new LinkedHashMap<Object,Object>();
        linkedHashMap.put("Abrar","1");
        linkedHashMap.put("Abrar","2"); // This will return false and not add
        linkedHashMap.put("Abu","3");
        linkedHashMap.put("Abc",new Integer(4));
        linkedHashMap.put("Abc2",4); // But this des not work
        linkedHashMap.put("Abc1",5.5);

        // To iterate the data using iterator
        Set<Map.Entry<Object, Object>> entrySet = linkedHashMap.entrySet();

        for (Map.Entry<Object,Object> entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // To check if its empty or not
        System.out.println(linkedHashMap.isEmpty());

    }
}
