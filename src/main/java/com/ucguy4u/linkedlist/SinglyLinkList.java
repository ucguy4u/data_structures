package com.ucguy4u.linkedlist;

/**
 * A singly linked list is a type of linked list that is unidirectional, that
 * is, it can be traversed in only one direction from head to the last node
 * (tail).
 * 
 * Each element in a linked list is called a node. A single node contains data
 * and a pointer to the next node which helps in maintaining the structure of
 * the list.
 * 
 * Implementing Singly linked list
 * 
 * @author uschauha
 *
 */
public class SinglyLinkList {
	private static Node head;
	private static int numNodes;

	public SinglyLinkList(Object data) {
		head = new Node(data);
	}

	/**
	 * Find the data in a node and returns index of data from linkedlist
	 * 
	 * @param n
	 * @return
	 */
	public Node find(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	/**
	 * Find the data in a node and returns index of data from linkedlist
	 * 
	 * @param n
	 * @return
	 */
	public int find(Node n) {
		Node temp = head;
		int index = 0;
		while (temp != n) {
			index++;
			temp = temp.next;
		}
		return index;
	}

	/**
	 * returns the size of the current linkedlist
	 * 
	 * @return
	 */
	public static int getSize() {
		return numNodes;
	}

	/**
	 * add the data at the beginning of linkedlist
	 * 
	 * @param data
	 * @return
	 */
	public void addAtHead(Object data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = head;
			head = new Node(data);

			head.next = temp;
			numNodes++;
		}
	}

	/**
	 * add the data Node at the end of linkedlist
	 * 
	 * @param data
	 * @return
	 */
	public void addAtEnd(Object data) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new Node(data);
		numNodes++;
	}

	/**
	 * add the data Node at the given index of linkedlist. Traverse the Linked list
	 * upto position-1 nodes. Once all the position-1 nodes are traversed, allocate
	 * memory and the given data to the new node. Point the next pointer of the new
	 * node to the next of current node. Point the next pointer of current node to
	 * the new node.
	 * 
	 * @param data
	 * @param index
	 * @return
	 */
	public void addAtIndex(Object data, int index) {
		Node temp = head;
		Node holder;
		// traversing till the next is not null

		for (int i = 0; i < index - 1 && temp.next != null; i++) {
			temp = temp.next;
		}
		holder = temp.next;
		temp.next = new Node(data);
		temp.next.next = holder;
		numNodes++;
	}

	/**
	 * Delete the data at given index free the node by
	 * 
	 * @param index
	 */
	public void deleteAtIndex(int index) {
		Node temp = head;
		for (int i = 0; i < index - 1 && temp.next != null; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		numNodes--;

	}

	/**
	 * 
	 */
	public void printList() {
		System.out.println("Linkdlist contains :");
		Node temp = head;
		int i = 0;
		while (temp != null) {
			System.out.print(i);
			System.out.println(" : " + temp.getData());
			temp = temp.next;
			i++;
		}
	}

	class Node {
		Node next;
		Object data;

		public Node(Object dat) {
			data = dat;
		}

		public Object getData() {
			return data;
		}
	}

}