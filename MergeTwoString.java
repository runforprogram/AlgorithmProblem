import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*合并两个字符串，合并后字符串中没有重复的字符，并按照ascii大小从小到大排列
 * 
 * */
public class MergeTwoString {
	public static String merge(String str1, String str2) {
		StringBuilder str = new StringBuilder();
		Set set = new HashSet<>();
		for (int i = 0; i < str2.length(); i++) {
			set.add(str2.charAt(i));
		}

		for (int i = 0; i < str1.length(); i++) {
			set.add(str1.charAt(i));
		}
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			str.append(iterator.next());
		}
		char[] chars = new char[str.length()];
		chars = str.toString().toCharArray();
		// 使用冒泡排序
		int tmp;
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length - i - 1; j++) {
				if (chars[j] > chars[j + 1]) {
					tmp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = (char) tmp;
				}
			}
		}
		System.out.println("result="+new String(chars));
		return new String(chars);

	}
}
