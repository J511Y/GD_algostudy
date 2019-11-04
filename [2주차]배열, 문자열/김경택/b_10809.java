package str_study;

import java.util.Scanner;

public class b_10809 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		int[] arr1 = new int[26];
		for(int i =0; i<26; i++) {
			String s = (char)(i+'a')+"";
			arr1[i] = input.indexOf(s);
		}
		for(int i : arr1)System.out.println(i+" ");
		
	}
}
