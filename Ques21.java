
public class Ques21 {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null && list2 == null) {
			return list1;
		} else if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}

		ListNode newHeadNode = null;
		ListNode tempNode1 = null;
		ListNode tempNode2 = null;
		ListNode lastNode1 = null;
		ListNode lastNode2 = null;

		if (list1.val <= list2.val) {
			newHeadNode = list1;
		} else {
			newHeadNode = list2;
		}

		ListNode nextNode1 = list1;
		ListNode nextNode2 = list2;

		while (nextNode1 != null && nextNode2 != null) {
			tempNode1 = nextNode1;
			tempNode2 = nextNode2;

			if (tempNode1.val <= tempNode2.val) {
				nextNode1 = tempNode1.next;
				tempNode1.next = tempNode2;
				if (lastNode1 != null) {
					lastNode1.next = tempNode1;
				}
				lastNode1 = tempNode1;
				lastNode2 = null;
			} else if (tempNode1.val > tempNode2.val) {
				nextNode2 = tempNode2.next;
				tempNode2.next = tempNode1;
				if (lastNode2 != null) {
					lastNode2.next = tempNode2;
				}
				lastNode2 = tempNode2;
				lastNode1 = null;
			}
		}

		return newHeadNode;
	}

}
