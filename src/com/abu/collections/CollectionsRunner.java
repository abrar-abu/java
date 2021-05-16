package com.abu.collections;

import com.abu.collection.HashMapTryout;
import com.abu.collection.HashTableTryout;
import com.abu.collection.LinkedHashMapTryout;
import com.abu.collection.TreeMapTryout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {
        List emptyList = Collections.EMPTY_LIST;
        ArrayList<Object> arrayList = new ArrayList<>();
        Collections.reverse(arrayList);
        /*
        ArraylistTryout arraylistTryout = new ArraylistTryout();
        arraylistTryout.AllFunctionTryout();

        HashSetTryout hashSetTryout = new HashSetTryout();
        hashSetTryout.AllFunctionTryout();

        LinkedHashMapTryout linkedHashMapTryout = new LinkedHashMapTryout();
        linkedHashMapTryout.AllFunctionTryout();

        TreeSetTryout treeSetTryout = new TreeSetTryout();
        treeSetTryout.AllFunctionTryout();
        */

        HashMapTryout hashMapTryout = new HashMapTryout();
        hashMapTryout.AllFunctionTryout();

        LinkedHashMapTryout linkedHashMapTryout =new LinkedHashMapTryout();
        linkedHashMapTryout.AllFunctionTryout();

        TreeMapTryout treeMapTryout = new TreeMapTryout();
        treeMapTryout.AllFunctionTryout();

        HashTableTryout hashTableTryout = new HashTableTryout();
        hashTableTryout.AllFunctionTryout();
    }
}
