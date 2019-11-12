package chap17;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_World {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		while (!str.equals(".")) {

			Stack<Character> st = new Stack<>();
			boolean flag = true;

			if (str.length() <= 100) {
				for (char c : str.toCharArray()) {
					if (c == '(' || c == '[') {
						st.push(c);
					} else if (c == ')') {
						if (st.size() == 0 || st.peek() != '(') {
							flag = false;
							break;
						}
						else {
							st.pop();
						}
					} else if (c == ']') {
						if (st.size() == 0 || st.peek() != '[') {
							flag = false;
							break;
						}
						else {
							st.pop();
						}
					}
				}
			}

			if (!st.isEmpty()) {
				flag = false;
			}

			System.out.print(flag == true ? "\nYes" : "\nNO");
			
			str = sc.nextLine();
		}

	}

}
