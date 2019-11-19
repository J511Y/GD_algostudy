package baek;

import java.util.Scanner;

public class Main_10872 {
	static int factorial(int n) {
		if(n<=1) return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
// 반복문 이용해서 풀기
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		int result = 1;
//		if(n==0) result=0;
//		for (int i = 1; i <= n ; i++) {
//			result*=i;
//		}
//		System.out.println(result);
//	}
//}
