public class Solution {
	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int number = 0;
		if (nums.length == 0 || nums[0] > 1 || nums[nums.length - 1] <= 0)
			return 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] * nums[i - 1] < 0 && nums[i] != 1)
				return 1;
			if (nums[i - 1] >= 0 && nums[i] - nums[i - 1] > 1)
				return nums[i - 1] + 1;

		}
		return nums[nums.length - 1] + 1;

	}

	public static void main(String[] args) {

		int[] nums = { 0, 2, 2, 1, 1 };
		System.out.println(new Solution().firstMissingPositive(nums));
	}
}
