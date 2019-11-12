package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> q = new LinkedList<>();
		
		int testcase = Integer.parseInt(br.readLine());
		
		while(testcase --> 0) {
			q.clear();
			
			String[] str = br.readLine().split(" ");
			int num = Integer.parseInt(str[0]);
			int sear = Integer.parseInt(str[1]);
			
			String[] pro = br.readLine().split(" ");
			int cnt = 0;
			boolean flag = true;
			
			for(int i = 0; i < num; i++) {
				q.add(Integer.parseInt(pro[i]));
			}
			
			while(!q.isEmpty()) {
				for(int i = 0; i < q.size(); i++) {
					if(q.peek() < q.get(i)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					cnt++;
					q.poll();
					
					if(sear == 0) {
						break;
					}
					else {
						sear -= 1;
					}
				}
				else {
					q.add(q.poll());
					sear = sear == 0 ? q.size()-1 : --sear;
				}
			}
			
			System.out.println(cnt);
		}

	}

}
