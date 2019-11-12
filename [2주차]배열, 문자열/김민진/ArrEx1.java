package two;

import java.util.Scanner;

// 1차원배열 2562 최대값
public class ArrEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int n = 0;
		for(int i=0;i<9;i++) {
			int num = scan.nextInt();
			arr[i] = num;
			if(arr[i]>max) {
				max = arr[i];
				n = i+1;
			}
		}
		System.out.println(max+"\n"+n);
	}
}
