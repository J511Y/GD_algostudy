import java.util.*;
class Main {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		sc.next();
		while(sc.hasNext()) {
			int sum=0;
			int point=0;
			for(byte b : sc.next().getBytes()) {
				if((char)b == 'O') sum += ++point;
				else point=0;
			}
			System.out.println(sum);
		}
	}
}