
public class Ques34_BinarySearch {

	public int[] searchRange(int[] nums, int target) {
		int valueFoundIndex = binarySearch(nums, 0, nums.length - 1, target);
		int leftIndex = valueFoundIndex;
		int rightIndex = valueFoundIndex;

		if (valueFoundIndex == -1) {
			return new int[] { -1, -1 };
		}

		int tempLeftIndex = leftIndex;
		while (tempLeftIndex != -1) {
			tempLeftIndex = binarySearch(nums, 0, tempLeftIndex - 1, target);
			if (tempLeftIndex != -1) {
				leftIndex = tempLeftIndex;
			}
		}

		int tempRightIndex = rightIndex;
		while (tempRightIndex != -1) {
			tempRightIndex = binarySearch(nums, tempRightIndex + 1, nums.length - 1, target);
			if (tempRightIndex != -1) {
				rightIndex = tempRightIndex;
			}
		}

		return new int[] { leftIndex, rightIndex };
	}

	public int binarySearch(int[] nums, int leftIndex, int rightIndex, int target) {
		while (leftIndex <= rightIndex) {
			int midIndex = Math.floorDiv(leftIndex + rightIndex, 2);
			if (nums[midIndex] == target) {
				return midIndex;
			} else if (nums[midIndex] > target) {
				rightIndex = midIndex - 1;
			} else {
				leftIndex = midIndex + 1;
			}
		}

		return -1;
	}

}
