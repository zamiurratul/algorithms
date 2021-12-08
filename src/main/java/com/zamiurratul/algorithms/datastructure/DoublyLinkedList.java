package com.zamiurratul.algorithms.datastructure;

import com.zamiurratul.algorithms.common.Node;

public class DoublyLinkedList {
	private Node head;
	
	public void insertAtStart(String data) {
		if (head == null) {
			head = new Node(data);
			head.prev = null;
			head.next = null;
		} else {
			Node newNode = new Node(data);
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void insertAtEnd(String data) {
		if (head == null) {
			head = new Node(data);
			head.prev = null;
			head.next = null;
		} else {
			Node newNode = new Node(data);
			Node tailNode = head;
			while (tailNode.next != null) {
				tailNode = tailNode.next;
			}
			tailNode.next = newNode;
			newNode.next = null;
			newNode.prev = tailNode;
		}
	}
	
	public void printAll() {
		System.out.println(" ");
		Node currNode = head;
		if (currNode == null) {
			System.out.println("DoublyLinkedList is EMPTY.");
		} else {
			while (currNode != null) {
				System.out.println("DATA: " + currNode.data);
				currNode = currNode.next;
			}
		}
	}
	
	public void printAllReverse() {
		System.out.println(" ");
		Node currNode = head;
		if (currNode == null) {
			System.out.println("DoublyLinkedList is EMPTY.");
		} else {
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			while (currNode != null) {
				System.out.println("DATA: " + currNode.data);
				currNode = currNode.prev;
			}
		}	
	}
}
