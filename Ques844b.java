
public class Ques844b {

	public static void main(String[] args) {
	}

	public boolean backspaceCompare(String s, String t) {

		int sizeS = s.length();
		int sizeT = t.length();
		int skipS = 0;
		int skipT = 0;
		int pointerS = sizeS - 1;
		int pointerT = sizeT - 1;

		while (pointerS >= 0 || pointerT >= 0) {
			skipS = 0;
			skipT = 0;

			while (pointerS >= 0) {
				if (s.charAt(pointerS) == '#') {
					skipS++;
					pointerS--;
				} else if (skipS > 0) {
					skipS--;
					pointerS--;
				} else {
					break;
				}
			}

			while (pointerT >= 0) {
				if (t.charAt(pointerT) == '#') {
					skipT++;
					pointerT--;
				} else if (skipT > 0) {
					skipT--;
					pointerT--;
				} else {
					break;
				}
			}

			if (pointerS < 0 && pointerT < 0) {
				return true;
			}

			if (pointerS >= 0 && pointerT >= 0 && s.charAt(pointerS) != t.charAt(pointerT)) {
				return false;
			} else if (pointerS >= 0 && pointerT >= 0 && s.charAt(pointerS) == t.charAt(pointerT)) {
				pointerS--;
				pointerT--;
			} else if ((pointerS >= 0 && pointerT<0 && s.charAt(pointerS) != '#') || (pointerT >= 0 && pointerS<0 && t.charAt(pointerT) != '#')) {
				return false;
			}
		}
		if (pointerS < 0 && pointerT < 0) {
			return true;
		}
		return false;
	}
}
