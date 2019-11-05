package chap5;

import java.util.Scanner;

public class Scale {

	public static void main(String[] args) {
		
		// 2920
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] >= 1 && arr[i] <= 8) {
				str += arr[i] + "";
			}
		}
		
		if(str.equals("12345678")) {
			System.out.println("ascending");
		}
		else if(str.equals("87654321")) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}

}
