package com.abu.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTryout {
    public void AllFunctionTryout() {
        System.out.println("-----------------------------Vector-------------------------------------------");
        List<String> stringList = new Vector<>();
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
