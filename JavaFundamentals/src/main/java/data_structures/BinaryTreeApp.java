package data_structures;

import java.util.Set;

@SuppressWarnings("ClassEscapesDefinedScope")
public class BinaryTreeApp {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(5);
		Node node5 = new Node(4);
		Set<Node> setOfNodes = Set.of(node1, node2, node3, node4, node5);
		Node root = constructBinaryTree(setOfNodes);
		Node.inOrderTraversal(root);
		Node.searchValue(1, root);
	}


	private static Node constructBinaryTree(Set<Node> setOfNodes) {
		Node root = null;
		for (Node value : setOfNodes) {
			root = insert(root, value);
		}
		return root;
	}

	public static Node insert(Node root, Node current) {
		if (root == null) {
			return new Node(current.value);
		}
		if (current.value < root.value) {
			root.left = insert(root.left, current);
		} else if (current.value > root.value) {
			root.right = insert(root.right, current);
		}
		return root;
	}

	@SuppressWarnings("unused")
	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		static void inOrderTraversal(Node node) {
			if (node != null) {
				inOrderTraversal(node.left);
				System.out.println(node.value + " ");
				inOrderTraversal(node.right);
			}
		}

		static void searchValue(int value, Node node) {
			if (node == null) {
				System.out.println("Not found");
				return;
			}
			if (node.value == value) {
				System.out.println(node);
				return;
			}
			searchValue(value, node.right);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		@Override
		public String toString() {
			return "Node{" +
					"value=" + value +
					", left=" + left +
					", right=" + right +
					'}';
		}
	}
}
