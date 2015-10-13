import java.util.Arrays;

public class Solution {
	int[][] visiti = new int[9][9];
	int[][] visitj = new int[9][9];
	int[][] visitc = new int[9][9];
	int depth = 9;
	char[][] copy = new char[depth][depth];
	boolean flag = false;
	int[][] step = { { 0, 0 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 },
			{ 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
	char[][] temp = new char[9][9];

	public void solveSudoku(char[][] board) {
		initVisitStates(board);
		solveRec(board, 0, 0, flag);
		copyArrays(temp, board);

	}

	private void copyArrays(char[][] source, char[][] copy) {
		// TODO Auto-generated method stub
		for (int k = 0; k < 9; k++)
			for (int p1 = 0; p1 < 9; p1++)
				copy[p1][k] = (char) source[p1][k];
	}

	private void initVisitStates(char[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < depth; j++) {
				if (board[i][j] != '.') {
					visiti[i][board[i][j] - '0' - 1] = 1;
					visitj[j][board[i][j] - '0' - 1] = 1;
				}
				copy[i][j] = board[i][j];
			}
		}
		int p = 0;
		for (int i = 1; i < depth; i += 3) {
			for (int j = 1; j < depth; j += 3) {
				for (int k = 0; k < 9; k++) {
					char ch = board[i + step[k][0]][j + step[k][1]];
					if (ch != '.')
						visitc[p][ch - '0' - 1] = 1;
				}
				p++;
			}
		}
	}

	private void solveRec(char[][] board, int i, int j, boolean flag) {
		// TODO Auto-generated method stub
		if (i == depth) {
			copyArrays(board, temp);
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
		for (int k = 0; k < visiti[i].length; k++) {
			int indexc = i / 3 * 3 + j / 3;

			if (visiti[i][k] == 0 && visitj[j][k] == 0
					&& visitc[indexc][k] == 0) {
				visiti[i][k] = 1;
				visitj[j][k] = 1;
				visitc[indexc][k] = 1;
				board[i][j] = (char) (k + 1 + '0');
				if (j == depth - 1) {
					solveRec(board, i + 1, 0, flag);
				} else
					solveRec(board, i, j + 1, flag);
				if (flag)
					return;
				visiti[i][k] = 0;
				visitj[j][k] = 0;
				visitc[indexc][k] = 0;
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
		for (int k = 0; k < board.length; k++)
			System.out.println(Arrays.toString(board[k]));
	}
}
