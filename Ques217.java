import java.util.HashSet;
import java.util.Set;

public class Ques217 {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> numsSet = new HashSet<Integer>();

		for (int number : nums) {
			if (!numsSet.add(number)) {
				return true;
			}
		}

		return false;
	}

}
