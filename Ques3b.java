import java.util.HashMap;

public class Ques3b {

	public static void main(String[] args) {

	}

	public int lengthOfLongestSubstring(String s) {

		int leftPointer = 0;
		int rightPointer = 0;
		int maxLength = 0;
		HashMap<Character, Integer> charPosition = new HashMap<Character, Integer>();
		Character currenctChar = ' ';

		while (rightPointer < s.length()) {
			currenctChar = s.charAt(rightPointer);
			if (charPosition.get(currenctChar) == null) {
				charPosition.put(currenctChar, rightPointer);
				maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
				rightPointer++;
			} else if (charPosition.get(currenctChar) != null
					&& charPosition.get(currenctChar) >= leftPointer) {
				leftPointer = charPosition.get(currenctChar) + 1;
				charPosition.put(currenctChar, rightPointer);
				rightPointer++;
			}  else if (charPosition.get(currenctChar) != null
					&& charPosition.get(currenctChar) < leftPointer) {
				charPosition.put(currenctChar, rightPointer);
				maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
				rightPointer++;
			}
		}

		return maxLength;
	}
}
