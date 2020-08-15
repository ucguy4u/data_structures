package com.ucguy4u;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SinglyLinkedListAppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SinglyLinkedListAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SinglyLinkedListAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		SinglyLinkList sl = new SinglyLinkList(12);
		sl.addAtIndex("test", 4);
		sl.addAtHead(11);
		sl.addAtEnd(8);
		sl.addAtIndex(4, 9);
		sl.deleteAtIndex(1);
		sl.printList();
        assertTrue( true );
    }
}
