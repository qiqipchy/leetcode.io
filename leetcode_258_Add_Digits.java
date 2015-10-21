import java.util.Arrays;

public class Solution {
	//求的叫做数根
	public int addDigits(int num) {
		int sum = 0;
		while (true) {
			sum = 0;
			for (; num > 0; num /= 10) {
				sum = sum + num % 10;
			}
			// System.out.println("sum: " + sum + " num: " + num);
			if (sum <= 9)
				return sum;
			num = sum;

		}
		// 这才是比较机智的解法！！！公式法；
		// return (num - 1) % 9 + 1;
	}

	public static void main(String[] args) {
		int num = 6666;
		System.out.println(new Solution().addDigits(num));
	}
}
