import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ques207 {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if ((prerequisites.length == 0) || (numCourses == 1) || (numCourses == 2 && prerequisites.length == 1)) {
			return true;
		}

		int[] indegreeArray = new int[numCourses];
		Map<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();
		int[] tempPre;

		for (int i = 0; i < prerequisites.length; i++) {
			tempPre = prerequisites[i];
			indegreeArray[tempPre[0]]++;
			if (!adjacencyList.containsKey(tempPre[1])) {
				adjacencyList.put(tempPre[1], new ArrayList<Integer>());
			}
			adjacencyList.get(tempPre[1]).add(tempPre[0]);
		}

		Stack<Integer> zeroIndegreeStack = new Stack<Integer>();
		for (int j = 0; j < numCourses; j++) {
			if (indegreeArray[j] == 0) {
				zeroIndegreeStack.add(j);
			}
		}

		int count = 0;
		while (zeroIndegreeStack.size() > 0) {
			int currentCourse = zeroIndegreeStack.pop();
			count++;
			ArrayList<Integer> currentAjL = adjacencyList.get(currentCourse);
			if (currentAjL != null) {
				for (int k = 0; k < currentAjL.size(); k++) {
					indegreeArray[currentAjL.get(k)]--;
					if (indegreeArray[currentAjL.get(k)] == 0) {
						zeroIndegreeStack.push(currentAjL.get(k));
					}
				}
			}
		}

		return (count == numCourses);
	}

}
