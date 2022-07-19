
public class Ques14a {

	public static void main(String[] args) {

	}

	public int trap(int[] height) {
		int maxLeft = 0;
		int maxRight = 0;
		int minHeight = 0;
		int currentWater = 0;
		int total = 0;

		for (int current = 0; current < height.length; current++) {
			maxLeft = 0;
			maxRight = 0;
			for (int left = 0; left < current; left++) {
				maxLeft = Math.max(maxLeft, height[left]);
			}
			for (int right = current + 1; right < height.length; right++) {
				maxRight = Math.max(maxRight, height[right]);
			}
			minHeight = Math.min(maxLeft, maxRight);
			currentWater = minHeight - height[current];

			if (currentWater > 0)
				total = total + currentWater;
		}

		return total;
	}

}
