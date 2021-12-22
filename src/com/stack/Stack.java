package com.stack;

public class Stack<L> {
	MyLinkyList list = new MyLinkyList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void pop() {
		list.pop();
	}

	public void showElements() {
		list.print();
	}
public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(70);
    stack.showElements();
    stack.push(30);
    stack.showElements();
    stack.push(56);
    stack.showElements();
	stack.pop();
	stack.showElements();
	stack.pop();
	stack.showElements();
	stack.pop();
	stack.showElements();
}
}
