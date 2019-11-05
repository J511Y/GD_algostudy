package two;

import java.util.Scanner;

//문자열 11720 숫자의합
public class StrEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num = scan.next();
		int sum = 0;
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			int sumN = num.charAt(i)-'0';
			sum += sumN;
		}
		System.out.println(sum);
	}
}
