
public class Ques242 {

	public boolean isAnagram(String s, String t) {
		if (s.equals(t)) {
			return true;
		}

		if (s.length() != t.length()) {
			return false;
		}

		StringBuilder tString = new StringBuilder(t);
		int deleteCharAt = -1;

		for (int i = 0; i < s.length(); i++) {
			deleteCharAt = tString.indexOf(s.substring(i, i + 1));
			if (deleteCharAt > -1) {
				tString.deleteCharAt(deleteCharAt);
			}
		}

		if (tString.length() > 0) {
			return false;
		}

		return true;
	}

}
