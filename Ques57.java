import java.util.ArrayList;
import java.util.List;

public class Ques57 {

	public int[][] insert(int[][] intervals, int[] newInterval) {

		if (intervals.length == 0) {
			return new int[][] { { newInterval[0], newInterval[1] } };
		}

		List<int[]> result = new ArrayList<int[]>();
		int arrayIndex = 0;

		while (arrayIndex < intervals.length && intervals[arrayIndex][1] < newInterval[0]) {
			result.add(intervals[arrayIndex]);
			arrayIndex++;
		}

		if (arrayIndex < intervals.length) {
			if (newInterval[1] < intervals[arrayIndex][0]) {
				//nothing
			} else {
				newInterval[0] = Math.min(newInterval[0], intervals[arrayIndex][0]);
				newInterval[1] = Math.max(newInterval[1], intervals[arrayIndex][1]);
				arrayIndex++;
			}
		}

		while (arrayIndex < intervals.length && newInterval[1] >= intervals[arrayIndex][0]) {
			newInterval[1] = Math.max(newInterval[1], intervals[arrayIndex][1]);
			arrayIndex++;
		}

		result.add(new int[] { newInterval[0], newInterval[1] });

		while (arrayIndex < intervals.length) {
			result.add(intervals[arrayIndex]);
			arrayIndex++;
		}

		return result.toArray(new int[result.size()][]);
	}
}
