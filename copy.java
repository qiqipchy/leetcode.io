import java.util.Arrays;

public class Solution {
	boolean[][] visit = new boolean[9][9];
	boolean[][] visitj = new boolean[9][9];

	Soduku sodoku = new Soduku();
	int depth = 9;
	char[][] copy = new char[depth][depth];
	boolean flag = false;

	public void solveSudoku(char[][] board) {
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < depth; j++) {
				if (board[i][j] != '.') {
					visit[i][board[i][j] - '0' - 1] = true;
					visitj[j][board[i][j] - '0' - 1] = true;

				}

				copy[i][j] = board[i][j];
			}
		}
		// for (int i = 0; i < 9; i++)
		// System.out.println(Arrays.toString(board[i]));
		// System.out.println("---------------------------");
		// for (int i = 0; i < 9; i++)
		// System.out.println(Arrays.toString(visit[i]));
		// System.out.println("---------------------------");
		solveRec(board, 0, 0, flag);
		for (int i = 0; i < 9; i++)
			System.out.println(Arrays.toString(board[i]));
		System.out.println("---------------------------");

	}

	private void solveRec(char[][] board, int i, int j, boolean flag) {
		// TODO Auto-generated method stub

		if (i == depth) {
			for (int k = 0; k < board.length; k++)
				System.out.println(Arrays.toString(board[k]));
			for (int k = 0; k < board.length; k++)
				System.out.println(Arrays.toString(copy[k]));
			System.out.println("----------------");
			if (sodoku.isVaildCenter(board))
				flag = true;
			return;
		}
		if (copy[i][j] != '.') {
			if (j == depth - 1) {

				solveRec(board, i + 1, 0, flag);
			} else
				solveRec(board, i, j + 1, flag);
return;
		}
		for (int k = 0; k < visit[i].length; k++) {
			if (flag)
				return;
			if (!visit[i][k] && !visitj[j][k]) {
				visit[i][k] = true;
				visitj[j][k] = true;
				board[i][j] = (char) (k + 1 + '0');
				if (j == depth - 1) {
					solveRec(board, i + 1, 0, flag);
				} else
					solveRec(board, i, j + 1, flag);
				visit[i][k] = false;
				visitj[j][k] = false;
			}
		}
	}

	public static void main(String[] args) {
		String[] strings = { "..9748...", "7........", ".2.1.9...",
				"..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.",
				"........6", "...2759.." };
		char[][] board = new char[9][9];
		for (int i = 0; i < 9; i++)
			board[i] = strings[i].toCharArray();

		new Solution().solveSudoku(board);
	}
}

class Soduku {
	boolean[] visit = new boolean[10];
	int depth = 9;
	int[][] step = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 },
			{ 1, -1 }, { 1, 0 }, { 1, 1 } };

	public boolean isVaildRow(char[][] board) {
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < depth; j++) {
				if (Character.isDigit(board[i][j])) {
					if (!visit[board[i][j] - '0'])
						visit[board[i][j] - '0'] = true;
					else
						return false;
				}
			}
			for (int k = 0; k < 10; k++)
				visit[k] = false;

		}
		for (int k = 0; k < 10; k++)
			visit[k] = false;
		return true;
	}

	public boolean isVaildCol(char[][] board) {
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < depth; j++) {
				if (Character.isDigit(board[j][i])) {
					if (!visit[board[j][i] - '0'])
						visit[board[j][i] - '0'] = true;
					else
						return false;
				}
			}
			for (int k = 0; k < 10; k++)
				visit[k] = false;
		}
		for (int k = 0; k < 10; k++)
			visit[k] = false;
		return true;
	}

	public boolean isVaildCenter(char[][] board) {
		for (int i = 1; i < depth; i += 3) {
			for (int j = 1; j < depth; j += 3) {
				if (Character.isDigit(board[i][j]))
					visit[board[i][j] - '0'] = true;
				for (int p = 0; p < 8; p++) {
					int indexi = i + step[p][0];
					int indexj = j + step[p][1];
					// System.out.println(i + " " + j + " " + indexi + " "
					// + indexj);
					if (Character.isDigit(board[indexi][indexj])) {
						if (!visit[board[indexi][indexj] - '0'])
							visit[board[indexi][indexj] - '0'] = true;
						else
							return false;
					}
				}
				for (int k = 1; k < 10; k++)
					visit[k] = false;
			}
		}
		return true;
	}
}
