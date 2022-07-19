
public class Ques1a {
	
	public static void main(String[] args) {
		
	}
	
	
public int[] twoSum(int[] nums, int target) {
	int arrayLength = nums.length;
	int[] solution = new int[2];
	int numToFind;
	
	for (int i=0;i<arrayLength;i++) {
		numToFind = target - nums[i];
		
		for (int j=i+1; j<arrayLength ; j++) {
			if (numToFind == nums[j]) {
				solution[0]=i;
				solution[1]=j;
				return solution;
			}
		}
	}
        
	return null;
    }
}
