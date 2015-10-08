package com.leetcode.twenty_three;

import java.util.Arrays;


public class Solution {
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

	public boolean isValidSudoku(char[][] board) {

		boolean f1 = isVaildCol(board);
		boolean f2 = isVaildRow(board);
		boolean f3 = isVaildCenter(board);
		return f1 && f2 && f3;
	}

	public static void main(String[] args) {

		String[] boardString = { "9..6.....", "....6....", ".....1.3.",
				"........8", ".....8...", "...4..2..", "........1",
				"6...1....", "........." };
		char[][] board = new char[9][9];
		for (int i = 0; i < 9; i++) {
			board[i] = boardString[i].toCharArray();
		}
		System.out.println(new Solution().isValidSudoku(board));
	}
}
