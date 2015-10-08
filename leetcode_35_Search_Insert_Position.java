public class Solution {
	public int searchInsert(int[] nums, int target) {
		int index = Arrays.binarySearch(nums, target);
		if (index < 0)
			index = -index - 1;
		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 6, 90 };
		int target = 4;
		System.out.println(new Solution().searchInsert(nums, target));
	}
}
