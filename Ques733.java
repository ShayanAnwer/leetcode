
public class Ques733 {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {

		if (image[sr][sc] == color) {
			return image;
		}

		return fillColor(image, sr, sc, image[sr][sc], color);
	}

	public int[][] fillColor(int[][] image, int sr, int sc, int oldColor, int newColor) {
		image[sr][sc] = newColor;

		if (sr - 1 > -1 && image[sr - 1][sc] == oldColor) {
			image = fillColor(image, sr - 1, sc, oldColor, newColor);
		}
		if (sc + 1 < image[sr].length && image[sr][sc + 1] == oldColor) {
			image = fillColor(image, sr, sc + 1, oldColor, newColor);
		}
		if (sr + 1 < image.length && image[sr + 1][sc] == oldColor) {
			image = fillColor(image, sr + 1, sc, oldColor, newColor);
		}
		if (sc - 1 > -1 && image[sr][sc - 1] == oldColor) {
			image = fillColor(image, sr, sc - 1, oldColor, newColor);
		}

		return image;
	}

}
