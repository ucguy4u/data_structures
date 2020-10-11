package com.ucguy4u.arrays;

import java.util.Arrays;

public class Array {

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public int[] addElement(int[] arr, int pos, int value) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = value;
        for (int i = pos + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    public int searchElement(int[] arr, int number) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                position = i;
                break;
            }
        }
        return position;
    }

    public int[] deleteElement(int[] arr, int value) {
        int pos = searchElement(arr, value);
        if (pos >= 0) {
            for (int i = pos + 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - 1);
    }
}
