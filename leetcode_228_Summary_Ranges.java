import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (i < nums.length) {
			int begin = i;
			while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
				i++;
			}
			//注意一个数的情况
			if (i == begin)
				list.add(String.valueOf(nums[i]));
			else {
				String s = new StringBuilder().append(nums[begin]).append("->")
						.append(nums[i]).toString();
				list.add(s);
			}
			i++;
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, 3, 6, 7, 9 ,12};
		System.out.println(new Solution().summaryRanges(nums));
	}
}
