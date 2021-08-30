package linkedList;

public class MyLinkedList {
	private Node head;
	private int size;

	public void add(int num) {
		Node newNode = new Node(num, null);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node last = find(size - 1);
			last.next = newNode;
		}
		size++;
	}

	public void add(int idx, int num) {
		Node prev = find(idx - 1);
		Node newNode = new Node(num, prev.next);
		prev.next = newNode;
		size++;
	}

	public int remove(int idx) {
		Node prev = find(idx - 1);
		int num = prev.next.data;
		prev.next = prev.next.next;
		size--;
		return num;
	}

	public int get(int idx) {
		Node now = find(idx);
		return now.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private Node find(int idx) {
		Node tmp = head;
		for (int i = 0; i < idx; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public String toString() {
		String str = "";
		Node tmp = head;
		for (int i = 0; i < size; i++) {
			str += tmp.data + " ";
			tmp = tmp.next;
		}
		return str;
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
