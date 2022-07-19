
public class Ques876 {

	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		}

		ListNode oneHop = head;
		ListNode twoHops = head;

		while (twoHops != null) {
			if (twoHops.next != null) {
				twoHops = twoHops.next.next;
				oneHop = oneHop.next;
			} else {
				twoHops = null;
			}
		}

		return oneHop;
	}
}
