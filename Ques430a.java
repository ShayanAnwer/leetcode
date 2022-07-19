
public class Ques430a {

	public Node flatten(Node head) {

		Node currentNode = head;
		Node childNode = null;

		while (currentNode != null) {
			if (currentNode.child != null) {
				childNode = currentNode.child;
				while (childNode.next != null) {
					childNode = childNode.next;
				}
				childNode.next = currentNode.next;
				if(currentNode.next!=null) {
					currentNode.next.prev = childNode;
				}
				currentNode.next = currentNode.child;
				currentNode.next.prev = currentNode;
				currentNode.child = null;
			}
			currentNode = currentNode.next;
		}

		return head;
	}
}
