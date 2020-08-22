package com.ucguy4u.linkedlist;

/**
 * <pre>
 * A doubly linked list (often abbreviated as DLL) is very much like a regular
 * singly linked list (SLL). Both DLL and SLL contain a pointer to the next
 * node, as well as a data field to represent the actual value stored in the
 * node.
 * 
 * However, the difference between DLL and SLL is that the doubly linked list
 * also contains a pointer to the previous node, not just the next node.
 * 
 * 
 * We now know that a node in a doubly linked list must contain three variables:
 * 
 * 1. A variable containing the actual data. 2. A variable storing the pointer
 * to the next node. 3. A variable storing the pointer to the previous node.
 * 
 * <pre>
 * 
 * @author uschauha
 *
 */
//https://dzone.com/articles/doubly-linked-list-in-java
public class DoublyLinkedList {
	private static DLLNode head;
	private static int numNodes = 0;

	public DoublyLinkedList(Object data) {
		head = new DLLNode(data);
		numNodes++;
	}

	public static void main(String args[]) {
		DoublyLinkedList dll = new DoublyLinkedList(12);
		dll.addAtHead(10);
		dll.addAtHead("uday");
		dll.insertAfter(head.next.next, "new10");
		dll.addAtEnd(99);
		dll.deleteAfter(head.next);
		// dll.clearList();
		dll.size();
	}

	/**
	 * Nullify the head and set count to 0 to clear the doubly linkedlist
	 */
	public void clearList() {
		head = null;
		numNodes = 0;
	}

	/**
	 * <pre>
	 * 1. Remove the value at a given position. 
	 * 2. If the position is less than 0, remove the value at position 0; 
	 * 3. If the position is greater than 0, remove the value at the last position.
	 * </pre>
	 * 
	 * @param index
	 */
	public void remove(int index) {
		int i = 0;

		// negative indexes are always invalid
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}

	}

	/**
	 * Remove a node matching the specific node from the list.
	 * 
	 * @param node
	 */
	public synchronized void removeMatched(DLLNode node) {

	}

	/**
	 * Remove the head value from the list.If the list is empty do nothing.
	 */
	public void removeHead() {

	}

	/**
	 * Remove the tail value from the list.If the list is empty do nothing.
	 */
	public void removeTail() {

	}

	/**
	 * <pre>
	 * 1. If node to be deleted is head node
	 * 2. Change next only if node to be deleted is NOT the last node 
	 * 3. Change prev only if node to be deleted is NOT the first node
	 * </pre>
	 * 
	 * @param node
	 */
	public void deleteAfter(DLLNode node) {
		if (head == null || node == null) {
			return;
		}
		if (head == node) {
			head = node.next;
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		}
		if (node.prev != null) {
			node.prev.next = node.next;
		}
		numNodes--;
		return;
	}

	/**
	 * <pre>
	 * 1. Add a new value to the list at a given position.
	 * 2. All values at that position to the end move over to make room.
	 * </pre>
	 * 
	 * @param index
	 * @param data
	 */
	public void insertAtPosition(int index, Object data) {

	}

	/**
	 * <pre>
	 * 1. allocate node  
	 * 2. put in the data
	 * 3. This new node is going to be the last node, so make next of it as NULL
	 * 4. If the Linked List is empty, then make the new node as head
	 * 5. Else traverse till the last node 
	 * 6. Change the next of last node
	 * 7. Make last node as previous of new node
	 * </pre>
	 * 
	 * @param data
	 */
	public void addAtEnd(Object data) {
		if (head == null) {
			head = new DLLNode(data);
		}
		DLLNode temp = new DLLNode(data);
		temp.next = null;
		DLLNode last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = temp;
		temp.prev = last;
		numNodes++;
	}

	/**
	 * <pre>
	 * We are given pointer to a node as prev_node, and the new node is inserted after the given node.
	 * It include 7 steps:
	 * 1. check if the given prev_node is NULL 
	 * 2. allocate node
	 * 3. put in the data
	 * 4. Make next of new node as next of prev_node
	 * 5. Make the next of prev_node as new_node
	 * 6. Make prev_node as previous of new_node
	 * 7. Change previous of new_node's next node
	 * </pre>
	 */
	public void insertAfter(DLLNode prev_node, Object data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		DLLNode node = new DLLNode(data);
		node.next = prev_node.next;
		prev_node.next = node;
		node.prev = prev_node;
		if (node.next != null)
			node.next.prev = node;
		numNodes++;
	}

	/**
	 * <pre>
	 * this method with all the data at the head node
	 * it includes 5 steps while adding node to head
	 * 1. allocate new node
	 * 2. put data in the new node
	 * 3. make next on new node as head and previous as NULL
	 * 4. change prev of head node to new node
	 * 5. move the head to point to the new node
	 * </pre>
	 * 
	 * @param data
	 */
	public void addAtHead(Object data) {
		if (head == null) {
			head = new DLLNode(data);
		} else {
			// DLLNode temp = head;
			DLLNode temp = new DLLNode(data);
			temp.next = head;
			temp.prev = null;
			if (head != null)
				head.prev = temp;
			head = temp;
		}
		numNodes++;
	}

	/**
	 * Return true if size is 0; otherwise, it is false.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return numNodes == 0;
	}

	/**
	 * Method will print the current data present in the linkedlist
	 */
	public void size() {
		DLLNode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.print("Current Size of DLL : " + numNodes);
	}

	class DLLNode {
		Object data;
		DLLNode prev = null;
		DLLNode next = null;

		public DLLNode(Object dat) {
			data = dat;
		}

		public Object getData() {
			return data;
		}
	}
}
