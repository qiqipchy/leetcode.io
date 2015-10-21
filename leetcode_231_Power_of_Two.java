import java.util.Arrays;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n < 0)
			return false;
		//注意这里的toBinaryString函数，如果参数是负数的话，会自动转换为正数，加上2^32；
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		int index = s.indexOf('1');
		if (index == -1)
			return false;
		else {
			String s1 = s.substring(0, index);
			String s2 = s.substring(index + 1, s.length());
			if (!s1.contains("1") && !s2.contains("1"))
				return true;
			return false;
		}
	}

	public static void main(String[] args) {
		int n = -8;
		System.out.println(new Solution().isPowerOfTwo(n));
	}
}
