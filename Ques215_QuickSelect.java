
public class Ques215_QuickSelect {

	public int findKthLargest(int[] nums, int k) {

		int arrayIndexToFind = nums.length - k;

		if (nums.length == 1) {
			return nums[0];
		}

		return quickSelect(nums, 0, nums.length - 1, arrayIndexToFind);
	}

	public int quickSelect(int[] numsArray, int leftPointer, int rightPointer, int indexToFind) {

		int partitionIndex = findPartitionIndex(numsArray, leftPointer, rightPointer);

		if (indexToFind == partitionIndex) {
			return numsArray[partitionIndex];
		} else if (indexToFind < partitionIndex) {
			return quickSelect(numsArray, leftPointer, partitionIndex - 1, indexToFind);
		} else {
			return quickSelect(numsArray, partitionIndex + 1, rightPointer, indexToFind);
		}
	}

	int findPartitionIndex(int[] numsArray, int leftPointer, int rightPointer) {
		int i = leftPointer;

		for (int j = leftPointer; j <= rightPointer; j++) {
			if (numsArray[j] <= numsArray[rightPointer]) {
				swap(numsArray, i, j);
				i++;
			}
		}

		return i - 1;
	}

	void swap(int[] numsArray, int leftPointer, int rightPointer) {
		int tempInt = numsArray[leftPointer];
		numsArray[leftPointer] = numsArray[rightPointer];
		numsArray[rightPointer] = tempInt;
	}

}
