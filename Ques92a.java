
public class Ques92a {

	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode currentNode = head;
		ListNode nextNode = null;
		ListNode endNode = null;
		ListNode startNode = null;
		ListNode prevNode = null;
		int nodeCounter = 1;

		if (left == right) {
			return head;
		}

		while (nodeCounter < left) {
			nodeCounter++;
			startNode = currentNode;
			currentNode = currentNode.next;
		}
		endNode = currentNode;

		while (nodeCounter <= right) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nodeCounter++;
		}

		if (left > 1)
			startNode.next = prevNode;
		endNode.next = nextNode;

		if (left == 1) {
			return prevNode;
		} else {
			return head;
		}
	}

}
