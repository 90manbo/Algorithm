package binarySearchTree;

class BinarySearchTreePro {
	private Node root;

	public void add(int num) {
		if (root == null) { // 트리에 처음 추가되는 데이터는 루트 노드 객체가 되면 됨.
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

	public boolean contains(int num) { // 어떤 숫자가 트리안에 있는지 없는지를 검사해서 true, false를 리턴하는 메소드
		return contains(root, num);
	}
	
	private boolean contains(Node now, int num) {
		// 현재 노드와 일치하는 경우
		if(now != null && now.data == num)
			return true;
		
		if(now.data < num && now.right != null) { 
			// 현재 노드보다 크고 오른쪽 자식이 있는 경우
			return contains(now.right, num);
		}else if(now.data < num && now.right == null) {
			// 현재 노드보다 큰데 오른쪽에 검사해볼 자식이 없는 경우
			return false;
		}else if(now.data > num && now.left != null) {
			// 현재 노드 왼쪽으로 가는 경우
			return contains(now.left, num);
		}else if(now.data > num && now.left == null) {
			// 현재 노드보다 작은 값을 찾아야 하는데 더이상 없는 경우
			return false;
		}
		// 루트도 없는 경우.
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
