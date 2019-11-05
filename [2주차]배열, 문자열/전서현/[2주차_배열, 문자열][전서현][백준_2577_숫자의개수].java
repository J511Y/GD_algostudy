package algorism;

import java.util.Scanner;
 
public class Test1101_2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		String result = Integer.toString(A*B*C);
		int[] num = new int[10];
		for(int i=0;i<result.length();i++) {
			int index = result.charAt(i)-'0';
			num[index]++;
		}
		for(int a : num) {
			System.out.println(a);
		}
	}
}
