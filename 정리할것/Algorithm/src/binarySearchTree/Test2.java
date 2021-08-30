package binarySearchTree;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int E = sc.nextInt();

		MyTree tree = new MyTree();
		for (int e = 0; e < E; e++) {
			int p = sc.nextInt();
			int c = sc.nextInt();

			tree.add(p, c);
		}
		tree.inorder();
	}
}

class MyTree {
	private Node root = new Node(1);

	public void add(int parent, int data) {
		Node parentNode = search(root, parent);

		if (parentNode.left == null) {
			parentNode.left = new Node(data);
		} else {
			parentNode.right = new Node(data);
		}
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node now) {
		if (now == null) {
			return;
		}

		inorder(now.left);
		System.out.print(now.data + " ");
		inorder(now.right);

	}

	private Node search(Node now, int data) {
		if (now.data == data) {
			return now;
		}

		Node r1 = null, r2 = null;
		if (now.left != null) {
			r1 = search(now.left, data);
		}

		if (now.right != null) {
			r2 = search(now.right, data);
		}

//		if(r1==null && r2 ==null) {
//			return null;
//		}

		return r1 == null ? r2 : r1;
	}

	private class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

}