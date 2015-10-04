import java.io.IOException;
import java.util.Arrays;

public class Solution {

	public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);

		int length = nums.length;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				length--;
		}
		int[] temp = new int[length];
		for (int i = 0, j = 0; i < nums.length; i++) {
			temp[j++] = nums[i];
			while (i < nums.length - 1 && nums[i] == nums[i + 1])
				i++;
		}
		for (int i = 0; i < temp.length; i++)
			nums[i] = temp[i];
		System.out.println(Arrays.toString(nums));
		return length;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "AB";
		// System.out.println(Integer.MAX_VALUE);
		int[] nums = { 1, 1, 2, 2 };
		System.out.println(new Solution().removeDuplicates(nums));
	}
}
