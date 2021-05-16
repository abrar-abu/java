package com.abu.collection;

import java.util.*;

public class TreeMapTryout {
    public void AllFunctionTryout(){
        System.out.println("-----------------------------TREE MAP-------------------------------------------");
        Map treeMap = new TreeMap<Object,Object>();
        treeMap.put("Abrar","1");
        treeMap.put("Abrar","2"); // This will return false and not add
        treeMap.put("Abu","3");
        treeMap.put("Abc",new Integer(4));
        treeMap.put("Abc2",4); // But this des not work
        treeMap.put("Abc1",5.5);
        treeMap.put(new MyCustom("name",2),5.5); // Will thow exaption is the class does nou t implemet comparable

        // To iterate the data using iterator
        Set<Map.Entry<Object, Object>> entrySet = treeMap.entrySet();
        for (Map.Entry<Object,Object> entry: entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // To check if its empty or not
        System.out.println(treeMap.isEmpty());

    }

}
