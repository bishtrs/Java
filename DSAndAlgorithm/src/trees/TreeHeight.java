package trees;

public class TreeHeight {

	public static void main(String[] args) {
		Node leftNode = new Node(new Node(null, null, 4), null, 5);
		Node rightNode = new Node(null, null, 9);
		Node root = new Node(leftNode, rightNode, 7);
		int height = treeHeight(root);
		System.out.println(height);
	}

	private static int treeHeight(Node n) {
		if (n == null)
			return 0;
		return 1 + Math.max(treeHeight(n.getLeft()), treeHeight(n.getRight()));
	}

}
