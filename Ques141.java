
public class Ques141 {

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode oneHop = head;
		ListNode twoHops = head;

		while (oneHop.next != null && twoHops.next != null && twoHops.next.next != null) {
			oneHop = oneHop.next;
			twoHops = twoHops.next.next;
			if (oneHop.equals(twoHops)) {
				return true;
			}
		}

		return false;
	}
}
