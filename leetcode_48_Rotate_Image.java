public class Solution {

	public void rotate(int[][] matrix) {
		if (matrix.length == 0)
			return;
		int[][] temp = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			temp[i] = new int[matrix[i].length];
			for (int j = 0; j < matrix[i].length; j++)
				temp[i][j] = matrix[i][j];
		}

		for (int j = 0, k = 0; j < temp[0].length; j++, k++) {
			matrix[k] = new int[temp.length];
			for (int i = temp.length - 1, p = 0; i >= 0; i--, p++)
				matrix[k][p] = temp[i][j];
		}
		printMatrix(matrix);

	}

	private void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2 }, { 3, 4 } };
		// int[] nums = { 2, 3, 1, 1, 4 };
		long date = System.currentTimeMillis();
		new Solution().rotate(matrix);
		System.out.println(System.currentTimeMillis() - date + "---");
	}

}
