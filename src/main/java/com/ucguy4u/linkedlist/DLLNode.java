package com.ucguy4u.linkedlist;

/**
 * 
 * This class represents a node in a Doubly Linked List. The next-variable is a
 * pointer to the next node, and the prev-variable is a pointer to the previous
 * node.
 * <p>
 * 
 * @author uschauha
 * @see DoublyLinkedList
 * 
 */
public class DLLNode<AnyType> {
	Object data;
	DLLNode<AnyType> prev = null;
	DLLNode<AnyType> next = null;

	public DLLNode(AnyType dat) {
		this(null, dat, null);
	}

	public DLLNode(DLLNode<AnyType> prev, AnyType dat, DLLNode<AnyType> next) {
		this.data = dat;
		this.next = next;
		this.prev = prev;
	}
}