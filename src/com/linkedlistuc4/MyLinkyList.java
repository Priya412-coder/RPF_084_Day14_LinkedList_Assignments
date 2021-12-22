package com.linkedlistuc4;

public class MyLinkyList {
	static class Node {
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
		}
	}
	 static Node GetNode(int data) {
		return new Node(data);
	}

	static Node Insert(Node headNode, int position, int data) {
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		if (position == 1) {
			Node newNode = new Node(data);
			newNode.nextNode = headNode;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					Node newNode = GetNode(data);

					newNode.nextNode = headNode.nextNode;

					headNode.nextNode = newNode;
					break;
				}
				headNode = headNode.nextNode;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	static void PrintList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ===> ");
			node = node.nextNode;
			if (node != null)
				System.out.print("");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = GetNode(56);
		head.nextNode = GetNode(70);

		System.out.print("Linked list before insertion: ");
		PrintList(head);

		int data = 30, pos = 2;
		head = Insert(head, pos, data);
		System.out.print("Linked list after" + " insertion of 30 at position 2: ");
		PrintList(head);
	}
}
