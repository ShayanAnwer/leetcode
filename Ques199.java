import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ques199 {

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> resultList = new ArrayList<Integer>();
		TreeNode currentNode = null;

		if (root == null) {
			return resultList;
		}

		Queue<TreeNode> iterationQueue = new LinkedList<TreeNode>();
		iterationQueue.add(root);

		int iteration = 0;
		int itrQueueSize = iterationQueue.size();

		while (iteration < itrQueueSize) {
			iteration++;
			currentNode = iterationQueue.remove();

			if (currentNode.left != null) {
				iterationQueue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				iterationQueue.add(currentNode.right);
			}

			if (iteration == itrQueueSize) {
				resultList.add(currentNode.val);
				iteration = 0;
				itrQueueSize = iterationQueue.size();
			}
		}

		return resultList;
	}

}
