package arr_study;

import java.util.Scanner;

public class b_8958 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();

		char O = 'O';
		char X = 'X';
		
		for(int i = 0 ; i < cnt ; i++) {
			int Osum = 0;
			int Oplus = 0;
			String OX = scan.next();
			for(int j = 0; j<OX.length();j++) {
				
				if(OX.charAt(j)==O) {
					Osum += ++Oplus;
				}else {
					Oplus = 0;
				}
			}
		System.out.println(Osum);
		}
	}
}
