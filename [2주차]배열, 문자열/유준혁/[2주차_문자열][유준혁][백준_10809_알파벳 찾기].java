import java.util.*;
public class Main {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		for(byte b : sc.next().getBytes()) list.add((char)b);
		for(char c='a'; c<='z'; c++) System.out.print(list.indexOf(c)+" ");
	}
}