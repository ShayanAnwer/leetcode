
public class Ques11b {
	public static void main(String[] args) {

	}

	public int maxArea(int[] height) {
		int maxArea = 0;
		int calculatedMaxArea = 0;
		int leftPointer = 0;
		int rightPointer = height.length-1;
		
		while(leftPointer<rightPointer) {
			calculatedMaxArea = Math.min(height[leftPointer],height[rightPointer])*(rightPointer-leftPointer);
			maxArea = Math.max(calculatedMaxArea, maxArea);
			
			if(height[leftPointer] <= height[rightPointer]) {
				leftPointer++;
			} else if (height[rightPointer] < height[leftPointer]) {
				rightPointer--;
			}
		}
		
		return maxArea;
	}

}
