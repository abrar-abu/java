package com.abu.collection;

import java.util.*;

public class LinkedListTryout {
    public void AllFunctionTryout() {
        System.out.println("-----------------------------Linked List-------------------------------------------");
        List<String> stringList = new LinkedList<>();
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");

        //Using the iterator
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Using the foreach which internally will use iterator only
        for (String s: stringList) {
            System.out.println(s);
        }


    }
}
