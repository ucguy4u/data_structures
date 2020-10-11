package com.ucguy4u.linkedlist;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DoublyLinkedListAppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DoublyLinkedListAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DoublyLinkedListAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		DoublyLinkedList dll = new DoublyLinkedList(12);
		//dll.printDLL();
		dll.addAtHead(10);
		dll.size();
        assertTrue( true );
    }
}
