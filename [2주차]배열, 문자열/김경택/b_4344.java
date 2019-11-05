package arr_study;

import java.util.Scanner;

public class b_4344 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt();
		int totalcnt = 0;
		while (C != totalcnt) {
			int N = scan.nextInt();
			int[] num = new int[N];
			int sum = 0;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				num[i] = scan.nextInt();
				sum += num[i];
			}
			double average = sum / N;

			for (int i = 0; i < N; i++) {
				if (num[i] > average) {
					cnt++;
				}
			}
			totalcnt++;
			System.out.printf("\n%.3f", (double)((double)cnt/N)*100);
		}
	}

}
