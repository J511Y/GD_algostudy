package two;

import java.util.Scanner;

// 문자열 11654 아스키코드
public class StrEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(str.hashCode());
	}
}
