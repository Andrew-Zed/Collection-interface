package com.andrew.arrays;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] sorted = sortInt(new int[]{1, 2, 3, 5, 12, 7, 6});
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] sortInt(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
