
public class Ques110 {

	public boolean isBalanced(TreeNode root) {

		if (root == null) {
			return true;
		}

		int height = checkHeight(root);
		if (height > -1) {
			return true;
		}

		return false;
	}

	public int checkHeight(TreeNode currentNode) {

		if (currentNode == null) {
			return 0;
		}

		int left = checkHeight(currentNode.left);
		int right = checkHeight(currentNode.right);

		if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
			return -1;
		}
		return 1 + Math.max(left, right);
	}

}
