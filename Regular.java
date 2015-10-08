package com.leetcode.twentyone;

public class Solution {
	public boolean isMatch(String s, String p) {
		if (p.equals(s))
			return true;
		if (!p.contains("*")) {
			if (s.length() != p.length())
				return false;
			int i = 0;
			while (i < s.length()
					&& (s.charAt(i) == p.charAt(i) || p.charAt(i) == '?'))
				i++;
			if (i != s.length())
				return false;
			return true;
		}

		String[] strings = s.split("\\*");
		for(int j=0;j<strings.length;j++)
		{
			if(this.containsSub(s, string[j]))
		}

		return false;
	}

	public int containsSub(String s, String p) {
		int flag = 0;
		int i = s.length() - 1, j = p.length() - 1;
		while (i >= 0) {
			int k = i;
			while (j >= 0 && k >= 0
					&& (s.charAt(k) == p.charAt(j) || s.charAt(k) == '.')) {
				k--;
				j--;
				flag = 1;
			}
			i--;
			if (j != 0 || flag == 0) {

				j = p.length() - 1;
			} else
				return k;
		}
		if (j != 0)
			return -1;
		else {
			int length = p.length() < s.length() ? p.length() : s.length();
			if (s.substring(0, length).equals(p))
				return i;
			else
				return -1;
		}
	}

	public static void main(String[] args) {

	}
}
