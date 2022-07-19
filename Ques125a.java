
public class Ques125a {
	
	public static void main(String[] args) {

	}
	
public boolean isPalindrome(String s) {
	
	String inputString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	int leftPointer = 0;
	int rightPointer = inputString.length()-1;
	
	while (leftPointer < rightPointer) {
		if (inputString.charAt(leftPointer) != inputString.charAt(rightPointer)) {
			return false;
		}
		leftPointer++;
		rightPointer--;
	}
	return true;
    }

}
