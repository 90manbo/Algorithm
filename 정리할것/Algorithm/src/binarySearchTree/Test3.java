package binarySearchTree;

public class Test3 {
	public static void main(String[] args) {
		BinarySearchTreePro bst = new BinarySearchTreePro();

		bst.add(30);
		bst.add(10);
		bst.add(40);
		bst.add(50);

		bst.inorder(); 

		System.out.println();
		System.out.println(bst.contains(40)); // false
		System.out.println(bst.contains(60)); // true
	}

}

class BinarySearchTree {

	private Node root;

	public void add(int num) {
		if (root == null) { //  트리에 처음 추가되는 데이터는 루트 노트 객체가 되면 됨
			root = new Node(num);
		} else {
			add(root, num);
		}
	}

	private void add(Node now, int num) {
		if (now.data > num) {
			if (now.left != null) {
				add(now.left, num);
			} else {
				now.left = new Node(num);
			}

		}
		if (now.data < num) {
			if (now.right != null) {
				add(now.right, num);
			} else {
				now.right = new Node(num);

			}
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

	public boolean contains(int num) { // 어떤숫자가 트리안에 있는지 없는지
		boolean b = contains(root, num);

		return b;
	}

	private boolean contains(Node root, int num) {
		if (root.data == num) {
			return true;
		} else {
			if (root.data > num && root.left != null) {
				return contains(root.left, num);
			}
			if (root.data < num && root.right != null) {
				return contains(root.right, num);
			}
		}
		return false;
	}

	private class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

}