
public class Ques104 {

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		}

		return findTreeDepth(root, 1);
	}

	public int findTreeDepth(TreeNode root, int depth) {
		int leftDepth = depth;
		int rightDepth = depth;
		
		if(root==null){
            return depth;
        }

		if (root.left != null) {
			leftDepth++;
			leftDepth = findTreeDepth(root.left, leftDepth);
		}

		if (root.right != null) {
			rightDepth++;
			rightDepth = findTreeDepth(root.right, rightDepth);
		}

		return Math.max(leftDepth, rightDepth);
	}

}
