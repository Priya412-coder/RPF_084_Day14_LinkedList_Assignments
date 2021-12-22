package com.queue;

public class Queue<L> {
	LinkyList list=new LinkyList();

	public void enqueue(L data) {
		list.addFirst(data);
	}

	public void dequeue()
	{
		list.popLast();
	}

	public void getElements()
	{
		list.print();
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.getElements();
		queue.enqueue(30);
		queue.getElements();
		queue.enqueue(70);
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
	}
}
