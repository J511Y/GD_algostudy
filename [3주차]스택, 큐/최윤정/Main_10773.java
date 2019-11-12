package study3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws Exception{
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k  = Integer.parseInt(br.readLine());
		int sum = 0;
		while(k-- >0) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) {
				st.pop();
			}else {
				st.add(n);
			}
		}
		for (Integer i : st) {
			sum+=i;
		}
		bw.write(sum+"");
		bw.flush();
	}
}
