
public class Class973 {

	public int[][] kClosest(int[][] points, int k) {
		
		if(points.length == k) {
			return points;
		}

		sort(points, 0, points.length - 1, k);

		int[][] result = new int[k][2];

		for (int i = 0; i < k; i++) {
			result[i] = points[i];
		}

		return result;
	}

	public void sort(int[][] points, int left, int right, int k) {

		int partition = findPartition(points, left, right);

		if (k == partition) {
			return;
		} else if (k < partition) {
			sort(points, left, partition - 1, k);
		} else if (k > partition) {
			sort(points, partition + 1, right, k);
		}
	}

	public int findPartition(int[][] points, int left, int right) {
		int i = left;
		int distOfRight = points[right][0] * points[right][0] + points[right][1] * points[right][1];
		int distOfCurrPt = 0;

		for (int j = left; j < right; j++) {
			distOfCurrPt = points[j][0] * points[j][0] + points[j][1] * points[j][1];
			if (distOfCurrPt <= distOfRight) {
				int[] temp = points[i];
				points[i] = points[j];
				points[j] = temp;
				i++;
			}
		}

		int[] temp = points[i];
		points[i] = points[right];
		points[right] = temp;

		return i;
	}

}
