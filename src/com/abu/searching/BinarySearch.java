package com.abu.searching;

import java.util.Arrays;

public class BinarySearch {
    public void binarySearch(){
        int[] numbers = new int[]{12,10,3,4,6,7,0,-1,-85};
        Arrays.sort(numbers);
        System.out.println(runBinarySearchIteratively(numbers,82,0,numbers.length-1));
        System.out.println(runBinarySearchIteratively(numbers,-1,0,numbers.length-1));
    }

    /**
     * Binary search algorith
     * @param sortedArray
     * @param key
     * @param low
     * @param high
     * @return
     */
    private int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
