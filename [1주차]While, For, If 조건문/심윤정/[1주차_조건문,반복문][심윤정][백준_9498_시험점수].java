package study;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>=90 ) {
			System.out.println("A");
		}else if(num>=89) {
			System.out.println("B");
		}else if(num>=79) {
			System.out.println("C");
		}else if(num>=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
