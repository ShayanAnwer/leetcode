
public class Ques200 {

	public int numIslands(char[][] grid) {

		int noOfIslands = 0;

		if (grid.length == 0) {
			return noOfIslands;
		}

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == '1') {
					noOfIslands = noOfIslands + 1;
					recursiveMethod(grid, row, col);
				}
			}
		}

		return noOfIslands;
	}

	public void recursiveMethod(char[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
			return;
		}

		if (grid[row][col] == '1') {
			grid[row][col] = '0';
		}

		recursiveMethod(grid, row + 1, col);
		recursiveMethod(grid, row, col + 1);
		recursiveMethod(grid, row - 1, col);
		recursiveMethod(grid, row, col - 1);

		return;
	}

}
