package com.abu.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTryout {
    public void AllFunctionTryout() {
        System.out.println("-----------------------------Array List-------------------------------------------");
        List<String> stringList = new ArrayList<>();
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");
        stringList.add("abu");

        for (String s: stringList) {
            System.out.println(s);
        }
    }
}
