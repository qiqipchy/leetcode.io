import java.util.List;
import java.util.ArrayList;

public class Solution {
	// 需要同n节方阵区分开，其中的circle和中心填的数都是不同的地方；
	public int[][] generateMatrix(int n)

	{
		int[][] matrix = new int[n][n];
		int cnt = 0, start = 1;
		if (matrix.length == 0)
			return matrix;
		int length = matrix.length;
		int circle = (length % 2 == 1) ? (length + 1) / 2 : length / 2;

		while (cnt < circle) {

			for (int j = cnt; j < matrix[cnt].length - cnt - 1; j++)
				matrix[cnt][j] = start++;
			for (int i = cnt; i < matrix.length - cnt - 1; i++)
				matrix[i][matrix[i].length - cnt - 1] = start++;
			for (int j = matrix[cnt].length - cnt - 1; j > cnt; j--)
				matrix[matrix.length - cnt - 1][j] = start++;
			for (int i = matrix.length - cnt - 1; i > cnt; i--)
				matrix[i][cnt] = start++;
			cnt++;

		}
		// 在最后的中心需要填补一个数；
		if (matrix.length == matrix[0].length && matrix.length % 2 == 1)
			matrix[matrix.length / 2][matrix.length / 2] = start;
		return matrix;
	}

	public static void main(String[] args) {
		int n = 0;
		int[][] matrix = new int[n][n];
		matrix = (new Solution().generateMatrix(n));
		// 如何右对齐是个问题；
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print("\t\t" + matrix[i][j]);
			System.out.println();
		}
	}
}
