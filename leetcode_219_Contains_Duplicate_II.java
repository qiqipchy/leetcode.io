import java.util.Arrays;

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			temp[i] = nums[i];
		Arrays.sort(nums);
		boolean flag = false;
		// 如果没有重复的元素，k又接近于n时，复杂度接近于n^2;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return false;
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = i + 1; j <= i + k && j < temp.length; j++)
				if (temp[j] == temp[i])
					return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 2, -1 };
		int k = 5;
		System.out.println(new Solution().containsNearbyDuplicate(nums, 1));
	}
}
