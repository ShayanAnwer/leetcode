
public class Ques11a {
	public static void main(String[] args) {

	}

	public int maxArea(int[] height) {

		int maxArea = 0;
		int calculatedMaxArea = 0;

		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				calculatedMaxArea = Math.min(height[i], height[j]) * (j - i);
				maxArea = Math.max(calculatedMaxArea,maxArea);
			}
		}

		return maxArea;
	}
}
