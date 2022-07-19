import java.util.LinkedList;
import java.util.Queue;

public class Ques994 {

	public int orangesRotting(int[][] grid) {
		int seconds = 0;
		int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		int x, y, m, n, queueSize;
		int[] rottenOrange;

		if (grid == null || grid.length == 0) {
			return seconds;
		}

		int freshOranges = 0;
		Queue<int[]> rottenQueue = new LinkedList<int[]>();

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 2) {
					rottenQueue.offer(new int[] { row, col });
				} else if (grid[row][col] == 1) {
					freshOranges = freshOranges + 1;
				}
			}
		}

		if (freshOranges == 0) {
			return seconds;
		}
		if (rottenQueue.size() == 0) {
			return -1;
		}

		while (!rottenQueue.isEmpty()) {
			x = y = m = n = 0;
			seconds = seconds + 1;
			queueSize = rottenQueue.size();

			for (int q = 0; q < queueSize; q++) {
				rottenOrange = rottenQueue.poll();
				x = rottenOrange[0];
				y = rottenOrange[1];

				for (int i = 0; i < directions.length; i++) {
					m = x + directions[i][0];
					n = y + directions[i][1];

					if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == 0 || grid[m][n] == 2)
						continue;

					if (grid[m][n] == 1) {
						grid[m][n] = 2;
						rottenQueue.offer(new int[] { m, n });
						freshOranges = freshOranges - 1;
					}
				}
			}
		}

		if (freshOranges > 0) {
			return -1;
		}

		return seconds - 1;
	}

}
