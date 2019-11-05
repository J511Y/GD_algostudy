package study2;

class Solution2 {
	public boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		} else {
			for (char c = 'a'; c <= 'z'; c++) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == c) {
						return false;
					}
				}
			}
			return true;
		}
	}
}

public class Pro_12918 {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution("a234"));
		System.out.println(s.solution("abcd"));
		System.out.println(s.solution("a123123"));
		System.out.println(s.solution("1234"));
	}
}
