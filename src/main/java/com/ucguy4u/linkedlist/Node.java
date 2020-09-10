package com.ucguy4u.linkedlist;

/**
 * 
 * This class represents a node in a Singly Linked List.
 * The next-variable is a pointer to the next node,
 * and data holds the data at present node.
 * <p>
 * 
 * @author uschauha
 * @see SinglyLinkList
 */

public class Node {
	public Node next;
	Object data;

	public Node(Object dat) {
		data = dat;
	}

	public Object getData() {
		return data;
	}
}