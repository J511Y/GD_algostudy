import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		int[] arr = new int [26];
		for (byte b : s.getBytes()) arr[b - 'a']++;
		int max = Arrays.stream(arr).max().getAsInt();
		int cnt = 0, idx = -1;
		for(int i=0; i<26; i++)
			if(max == arr[i]) {
				cnt++;
				idx = i;
			}
		System.out.println(cnt == 1 ? (char)('A'+idx) : "?");		
	}
}
