package algorism;
 
import java.util.Scanner;
//최대값, 위치
public class Test1101_2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		for(int i=0;i<9;i++) {
			arr[i] = scan.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				idx = i+1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
