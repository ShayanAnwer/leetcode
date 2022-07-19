import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ques102 {

	public List<List<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> workingQueue = new LinkedList<TreeNode>();
		ArrayList<List<Integer>> parentList = new ArrayList<List<Integer>>();
		List<Integer> childList;
		TreeNode currentNode;

		if (root == null) {
			return parentList;
		}

		workingQueue.add(root);

		childList = new ArrayList<Integer>();
		childList.add(root.val);
		parentList.add(childList);

		int initialQueueSize = workingQueue.size();
		int iteration = 0;
		childList = new ArrayList<Integer>();

		while (iteration < initialQueueSize) {
			currentNode = workingQueue.remove();
			iteration++;

			if (currentNode.left != null) {
				childList.add(currentNode.left.val);
				workingQueue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				childList.add(currentNode.right.val);
				workingQueue.add(currentNode.right);
			}

			if (iteration == initialQueueSize) {
				iteration = 0;
				initialQueueSize = workingQueue.size();
				if (childList.size() > 0) {
					parentList.add(childList);
				}
				childList = new ArrayList<Integer>();
			}
		}

		return parentList;
	}

}
