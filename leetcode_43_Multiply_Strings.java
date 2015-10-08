import java.math.BigDecimal;

public class Solution {
	public String multiply(String num1, String num2) {
		BigDecimal num = new BigDecimal(num1.toCharArray());
		BigDecimal num11 = new BigDecimal(num2.toCharArray());
		return num.multiply(num11).toString();
	}

	public static void main(String[] args) {

		String num1 = "12.4";
		String num2 = "1234";
		System.out.println(new Solution().multiply(num1, num2));
	}
}
