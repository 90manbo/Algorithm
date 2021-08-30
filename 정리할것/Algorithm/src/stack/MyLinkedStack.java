package stack;

public class MyLinkedStack {
	private Node top = null;
	private int size = 0;

	public void push(int num) {
		Node newNode = new Node(num, null);
		if(isEmpty()) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public int pop() {
		
		Node temp;
		temp = top;
		top = top.next;
		size--;
		
		return temp.data;
	}

	public boolean isEmpty() {
		
		return size == 0 ? true : false;
		
	}

	public int peek() {
		return top.data;
	}
	
	public int size() {
		return size;
	}

	private class Node {
		int data;
		Node next;

		Node(int num, Node addr) {
			this.data = num;
			this.next = addr;
		}
	}
}
