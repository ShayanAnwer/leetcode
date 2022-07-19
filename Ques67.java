
public class Ques67 {

	public String addBinary(String a, String b) {

		int maxLength = Math.max(a.length(), b.length());
		boolean carryover = false;
		StringBuilder result = new StringBuilder();
		StringBuilder aString = new StringBuilder(a);
		StringBuilder bString = new StringBuilder(b);

		while (aString.length() != bString.length()) {
			if (aString.length() < bString.length()) {
				aString.insert(0, "0");
			} else if (bString.length() < aString.length()) {
				bString.insert(0, "0");
			}
		}

		for (int i = maxLength - 1; i > -1; i--) {
			if (aString.charAt(i) == '0' && bString.charAt(i) == '0') {
				if (!carryover) {
					result = result.insert(0, "0");
				} else if (carryover) {
					result = result.insert(0, "1");
					carryover = false;
				}
			} else if ((aString.charAt(i) == '0' && bString.charAt(i) == '1')
					|| (aString.charAt(i) == '1' && bString.charAt(i) == '0')) {
				if (!carryover) {
					result = result.insert(0, "1");
				} else if (carryover) {
					result = result.insert(0, "0");
				}
			} else if (aString.charAt(i) == '1' && bString.charAt(i) == '1') {
				if (!carryover) {
					result = result.insert(0, "0");
				} else if (carryover) {
					result = result.insert(0, "1");
				}
				carryover = true;
			}
		}

		if (!carryover) {
			return result.toString();
		} else {
			result = result.insert(0, "1");
			return result.toString();
		}
	}
}
