package str_study;

import java.util.Scanner;

public class b_11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int sum = 0;
		String num = scan.next();
		
		for(int i = 0 ; i< cnt ; i++) {
			sum += num.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
