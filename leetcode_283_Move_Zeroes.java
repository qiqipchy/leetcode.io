import java.util.Arrays;

public class Solution {
	public void moveZeroes(int[] nums) {
		int index;
		for (int i = 0; i < nums.length; i++) {
			// System.out.println(i);
			if (nums[i] == 0) {
				index = i + 1;
				// index是不为0的第一位
				while (index < nums.length && nums[index] == 0)
					index++;
				// 如果index到头了，而且数组的最后一位为0，则说明可以结束了
				if (index == nums.length && nums[index - 1] == 0)
					return;
				// j表示从index这里往前覆盖
				int j = index;
				// 从为0的第i位开始覆盖，一直将不为0的部分前移完毕
				while (j < nums.length && nums[j] != 0)
					nums[i++] = nums[j++];
				int k = i;
				// j为0的第一位，需要将其中间填补为0；
				while (k < j)
					nums[k++] = 0;
				i = i - 1;

			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 0, 0 };
		new Solution().moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
