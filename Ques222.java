
public class Ques222 {

	public int countNodes(TreeNode root) {
		int totalNodesCount = 0;

		if (root == null) {
			return 0;
		}

		int rootHeight = countHeight(root);

		if (rootHeight == 0) {
			return 1;
		}
		int upperNodesCount = ((int) (Math.pow(2, rootHeight))) - 1;

		// count the last row nodes
		int left = 0;
		int right = upperNodesCount;
		int indexToSearch = 0;
		boolean isNodeNull = false;

		while (left < right) {
			indexToSearch = Math.floorDiv(left + right, 2) + 1;

			isNodeNull = checkNode(indexToSearch, rootHeight, root);
			if (isNodeNull) {
				right = indexToSearch - 1;
			} else if (!isNodeNull) {
				left = indexToSearch;
			}
		}

		totalNodesCount = upperNodesCount + left + 1;

		return totalNodesCount;
	}

	public boolean checkNode(int indexToSearch, int rootHeight, TreeNode root) {
		int left = 0;
		int right = ((int) (Math.pow(2, rootHeight))) - 1;
		int count = 0;
		int midValue = 0;
		TreeNode nodeToCheck = root;

		while (count < rootHeight) {
			count++;
			midValue = Math.floorDiv(left + right, 2) + 1;

			if (indexToSearch >= midValue) {
				left = midValue;
				nodeToCheck = nodeToCheck.right;
			} else if (indexToSearch < midValue) {
				right = midValue - 1;
				nodeToCheck = nodeToCheck.left;
			}
		}

		return (nodeToCheck == null);
	}

	public int countHeight(TreeNode root) {
		TreeNode currentNode = root;
		int height = 0;

		while (currentNode.left != null) {
			height++;
			currentNode = currentNode.left;
		}

		return height;
	}

}
