package com.abu.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<MyCustom> {

    @Override
    public int compare(MyCustom myCustom, MyCustom t1) {
        return myCustom.getName().compareTo(t1.getName());
    }
}
