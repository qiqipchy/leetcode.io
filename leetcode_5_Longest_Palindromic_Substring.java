package com.leetcode.twentyone;

import java.io.IOException;
import java.util.Arrays;

public class Solution {

	String string;

	public String longestPalindrome(String s) {
		if (s.length() < 2)
			return s;
		this.string = s;
		int max = 1, index = 0;
		boolean flag = false;
		for (int i = 1; i < s.length(); i++) {
			int length = this.isPalindromeByCenter(i);

			if (length > max) {
				max = length;
				index = i;

			}
		}
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				int length = isPalindrome(i);
				if (length > max) {
					max = length;
					index = i;
					flag = true;
				}
			}
		}
		System.err.println(max + " " + flag + " " + index);
		if (flag)
			return s.substring(index + 1 - max / 2, index + max / 2 + 1);
		return s.substring(index - max / 2, index + max / 2 + 1);
	}

	private int isPalindromeByCenter(int i) {
		// TODO Auto-generated method stub
		int j = i - 1, k = i + 1;
		while (j >= 0 && k < string.length()
				&& string.charAt(j) == string.charAt(k)) {
			j--;
			k++;
		}

		return k - j - 1;
	}

	private int isPalindrome(int i) {
		// TODO Auto-generated method stub
		int j = i, k = i + 1;
		while (j >= 0 && k < string.length()
				&& string.charAt(j) == string.charAt(k)) {
			j--;
			k++;
		}

		return k - j - 1;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "banana";
		// System.out.println(Integer.MAX_VALUE);
		
		System.out.println(new Solution().longestPalindrome(s));
	}
}
