
public class Ques98 {

	public boolean isValidBST(TreeNode root) {

		if (root == null) {
			return true;
		}

		return checkNode(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}

	public boolean checkNode(TreeNode node, double leftBoundary, double rightBoundary) {
		if (node.val <= leftBoundary || node.val >= rightBoundary) {
			return false;
		}

		if (node.left != null) {
			if (!checkNode(node.left, leftBoundary, node.val)) {
				return false;
			}
		}
		if (node.right != null) {
			if (!checkNode(node.right, node.val, rightBoundary)) {
				return false;
			}
		}

		return true;
	}

}
