package algorism;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a>=b && b>=c || c>=b && b>=a) {
			System.out.println(b);
		}else if(b>=a && a>=c || c>=a && a>=b) {
			System.out.println(a);
		}else if(b>=c && c>=a || a>=c && c>=b) {
			System.out.println(c);
		}
	}
}