
public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {

		int width = 0, height = 0;
		if (E <= A && (A <= G && G <= C))
			width = G - A;
		else if ((A <= E && E <= C) && (A <= G && G <= C))
			width = G - E;
		else if ((A <= E && E <= C) && G >= C)
			width = C - E;
		else if (E <= A && C <= G)
			width = C - A;

		if (F <= B && (B <= H && H <= D))
			height = H - B;
		else if ((B <= F && F <= D) && (B <= H && H <= D))
			height = H - F;
		else if ((B <= F && F <= D) && H >= D)
			height = D - F;
		else if (F <= B && D <= H)
			height = D - B;
//		System.out.println(width);
//		System.out.println(height);
		return (A - C) * (B - D) + (E - G) * (F - H) - width * height;
	}

	public static void main(String[] args) {
		int A = -3;
		int B = -3;
		int C = 3;
		int D = 3;
		int E = -5;
		int F = -2;
		int G = 0;
		int H = 1;

		System.out.println(new Solution().computeArea(A, B, C, D, E, F, G, H));
	}
}
