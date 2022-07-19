
public class Ques543 {

	int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {

		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 0;
		}

		findDepth(root);
		return max;
	}

	public int findDepth(TreeNode currentNode) {

		if (currentNode == null) {
			return 0;
		}

		int left = findDepth(currentNode.left);
		int right = findDepth(currentNode.right);

		max = Math.max(max, left + right);

		return 1 + Math.max(left, right);
	}
}
