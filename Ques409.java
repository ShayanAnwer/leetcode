import java.util.HashSet;
import java.util.Set;

public class Ques409 {

	public int longestPalindrome(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}
		int result = 0;

		Set<Character> charSet = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (charSet.contains(s.charAt(i))) {
				result++;
				charSet.remove(s.charAt(i));
			} else {
				charSet.add(s.charAt(i));
			}
		}

		if (charSet.isEmpty()) {
			return 2 * result;
		} else {
			return (2 * result) + 1;
		}
	}

}
