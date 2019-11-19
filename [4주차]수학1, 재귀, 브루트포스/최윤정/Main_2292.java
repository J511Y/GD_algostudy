package baek;

import java.util.Scanner;
public class Main_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 2;
		int result =0;
		int start = 2;
		if(n==1) result=1;
		else {
			while(true) {
				start = start+6*(cnt-2);
				int end = start+6*(cnt-1);
				if(n>=start && n< end) {
					result = cnt;
					break;
				}else {
					cnt++;
				}
			}
		}
		System.out.println(result);
	}
}
