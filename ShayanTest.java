import java.util.Arrays;

public class ShayanTest {

	public static void main(String[] args) {
		
		String input = "shayan";
		
		System.out.println(input.charAt(input.length()));
		
		/*
		 * StringBuilder inputString = new StringBuilder("start");
		 * 
		 * inputString.insert(0, "A"); System.out.println(inputString.toString());
		 * 
		 * inputString.insert(0, "B"); System.out.println(inputString.toString());
		 */
		/*
		 * String s="smart"; String t="marks";
		 * 
		 * System.out.println("-->"+s.substring(0, 0));
		 * System.out.println("-->"+s.substring(4, 5));
		 */
		/*
		 * StringBuilder tString = new StringBuilder(t); int deleteCharAt=-1;
		 * 
		 * for (int i = 0; i < s.length(); i++) { //System.out.println(s.substring(i,
		 * i+1)); //System.out.println(tString.indexOf(s.substring(i, i+1)));
		 * deleteCharAt = tString.indexOf(s.substring(i, i+1)); if(deleteCharAt>-1) {
		 * tString.deleteCharAt(deleteCharAt); } }
		 * 
		 * System.out.println("Length of t-->"+tString.length()); if (tString.length()
		 * == 0) { System.out.println("Anagram"); } else {
		 * System.out.println("-->"+tString.toString()+"<--"); }
		 */
		

		
		/*
		 * int[][] twoDArray = new int[3][5];
		 * 
		 * twoDArray[0][0] = 1; twoDArray[0][1] = 2; twoDArray[0][2] = 3;
		 * twoDArray[0][3] = 4; twoDArray[0][4] = 5;
		 * 
		 * twoDArray[1][0] = 11; twoDArray[1][1] = 12; twoDArray[1][2] = 13;
		 * twoDArray[1][3] = 14; twoDArray[1][4] = 15;
		 * 
		 * twoDArray[2][0] = 21; twoDArray[2][1] = 22; twoDArray[2][2] = 23;
		 * twoDArray[2][3] = 24; twoDArray[2][4] = 25;
		 * 
		 * System.out.println("Size of X-->"+twoDArray.length);
		 * System.out.println("Size of Y-->"+twoDArray[0].length);
		 */

		/*
		 * String[] numberArray = new String[] { "abc", "xyz", "shayan", "anwer", "null"
		 * };
		 * 
		 * Arrays.sort(numberArray); System.out.println(numberArray);
		 * 
		 * for (String i : numberArray) System.out.println(i);
		 */
		
		/*
		 * String input = "A man, a plan, a canal: Panama"; System.out.println(input);
		 * System.out.println(input.replaceAll("[^a-zA-Z0-9]",""));
		 * System.out.println(input.replaceAll("[^a-zA-Z0-9]","").toLowerCase());
		 */
		
		/*
		 * StringBuilder myString = new StringBuilder(); myString.append('#');
		 * myString.append('#'); System.out.println(myString.toString());
		 * 
		 * System.out.println(myString.indexOf("#")); while (myString.indexOf("#") > 0)
		 * { myString.deleteCharAt(myString.indexOf("#")); }
		 * System.out.println(myString.toString());
		 */
		/*
		 * int rootHeight = 2; int count = ((int)(Math.pow(2, rootHeight))) - 1;
		 * 
		 * System.out.println(count);
		 */
		
		/*
		 * int input = 5; double leftBoundary = Double.NEGATIVE_INFINITY; double
		 * rightBoundary = Double.POSITIVE_INFINITY;
		 * 
		 * boolean result = input < rightBoundary;
		 * 
		 * System.out.println("Result: "+ result);
		 */
	}
}