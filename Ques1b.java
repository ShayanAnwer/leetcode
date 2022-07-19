import java.util.HashMap;

public class Ques1b {
	
public static void main(String[] args) {
	
	}
	
	
public int[] twoSum(int[] nums, int target) {
	HashMap<Integer, Integer> solutionMap = new HashMap<Integer, Integer>();
	int numberToFind;
	
	for(int i=0; i<nums.length;i++) {
		numberToFind = target-nums[i];
		if(solutionMap.get(numberToFind)!=null) {
			return new int[] {i,solutionMap.get(numberToFind).intValue()};
		} else {
			solutionMap.put(nums[i], i);
		}
	}
	
	return null;
}

}
