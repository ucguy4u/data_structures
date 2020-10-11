package com.ucguy4u.arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TwoDArrayAppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TwoDArrayAppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(TwoDArray.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        TwoDArray obj = new TwoDArray();
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        obj.printArray(arr);
        System.out.println("Sum of left diagonal elements : " + obj.sumLeftDiagonalElement(arr));
        System.out.println("Sum of right diagonal elements : " + obj.sumRightDiagonalElement(arr));
        arr = obj.swapDiagonalElement(arr);
        System.out.println("Swapping the diagonal elements : ");
        obj.printArray(arr);
        System.out.println("Sum of row elements : ");
        for (int i : obj.sumOfRowElement(arr))
            System.out.println(i);
        System.out.println("Sum of row elements : ");
        for (int i : obj.sumColumnElement(arr))
            System.out.println(i);

        //        System.out.println();
//        arr = obj.addElement(arr, 3, 99);
//        obj.printArray(arr);
//        System.out.print("index " + obj.searchElement(arr, 6));
//        arr = obj.deleteElement(arr, 2);
//        System.out.println(" ");
//        obj.printArray(arr);

        assertTrue(true);
    }
}