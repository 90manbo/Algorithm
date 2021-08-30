package binarySearchTree;

public class Test {
	public static void main(String[] args) {
		char[] tree = new char[16];
		char[] tree2 = new char[16];
		char[] tree3 = new char[16];

		char ch = 'A';
		for (int i = 1; i < tree.length; i++) {
			tree[i] = ch;
			tree2[i] = ch;
			tree3[i] = ch;
			ch++;

		}
		preorder(tree, 1);
		System.out.println();
		inorder(tree2, 1);
		System.out.println();
		postorder(tree3, 1);

	}

	static void preorder(char[] tree, int idx) {
		if (idx >= tree.length || tree[idx] == 0) {
			return;
		}
		if (idx < tree.length && tree[idx] != 0) {

			System.out.print(tree[idx] + " ");
			preorder(tree, idx * 2);
			preorder(tree, idx * 2 + 1);
		}

	}

	static void inorder(char[] tree, int idx) {
		if (idx >= tree.length || tree[idx] == 0) {
			return;
		}
		if (idx < tree.length && tree[idx] != 0) {

			inorder(tree, idx * 2);
			System.out.print(tree[idx] + " ");
			inorder(tree, idx * 2 + 1);
		}

	}

	static void postorder(char[] tree, int idx) {
		if (idx >= tree.length || tree[idx] == 0) {
			return;
		}
		if (idx < tree.length && tree[idx] != 0) {

			postorder(tree, idx * 2);
			postorder(tree, idx * 2 + 1);
			System.out.print(tree[idx] + " ");
		}

	}
}
