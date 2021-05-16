package com.abu;

import com.abu.exception.Exception1;
import com.abu.inheritence.StaticOverridingB;
import com.abu.searching.BinarySearch;
import com.abu.sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        callOtherClass();

    }

    public static void callOtherClass() {

        Exception1 exception1 = new Exception1();
        exception1.callerToTheException();

        StaticOverridingB staticOverridingB = new StaticOverridingB();
        staticOverridingB.testWhichFunctionIsCalled();

        BubbleSort bubbleSort =new BubbleSort();
        bubbleSort.bubbleSort();

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch();;

    }
}
