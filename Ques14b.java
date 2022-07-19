
public class Ques14b {

	public static void main(String[] args) {

	}

	public int trap(int[] height) {
		int leftIndex = 0;
		int rightIndex = height.length - 1;
		int maxLeft = 0;
		int maxRight = 0;
		int currentWater = 0;
		int total = 0;
		
		while (leftIndex < rightIndex) {
			currentWater = 0;
			
			if(height[leftIndex] <= height[rightIndex]) {
				if(height[leftIndex] > maxLeft) {
					maxLeft = height[leftIndex];
				} else if(height[leftIndex] < maxLeft) {
					currentWater = maxLeft - height[leftIndex];
					total = total + currentWater;
				}
				leftIndex++;
			} else if(height[rightIndex] < height[leftIndex]) {
				if(height[rightIndex] > maxRight) {
					maxRight = height[rightIndex];
				} else if(height[rightIndex] < maxRight) {
					currentWater = maxRight - height[rightIndex];
					total = total + currentWater;
				}
				rightIndex--;
			}
		}

		return total;
	}

}
