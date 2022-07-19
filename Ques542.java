import java.util.ArrayDeque;
import java.util.Queue;

public class Ques542 {

	public int[][] updateMatrix(int[][] mat) {
		if (mat == null || (mat.length == 1 && mat[0].length == 1)) {
			return mat;
		}

		Queue<int[]> processingQueue = new ArrayDeque<int[]>();
		int[] direction = { 0, 1, 0, -1, 0 };

		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				if (mat[row][col] == 0) {
					processingQueue.offer(new int[] { row, col });
				} else {
					mat[row][col] = -1;
				}
			}
		}

		while (!processingQueue.isEmpty()) {
			int[] processingBlock = processingQueue.poll();
			int processingRow = processingBlock[0];
			int processingCol = processingBlock[1];

			for (int i = 0; i < 4; i++) {
				int neighboringRow = processingRow + direction[i];
				int neighboringCol = processingCol + direction[i + 1];
				if (neighboringRow < 0 || neighboringRow >= mat.length || neighboringCol < 0
						|| neighboringCol >= mat[processingRow].length || mat[neighboringRow][neighboringCol] != -1) {
					continue;
				} else if (mat[neighboringRow][neighboringCol] == -1) {
					mat[neighboringRow][neighboringCol] = mat[processingRow][processingCol] + 1;
					processingQueue.offer(new int[] { neighboringRow, neighboringCol });
				}
			}
		}

		return mat;
	}

}
