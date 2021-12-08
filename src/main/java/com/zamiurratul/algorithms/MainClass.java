package com.zamiurratul.algorithms;

import com.zamiurratul.algorithms.datastructure.DoublyLinkedList;

public class MainClass {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtEnd("Apple");
		doublyLinkedList.insertAtEnd("Banana");
		doublyLinkedList.insertAtEnd("Cat");
		doublyLinkedList.insertAtEnd("Dog");
		doublyLinkedList.insertAtEnd("Elephant");
		doublyLinkedList.insertAtStart("00000");
		doublyLinkedList.printAll();
		doublyLinkedList.printAllReverse();
	}
}
