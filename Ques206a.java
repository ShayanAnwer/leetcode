
public class Ques206a {

	public ListNode reverseList(ListNode head) {
		ListNode currentNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;

		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}

		return prevNode;
	}
}
