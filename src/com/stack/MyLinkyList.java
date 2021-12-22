package com.stack;

public class MyLinkyList<L> {
	Node<L> head;

	public class Node<L> {
		L data;
		Node<L> next;

		Node(L data) {
			this.data = data;
		}
	}

	public boolean addLast(L data) {
		Node<L> newNode = new Node<L>(data);

		if (head == null) {
			head = newNode;
			return true;
		}

		Node<L> temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}

		temp.next = newNode;

		return true;
	}

	public boolean addFirst(L data) {

		Node<L> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node<L> temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}

	public boolean pop() {
		Node<L> temp = head;
		head = temp.next;

		return true;
	}

	public boolean popLast() {

		if (head == null)
			return false;
		if (head.next == null) {
			head = null;
			return true;
		}

		Node<L> temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;

		return false;
	}

	public void print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		Node<L> temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		while (temp != null) {

			if (temp.next != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next;
		}
	}
}
