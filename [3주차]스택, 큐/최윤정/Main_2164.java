package study3;

import java.util.*;
public class Main_2164 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();//6
		if(n==1) {
			System.out.println(1);
			return;
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
			//1 2 3 4 5 6
		}
		while(true) {
			q.poll();
			// 2 3 4 5 6
			// 4 5 6 2
			// 6 2 4
			// 4 6 
			// 4
			if(q.size()==1) {
				break;
			}
			q.add(q.poll());
			// 3 4 5 6 2
			// 5 6 2 4
			// 2 4 6
			// 6 4
		}
		System.out.println(q.poll());
	}
}
