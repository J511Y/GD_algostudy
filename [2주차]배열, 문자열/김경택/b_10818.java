package arr_study;

import java.util.Scanner;

public class b_10818 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int[] num = new int[cnt];
		
		
		int maxvalue = -1000000;
		int minvalue = 1000000;
		
		for(int i=0;i<num.length;i++) {
			num[i] = scan.nextInt();
			
			if(maxvalue<num[i]) {
				maxvalue = num[i];
			}
			if(minvalue>num[i]) {
				minvalue = num[i];
			}
		}
		System.out.println(minvalue +" "+ maxvalue);
	}

}
