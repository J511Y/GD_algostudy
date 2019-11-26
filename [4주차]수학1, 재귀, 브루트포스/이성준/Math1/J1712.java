package Algorism.Math1;

import java.util.*;
public class J1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = (sc.nextInt() - sc.nextInt()) * -1; 
		System.out.println(x <= 0 ? -1 : (a / x + 1)); 
	
	}
}