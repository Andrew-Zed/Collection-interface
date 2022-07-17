package com.andrew.arrays;


import java.util.Scanner;

public class IntegerArray {

    private static Scanner scanner = new Scanner(System.in);
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
