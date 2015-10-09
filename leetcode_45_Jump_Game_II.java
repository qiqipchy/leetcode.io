package com.leetcode.JumpGameII;


public class Solution {

	int min = Integer.MAX_VALUE;
	int[] nums;

	// 没想到我也会AC这道题，，，，从当初的深度搜索到限定了步数的深度搜索，再到对nums[i]的贪心，最后确定是对nums[i]+i
	// 的贪心算法；
	public int jump(int[] nums) {
		this.nums = nums;
		if (nums.length == 1)
			return 0;
		int begin = 0, count = 0;
		while (begin < nums.length) {
			begin = findMax(begin);
			if (begin == nums.length - 1)
				break;
			count++;
		}
		return count;
	}

	private int findMax(int begin) {
		// TODO Auto-generated method stub
		int index = begin, max = Integer.MIN_VALUE;
		int i;
		for (i = begin + 1; i < nums.length && i <= begin + nums[begin]; i++) {
			if (nums[i] + i >= max) {
				index = i;
				max = nums[i] + i;
			}
		}
		if (i >= nums.length)
			index = nums.length;
		return index;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1 };
		// int[] nums = { 2, 3, 1, 1, 4 };
		long date = System.currentTimeMillis();
		System.out.println(new Solution().jump(nums));
		System.out.println(System.currentTimeMillis() - date + "---");
	}

}
