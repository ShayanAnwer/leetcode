import java.util.HashSet;
import java.util.Set;

public class Ques142a {

	public ListNode detectCycle(ListNode head) {

		ListNode currentNode = head;
		Set<ListNode> existNodes = new HashSet<ListNode>();

		while (currentNode != null) {
			if (existNodes.contains(currentNode)) {
				return currentNode;
			}
			existNodes.add(currentNode);
			currentNode = currentNode.next;
		}
		return null;
	}
}
