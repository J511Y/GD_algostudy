package arr_study;

import java.util.Scanner;

public class b_2675 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		for (int j = 0; j < cnt; j++) {
			String add = "";
			int strcnt = scan.nextInt();
			String str = scan.next();
			for (int i = 0; i < str.length(); i++) {
				for (int k = 0; k < strcnt; k++) {
					add += str.charAt(i);
				}
			}
			System.out.println(add);
		}
	}
}
