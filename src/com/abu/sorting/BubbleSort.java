package com.abu.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(){
        int[] numbers = new int[]{10,2,8,1,5};
        for(int i=0;i<numbers.length;i++){
            for(int j =0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
