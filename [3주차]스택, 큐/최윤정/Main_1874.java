package study3;

import java.io.*;
import java.util.*;


public class Main_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = cnt; j <= num; j++) {
				stack.push(j);
				cnt ++;
				sb.append("+\n");
			}
			if(stack.peek()==num) {//마지막에 들어온 값이 num과 같은지 확인
				stack.pop();
				sb.append("-\n");
			}
		}
		if(stack.empty()) {//다빠져나오면 스택의 값은 비어있음
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}
}
