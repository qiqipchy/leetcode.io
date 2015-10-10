import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> listString = new ArrayList<List<String>>();
		String[] temp = new String[strs.length];
		for (int i = 0; i < strs.length; i++) {
			temp[i] = strs[i];
			char[] array = strs[i].toCharArray();
			Arrays.sort(array);
			strs[i] = new String(array);
		}
		for (int i = 0; i < temp.length; i++) {
			if (strs[i] == null)
				continue;
			List<String> list = new ArrayList<String>();
			list.add(temp[i]);
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[j] == null)
					continue;
				if (strs[j].equals(strs[i])) {
					list.add(temp[j]);
					strs[j] = null;
				}
			}
			Collections.sort(list);
			listString.add(list);
		}
		return listString;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(new Solution().groupAnagrams(strs));
	}

}
