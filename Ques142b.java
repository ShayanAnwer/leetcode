
public class Ques142b {

	public ListNode detectCycle(ListNode head) {
		ListNode firstPtr = head;
		ListNode secondPtr = head;
		boolean cycleExists = false;

		while (secondPtr != null && secondPtr.next != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next.next;
			if (secondPtr != null && secondPtr.equals(firstPtr)) {
				cycleExists = true;
				break;
			}
		}

		if (cycleExists) {
			firstPtr = head;
			while (!firstPtr.equals(secondPtr)) {
				firstPtr = firstPtr.next;
				secondPtr = secondPtr.next;
			}
			return firstPtr;
		}

		return null;
	}
}
