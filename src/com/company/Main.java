package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = generateArray(10);
        printArray(numbers);
        numbers = shuffle(numbers);
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] shuffle(int[] array) {
        Random r = new Random();
        for (int j = 0; j < r.nextInt(50) + 50; j++) {
            for (int i = 0; i < array.length; i++) {
                int c = r.nextInt(array.length);
                int temp = array[i];
                array[i] = array[c];
                array[c] = temp;
            }
        }
        return array;
    }

    public static int[] generateArray(int size, int inf, int sup) {
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(Math.abs(sup) + Math.abs(inf)) + inf;
        }
        return array;
    }

    public static int[] generateArray(int size) {
        int inf = -10;
        int sup = 10;
        return generateArray(size, inf, sup);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }
        return max;
    }

}
