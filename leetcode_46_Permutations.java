package com.leetcode.JumpGameII;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	List<List<Integer>> list = new ArrayList<List<Integer>>();
	boolean[] visit;

	public List<List<Integer>> permute(int[] nums) {
		int[] numList = new int[nums.length];
		visit = new boolean[nums.length];
		permuteAll(nums, 0, numList);
		return list;

	}

	private void permuteAll(int[] nums, int depth, int[] numList) {
		// TODO Auto-generated method stub
		if (depth == nums.length) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < numList.length; i++)
				list.add(numList[i]);
			this.list.add(list);
			// System.out.println(numList + " " + depth);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!visit[i]) {
				visit[i] = true;
				numList[depth] = nums[i];
				permuteAll(nums, depth + 1, numList);
				visit[i] = false;

			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		// int[] nums = { 2, 3, 1, 1, 4 };
		long date = System.currentTimeMillis();
		System.out.println(new Solution().permute(nums));
		System.out.println(System.currentTimeMillis() - date + "---");
	}

}
