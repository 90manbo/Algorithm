package binarySearchTree;

class BinarySearchTreePro {
	private Node root;

	public void add(int num) {
		if (root == null) { // Ʈ���� ó�� �߰��Ǵ� �����ʹ� ��Ʈ ��� ��ü�� �Ǹ� ��.
			root = new Node(num);
		} else {
			add(root, num);
		}
	}

	private void add(Node now, int num) {
		if (now.data < num) {
			if (now.right == null) {
				now.right = new Node(num);
			} else {
				add(now.right, num);
			}
		} else {
			if (now.left == null) {
				now.left = new Node(num);
			} else {
				add(now.left, num);
			}
		}
	}

	public void inorder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(Node now) {
		if(now==null)
			return;
		
		inorder(now.left);
		System.out.print(now.data+" ");
		inorder(now.right);
	}

	public boolean contains(int num) { // � ���ڰ� Ʈ���ȿ� �ִ��� �������� �˻��ؼ� true, false�� �����ϴ� �޼ҵ�
		return contains(root, num);
	}
	
	private boolean contains(Node now, int num) {
		// ���� ���� ��ġ�ϴ� ���
		if(now != null && now.data == num)
			return true;
		
		if(now.data < num && now.right != null) { 
			// ���� ��庸�� ũ�� ������ �ڽ��� �ִ� ���
			return contains(now.right, num);
		}else if(now.data < num && now.right == null) {
			// ���� ��庸�� ū�� �����ʿ� �˻��غ� �ڽ��� ���� ���
			return false;
		}else if(now.data > num && now.left != null) {
			// ���� ��� �������� ���� ���
			return contains(now.left, num);
		}else if(now.data > num && now.left == null) {
			// ���� ��庸�� ���� ���� ã�ƾ� �ϴµ� ���̻� ���� ���
			return false;
		}
		// ��Ʈ�� ���� ���.
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
