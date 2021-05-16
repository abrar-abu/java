package com.abu.customcollection;

public class CustomCollection {
    public static void main(String[] args) {
        CArrayList cArrayList = new CArrayList();
        cArrayList.add("Abrar");
        cArrayList.add("Abu");
        System.out.println(cArrayList);

        CSet cSet = new CSet();
        cSet.add("Abrar");
        System.out.println(cSet.size()+" "+cSet);
        cSet.add("Abrar");
        System.out.println(cSet.size()+" "+cSet);
        cSet.add("Abu");
        cSet.add("Abu1");
        cSet.add("Abu2");
        cSet.add("Abu10");
        System.out.println(cSet.size()+" "+cSet);
    }
}
