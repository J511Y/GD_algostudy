package study2;

class Solution3{
	boolean solution (String s) {
		 boolean answer = true;
		 int pcnt =0;
		 int ycnt =0;
		 for (int i = 0; i < s.length(); i++) {
			String str = String.valueOf(s.charAt(i));
			if(str.equalsIgnoreCase("p")) {
				pcnt++;
			}
			if(str.equalsIgnoreCase("y")) {
				ycnt++;
			}
		 }
		 if(pcnt!=ycnt) {
			 answer=false;
		 }
		return answer;
	}
}
public class Pro_12916 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("pPoooyY"));
		System.out.println(s.solution("Pyy"));
	}
}
