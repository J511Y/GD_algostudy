package chap7;

import java.util.Scanner;

public class Sum_Num {

	public static void main(String[] args) {
		
		// 11720
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		
		if(1 <= num && num <= 100) {
			String str = sc.next();
			
			if(str.length() == num) {
				for(int i = 0; i < str.length(); i++) {
					sum += Integer.parseInt(str.substring(i, i + 1));
				}
			}
		}
		
		System.out.println(sum);
	}
}
