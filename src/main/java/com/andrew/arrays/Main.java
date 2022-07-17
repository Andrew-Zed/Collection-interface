package com.andrew.arrays;

import static com.andrew.arrays.Average.getAverage;
import static com.andrew.arrays.IntegerArray.getIntegers;

public class Main {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println();
        System.out.println("The average is " + getAverage(myIntegers));

    }

}
