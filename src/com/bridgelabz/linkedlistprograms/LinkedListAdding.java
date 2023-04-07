package com.bridgelabz.linkedlistprograms;

import java.util.LinkedList;

public class LinkedListAdding {

	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(56);
		linkedList.add(30);
		linkedList.add(70);
		System.out.println("Elements in the list: " + linkedList);
		// Creating nodes
		Node<Integer> node1 = new Node<>(70);
		Node<Integer> node2 = new Node<>(30);
		Node<Integer> node3 = new Node<>(56);

		// Linking nodes to create a linked list
		node1.setNext(node2);
		node2.setNext(node3);

		// Printing the linked list
		Node<Integer> current = node1;
		while (current != null) {
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.print("null");
	}
}

class Node<K> {
	private final K data;
	private Node<K> next;

	public Node(K data) {
		this.data = data;
		this.next = null;
	}

	public K getData() {
		return data;
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}

	public Node<K> getNext() {
		return next;
	}
}
