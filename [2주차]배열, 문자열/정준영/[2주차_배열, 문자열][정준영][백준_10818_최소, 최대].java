package chap5;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2[] = new int[num1];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = scan.nextInt();
		}
		int max = num2[0];
		int min = num2[0];

		if (num1 >= 1 && num1 <= 1000000) {
			for (int i = 0; i < num2.length; i++) {
				if (max < num2[i]) {
					max = num2[i];
				}
				if(min > num2[i]) {
					min = num2[i];
				}
				
			}
		}

		System.out.println(min + " "+ max);
	}
}
