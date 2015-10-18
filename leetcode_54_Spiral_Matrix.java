import java.util.List;
import java.util.ArrayList;

public class Solution {
	// 需要同n节方阵区分开，其中的circle和中心填的数都是不同的地方；
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		if (matrix.length == 0)
			return list;
		int length = matrix.length > matrix[0].length ? matrix[0].length
				: matrix.length;
		int circle = (length % 2 == 1) ? (length + 1) / 2 : length / 2;

		while (cnt < circle) {

			int j1, i1, j2, i2;
			for (j1 = cnt; j1 < matrix[cnt].length - cnt - 1; j1++)
				list.add(matrix[cnt][j1]);

			for (i1 = cnt; i1 < matrix.length - cnt - 1; i1++)
				list.add(matrix[i1][matrix[i1].length - cnt - 1]);

			// 注意单行的时候，i没有变过；
			if (i1 == cnt) {
				list.add(matrix[cnt][j1++]);
				return list;
			}

			for (j2 = matrix[cnt].length - cnt - 1; j2 > cnt; j2--)
				list.add(matrix[matrix.length - cnt - 1][j2]);

			// 注意单列的时候，j没有变过；
			if (j2 == matrix[cnt].length - cnt - 1) {
				list.add(matrix[i1][matrix[i1].length - cnt - 1]);
				return list;
			}
			for (i2 = matrix.length - cnt - 1; i2 > cnt; i2--)
				list.add(matrix[i2][cnt]);
			cnt++;

		}
		// 在最后的中心需要填补一个数；
		if (matrix.length == matrix[0].length && matrix.length % 2 == 1)
			list.add(matrix[matrix.length / 2][matrix.length / 2]);
		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 12 }, { 2, 3, 4, 5, 14 },
				{ 3, 4, 5, 6, 15 }, { 4, 5, 6, 7, 16 }, { 8, 9, 10, 11, 17 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		System.out.println(new Solution().spiralOrder(matrix));
	}
}
