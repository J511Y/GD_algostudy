package study3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10828 {
	public static void main(String[] args) throws IOException{
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {//명령이 주어지는 N개의 줄
			String str = br.readLine();
			String arr[] = str.split(" ");
			if(arr[0].contains("push")) {//push 명령
				st.push(Integer.parseInt(arr[1]));
			}else if(arr[0].contains("pop")){//pop 명령
				if(st.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(st.pop());
				}
			}else if(arr[0].contains("top")){//top 명령
				if(st.size()==0) {
					System.out.println(-1);
					continue;
				}else {
					System.out.println(st.lastElement());
				}
			}else if(arr[0].contains("size")){//size 명령
				System.out.println(st.size());
			}else if(arr[0].contains("empty")){//empty 명령
				if(st.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
					
				}
			}
			
			
			
		}
	}
}
