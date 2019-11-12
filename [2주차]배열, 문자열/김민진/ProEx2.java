package two;

class Solution {
	public boolean solution(String s) {
		// 하나의 문자열이 다른 문자열의 접두어가 되는지
		
	      boolean answer = true;
	      return answer;
	  }
}

public class ProEx2 {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("119"));
//		System.out.println(Test("ab","abcd"));
	}
	
	
	
	static boolean Test(String a, String b) {
		boolean answer = false;
		if(a.length() > b.length()) return answer;
		// 위의 조건을 지나고 나면 a의 길이는 b와 같거나 작은 관계다.
	    // 현재 a.length() <= b.length() 인 상태
	    // b의 문자열을 a의 길이만큼 자른다. (앞에서부터)
	    // 잘라진 c라는 문자열과 a라는 문자열이 서로 같은지 확인한다.
	    // 같다면 true, 아니라면 false
		
		return answer;
	}
}
