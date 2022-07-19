
public class Ques53 {

	public int maxSubArray(int[] nums) {

		int currentMax = nums[0];
		int maxOverall = nums[0];

		for (int i = 1; i < nums.length; i++) {
			currentMax = Math.max(currentMax + nums[i], nums[i]);
			maxOverall = Math.max(maxOverall, currentMax);
		}

		return maxOverall;
	}

}
