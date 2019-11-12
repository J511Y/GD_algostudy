package Stack;
import java.util.*;
public class J9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-->0) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			String s = sc.next();// (())())
			char[] arr = s.toCharArray();
			
			for(char c : arr) {
				if(c =='(') stack.push(c);
				else { // c == ')'
					if(stack.size() ==0) {
						flag = false;
						break;
					}else {
						stack.pop();
					}
				
				}
			}
			if(stack.size() > 0) {
				flag =false;
			}
			System.out.println(flag ? "YES" : "NO");
		}
	}

}
