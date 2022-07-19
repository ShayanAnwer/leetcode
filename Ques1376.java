import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ques1376 {

	public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

		if (n == 1) {
			return 0;
		}

		Map<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < manager.length; i++) {
			if (manager[i] != -1) {
				if (!adjList.containsKey(manager[i])) {
					adjList.put(manager[i], new ArrayList<Integer>());
				}
				adjList.get(manager[i]).add(i);
			}
		}

		return calculateMinutes(headID, adjList, informTime);
	}

	public int calculateMinutes(int currentNode, Map<Integer, ArrayList<Integer>> adjList, int[] informTime) {
		int maxTime = 0;

		if (informTime[currentNode] == 0) {
			return maxTime;
		}

		for (int i = 0; i < adjList.get(currentNode).size(); i++) {
			maxTime = Math.max(maxTime, calculateMinutes(adjList.get(currentNode).get(i), adjList, informTime));
		}

		return informTime[currentNode] + maxTime;
	}

}
