
public class Ques680a {

	public static void main(String[] args) {

	}

	public boolean validPalindrome(String inputString) {

		//String inputString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int leftPointer = 0;
		int rightPointer = inputString.length() - 1;

		while (leftPointer < rightPointer) {
			if (inputString.charAt(leftPointer) != inputString.charAt(rightPointer)) {
				if(checkSubstring(inputString, leftPointer + 1, rightPointer)) {
					return true;
				} else {
					return checkSubstring(inputString, leftPointer, rightPointer-1);
				}
			}
			leftPointer++;
			rightPointer--;
		}
		return true;
	}

	public boolean checkSubstring(String inputStr, int leftPtr, int rightPtr) {
		while (leftPtr < rightPtr) {
			if (inputStr.charAt(leftPtr) != inputStr.charAt(rightPtr)) {
				return false;
			}
			leftPtr++;
			rightPtr--;
		}
		return true;
	}

}
