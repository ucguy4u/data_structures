package com.ucguy4u.arrays;

public class TwoDArray {
    /**
     * This method accept the 2D array and print the Array elements
     *
     * @param arr
     */
    public void printArray(int[][] arr) {
        int numberOfColumns = arr[0].length;
        int numberOfRows = arr.length;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Method accepts the 2D array and returns the addition of left diagonal elements.
     *
     * @param arr
     * @return
     */
    public int sumLeftDiagonalElement(int[][] arr) {
        int sum = 0;
        int rows = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < column; j++) {
                if (i == j)
                    sum += arr[i][j];
            }
        return sum;
    }

    /**
     * This method accept the 2D array and returns the addition of right diagonal elements
     *
     * @param arr
     * @return
     */
    public int sumRightDiagonalElement(int[][] arr) {
        int sum = 0;
        int rows = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < column; j++) {
                if (i + j == rows - 1)
                    sum += arr[i][j];
            }
        return sum;
    }

    /**
     * This method accept the n*n 2D array and it returns the 2D after swapping the diagonal elements ()
     *
     * @param arr
     * @return
     */
    public int[][] swapDiagonalElement(int[][] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            temp = arr[i][i];
            arr[i][i] = arr[i][n - 1 - i];
            arr[i][n - 1 - i] = temp;
        }
        return arr;
    }

    /**
     * sumOfRowElement method accept the 2D array and it returns the array of addition of row elements
     *
     * @param arr
     * @return
     */
    public int[] sumOfRowElement(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum[i] += arr[i][j];
            }

        }
        return sum;
    }

    /**
     * SumOfColumnElement method will return the array of addition of all columns elements
     *
     * @param arr
     * @return
     */
    public int[] sumColumnElement(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum[i] += arr[j][i];
            }
        }
        return sum;
    }
}