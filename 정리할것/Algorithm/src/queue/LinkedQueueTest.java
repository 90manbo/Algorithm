package queue;

public class LinkedQueueTest {
	private int size = 0;
	private Node front, rear;

	public void enQueue(int num) {
		Node newNode = new Node(num, null);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public int deQueue() {
		if (isEmpty()) {
			throw new RuntimeException("NULL");
		} else {
			int num = front.data; // front�� ���� �ּҿ� �����ؼ� ������ Ȯ��.
			front = front.next; // ���� �տ� �ִ� ��� ��ü�� �ּҸ� ������ �ι�°�� ��ü.
			size--;
			return num;
		}
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("NULL");
		} else {
			return front.data;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		LinkedQueueTest q = new LinkedQueueTest();
		q.enQueue(1);
		System.out.println(q.deQueue());
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.peek());
		q.deQueue();
		System.out.println(q.size());

	}

}
