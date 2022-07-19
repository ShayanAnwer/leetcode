import java.util.Stack;

public class Ques12a {

	Stack<Integer> pushStack = new Stack<Integer>();
	Stack<Integer> popStack = new Stack<Integer>();

	public Ques12a() {
	}

	public void push(int x) {
		pushStack.push(x);
	}

	public int pop() {

		if (!popStack.empty()) {
			return popStack.pop();
		} else if (popStack.empty() && pushStack.empty()) {
			return -1;
		} else if (popStack.empty() && !pushStack.empty()) {
			while (pushStack.size() > 0) {
				popStack.push(pushStack.pop());
			}
			return popStack.pop();
		}

		return -1;
	}

	public int peek() {
		if (!popStack.empty()) {
			return popStack.peek();
		} else if (popStack.empty() && pushStack.empty()) {
			return -1;
		} else if (popStack.empty() && !pushStack.empty()) {
			while (pushStack.size() > 0) {
				popStack.push(pushStack.pop());
			}
			return popStack.peek();
		}

		return -1;
	}

	public boolean empty() {
		return (pushStack.empty() && popStack.empty());
	}

}
