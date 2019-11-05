package chap7;

import java.util.Scanner;

public class SangSoo {

	public static void main(String[] args) {
		
		// 2908
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[2];
		String str[] = new String[2];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		if((int)Math.log10(num[0]) == (int)Math.log10(num[1]) && ((int)Math.log10(num[0])+1) < 4 && ((int)Math.log10(num[1])+1) < 4){
			for(int i = 0; i < num.length; i++) {
				int h = num[i] / 100;
				int t = (num[i] % 100) / 10;
				int o = (num[i] % 100) % 10;
				
				str[i] = "";
				str[i] += o;
				str[i] += t;
				str[i] += h;
			}
			
			if(Integer.parseInt(str[0]) > Integer.parseInt(str[1])) {
				System.out.println(str[0]);
			}
			else {
				System.out.println(str[1]);
			}
		}
	}

}
