
public class Ques844a {

	public static void main(String[] args) {
		// System.out.println("Hello world!");

		String s = "Shay##an";
		String t = "Shay#an";

		String resultStringS = reduceString(s);
		String resultStringT = reduceString(t);

		System.out.println(resultStringS);
		System.out.println(resultStringT);

		System.out.println("Both are equal: " + resultStringS.equals(resultStringT));
	}

	private static String reduceString(String t) {
		// char[] stringArrayT = t.toCharArray();

		StringBuffer resultStringT = new StringBuffer();

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != '#') {
				resultStringT.append(t.charAt(i));
			} else {
				if (resultStringT.length() > 0)
					resultStringT.deleteCharAt(resultStringT.length() - 1);
			}
		}
		return resultStringT.toString();
	}
}
