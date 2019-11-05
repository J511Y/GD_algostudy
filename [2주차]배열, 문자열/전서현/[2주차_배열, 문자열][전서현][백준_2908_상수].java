package algorism;

import java.util.Scanner;
 
public class Test1101_2908»ó¼ö {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = "";
		String d = "";
		for(int i=2;i>=0;i--) {
			c += a.charAt(i);
		}
		for(int i=2;i>=0;i--) {
			d += b.charAt(i);
		}
		if(Integer.parseInt(c)>Integer.parseInt(d)) {
			System.out.println(c);
		}else if(Integer.parseInt(c)<Integer.parseInt(d)){
			System.out.println(d);
		}
	}
}
