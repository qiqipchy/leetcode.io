import java.util.List;
import java.util.ArrayList;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		int circle, cnt = 0;
		if (matrix.length == 0)
			return list;
		int length = matrix.length > matrix[0].length ? matrix[0].length
				: matrix.length;
		if (matrix.length == 1) {
			for (int i = 0; i < matrix[0].length; i++)
				list.add(matrix[0][i]);
			return list;
		}
		if (matrix.length != 0 && matrix[0].length == 1) {
			for (int i = 0; i < matrix.length; i++)
				list.add(matrix[i][0]);
			return list;
		}
		if (length % 2 == 1)
			circle = (length + 1) / 2;
		else {
			circle = length / 2;
		}
		System.out.println(circle);
		while (cnt < circle) {

			for (int j = cnt; j < matrix[cnt].length - cnt - 1; j++)
				list.add(matrix[cnt][j]);

			for (int i = cnt; i < matrix.length - cnt - 1; i++)
				list.add(matrix[i][matrix[i].length - cnt - 1]);

			for (int j = matrix[cnt].length - cnt - 1; j > cnt; j--)
				list.add(matrix[matrix.length - cnt - 1][j]);

			for (int i = matrix.length - cnt - 1; i > cnt; i--)
				list.add(matrix[i][cnt]);

			cnt++;
		}
		if (matrix.length == matrix[0].length && matrix.length % 2 == 1)
			list.add(matrix[matrix.length / 2][matrix.length / 2]);
		return list;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 },
				{ 12, 13, 14 }, { 15, 16, 17 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		System.out.println(new Solution().spiralOrder(matrix));
	}
}
