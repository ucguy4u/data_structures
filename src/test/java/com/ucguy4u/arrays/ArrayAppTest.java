package com.ucguy4u.arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ArrayAppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ArrayAppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(Array.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        Array obj = new Array();
        int[] arr = {1, 2, 3, 4, 56, 6};
        obj.printArray(arr);
        System.out.println();
        arr = obj.addElement(arr, 3, 99);
        obj.printArray(arr);
        System.out.print("index " + obj.searchElement(arr, 6));
        arr = obj.deleteElement(arr, 2  );
        System.out.println(" ");
        obj.printArray(arr);

        assertTrue(true);
    }
}