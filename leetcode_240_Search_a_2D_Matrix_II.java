import java.util.Arrays;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			int max = matrix[i][matrix[i].length - 1];
			if (target > max)
				continue;
			else if (target == max)
				return true;
			else {
				if (target < matrix[i][0])
					return false;
				for (int j = 0; j < matrix[i].length; j++)
					if (target == matrix[i][j])
						return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5 } };
		int target = 3;
		System.out.println(new Solution().searchMatrix(matrix, target));
	}
}
