import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		while(rnd-->0) {
			int i = sc.nextInt();
			if(max < i) max = i;
			if(min > i) min = i;
		}
		System.out.println(min + " " + max);
	}
}
