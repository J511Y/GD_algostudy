package chap5;

import java.util.Scanner;

public class Max_value {

	public static void main(String[] args) {
		
		// 2562
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		int idx = 0;
		int num = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] < 100) {
				if(num < arr[i]) {
					num = arr[i];
					idx = i + 1;
				}
			}
		}
		
		System.out.println(num);
		System.out.println(idx);
	}

}
