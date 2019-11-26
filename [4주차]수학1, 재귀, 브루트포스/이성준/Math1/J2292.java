package Algorism.Math1;


	import java.util.*;
	public class J2292 {

		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int cnt  = 0;
			int result = 1;
			int six = 1;
			
			if ( N == 1) {
				result = 1;
			}
			for ( int j = 1; j <= N; j++){
				
				if (cnt== six) {
					result++;
					cnt=1;
					six +=6;
				}
				if ( j == N) {
					break;
				}
				cnt++;
			}
			
			System.out.println(result);
			sc.close();
		}

	}
