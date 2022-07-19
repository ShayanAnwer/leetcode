import java.util.Stack;

public class Ques1249a {

	public String minRemoveToMakeValida(String s) {
		StringBuilder inputString = new StringBuilder();
		Stack<Integer> indexStack = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				indexStack.push(i);
				inputString.append(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!indexStack.empty()) {
					indexStack.pop();
					inputString.append(s.charAt(i));
				} else if (indexStack.empty()) {
					inputString.append('#');
				}
			} else {
				inputString.append(s.charAt(i));
			}
		}

		while (!indexStack.empty()) {
			inputString.deleteCharAt(indexStack.peek());
			indexStack.pop();
		}

		while (inputString.indexOf("#") >= 0) {
			inputString.deleteCharAt(inputString.indexOf("#"));
		}

		return inputString.toString();
	}
	
	public String minRemoveToMakeValid(String s) {
		StringBuilder inputString = new StringBuilder();
		Stack<Integer> openStack = new Stack<Integer>();
		Stack<Integer> closeStack = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				openStack.push(i);
				inputString.append(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!openStack.empty()) {
					openStack.pop();
					inputString.append(s.charAt(i));
				} else if (openStack.empty()) {
					closeStack.push(i);
					inputString.append(s.charAt(i));
				}
			} else {
				inputString.append(s.charAt(i));
			}
		}

		while (!openStack.empty()) {
			inputString.deleteCharAt(openStack.peek());
			openStack.pop();
		}

		while (!closeStack.empty()) {
			inputString.deleteCharAt(closeStack.peek());
			closeStack.pop();
		}

		return inputString.toString();
	}

}
