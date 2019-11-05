package two;

import java.util.Scanner;

//1차원배열 2577 숫자의 개수
public class ArrEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int x = num1*num2*num3;
		
		String temp = Integer.toString(x);
		int[] arr = new int[temp.length()];
		int[] num = new int[10];
		
		for(int i=0;i<temp.length();i++) {
			arr[i] = temp.charAt(i)-'0';
			num[arr[i]] ++;
		}
		for(int a : num) System.out.println(a);
	}
}
