package com.linkedlistuc1anduc2;

import com.linkedlistuc1anduc2.MyLinkyList.Node;

public class MyLinkyList<L> {
	Node head;
	L data ;
	public boolean add(L i) {

		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}
	
	public L print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return data;
		}

		MyLinkyList<L>.Node temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return data;
		}
		while (temp != null) {

			if (temp.next != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next;
		}
		return data;
	}
	
	public class Node {
		MyLinkyList<L>.Node next ;
		private L data;

		Node(L data){
			this.data = data;
		}
		
		public L print() {

			if (head == null) {
				System.out.println("No elements to show...");
				return data;
			}

			MyLinkyList<L>.Node temp = head;
			if (head.next == null) {
				System.out.println(head.data);
				return data;
			}
			while (temp != null) {

				if (temp.next != null)
					System.out.print(temp.data + " ===> ");
				else
					System.out.println(temp.data);

				temp = temp.next;
			}
			return data;
		}
		public static void main(String[] args) {
			MyLinkyList<Integer> list = new MyLinkyList<Integer>();
			list.add(56);
			list.add(30);
			list.add(70);
			list.print();
		}
	}
}
