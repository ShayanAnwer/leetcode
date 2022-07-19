
public class Ques704 {

	public int search(int[] nums, int target) {
		int targetFoundAt = -1;
		int leftIndex = 0;
		int rightIndex = nums.length - 1;
		int midIndex = 0;

		while (leftIndex <= rightIndex) {
			midIndex = Math.floorDiv(leftIndex + rightIndex, 2);
			if (target == nums[midIndex]) {
				return midIndex;
			} else if (target > nums[midIndex]) {
				leftIndex = midIndex + 1;
			} else if (target < nums[midIndex]) {
				rightIndex = rightIndex - 1;
			}
		}

		return targetFoundAt;
	}

}
