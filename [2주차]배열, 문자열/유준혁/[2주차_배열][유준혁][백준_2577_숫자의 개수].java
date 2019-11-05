import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		int input=sc.nextInt()*sc.nextInt()*sc.nextInt();
		while(input>0) {
			arr[input%10]+=1;
			input/=10;
		}
		for(int i : arr)System.out.println(i);
	}
}