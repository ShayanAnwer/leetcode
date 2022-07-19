
public class Ques226 {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}

		flipChildNodes(root);

		return root;
	}

	public void flipChildNodes(TreeNode currentNode) {
		TreeNode tempNode = null;

		if (currentNode.left != null || currentNode.right != null) {
			tempNode = null;
			tempNode = currentNode.left;
			currentNode.left = currentNode.right;
			currentNode.right = tempNode;

			if (currentNode.left != null) {
				flipChildNodes(currentNode.left);
			}
			if (currentNode.right != null) {
				flipChildNodes(currentNode.right);
			}
		}
	}
}
