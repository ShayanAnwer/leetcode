
public class Ques278 {

	public int firstBadVersion(int n) {
		if (n == 1) {
			return 1;
		}

		int startVersion = 1;
		int endVersion = n;
		int checkVersion = 0;

		while (startVersion < endVersion) {
			// checkVersion = Math.floorDiv(startVersion + endVersion, 2);
			checkVersion = startVersion + Math.floorDiv(endVersion - startVersion, 2);
			if (!isBadVersion(checkVersion)) {
				startVersion = checkVersion + 1;
			} else {
				endVersion = checkVersion;
			}

		}
		return endVersion;
	}

	public boolean isBadVersion(int checkVersion) {
		return false;
	}

}
