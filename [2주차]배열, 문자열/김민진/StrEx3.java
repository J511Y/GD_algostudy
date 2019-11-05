package two;

import java.util.Scanner;

// 문자열 1157 단어공부
public class StrEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String str2 = str.toUpperCase();
		int[] arr = new int[str.length()];
		int[] alpa = new int[26];
		int max = 0;
		int index = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = str2.charAt(i)-'A';
			alpa[arr[i]]++;
		}
		for(int j=0;j<alpa.length;j++) {
			if(alpa[j]>max) {
				max = alpa[j];
				index = j;
			}
		}
		for(int j=0;j<alpa.length;j++) {
			if(alpa[j]==max&&index!=j) {
				cnt++;
			}
		}
		if(cnt>0) {
			System.out.println("?");
		} else {
			
			System.out.println((char)(index+'A'));
		}
	}
}
