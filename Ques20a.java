import java.util.Stack;

public class Ques20a {

	public boolean isValid(String s) {
		Stack<Character> charStack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				charStack.add(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (charStack.size() == 0) {
					return false;
				}
				if (charStack.peek().equals('(')) {
					charStack.pop();
				} else if (!charStack.peek().equals('(')) {
					return false;
				}
			} else if (s.charAt(i) == '}') {
				if (charStack.size() == 0) {
					return false;
				}
				if (charStack.peek().equals('{')) {
					charStack.pop();
				} else if (!charStack.peek().equals('{')) {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (charStack.size() == 0) {
					return false;
				}
				if (charStack.peek().equals('[')) {
					charStack.pop();
				} else if (!charStack.peek().equals('[')) {
					return false;
				}
			}
		}

		if (charStack.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

}
