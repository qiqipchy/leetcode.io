package com.leetcode.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Definition for singly-linked list. 

public class Solution {

	public boolean isValid(String s) {
		char[] stack = new char[s.length() / 2 + 1];
		int top = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{')
				stack[++top] = ch;
			else {
				if (top < 0)
					return false;
				if (isPipei(ch, stack[top]))
					top--;
				else
					return false;
			}
		}
		if (top == -1)
			return true;
		return false;
	}

	private boolean isPipei(char ch, char c) {
		// TODO Auto-generated method stub
		if (ch == ')' && c == '(')
			return true;
		if (ch == ']' && c == '[')
			return true;
		if (ch == '}' && c == '{')
			return true;

		return false;
	}


	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{}][}}{[))){}{}){(}]))})[({";
		System.out.println(new Solution().isValid(s));
	
	}
}
