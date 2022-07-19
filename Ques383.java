
public class Ques383 {

	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.equals(magazine)) {
			return true;
		}

		StringBuilder magz = new StringBuilder(magazine);

		for (int i = 0; i < ransomNote.length(); i++) {
			if (magz.indexOf(ransomNote.substring(i, i + 1)) < 0) {
				return false;
			} else {
				magz.deleteCharAt(magz.indexOf(ransomNote.substring(i, i + 1)));
			}
		}

		return true;
	}

}
