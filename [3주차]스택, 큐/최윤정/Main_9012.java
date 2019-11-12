package study3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_9012 {
	public static void main(String[] args) throws Exception{
		Stack<String> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean chk = true;
		int t = Integer.parseInt(br.readLine());
		while(t-- >0) {
			String s = br.readLine();
			String sp[] = s.split("");
			if(sp.length<=1) {
				chk = false;
			}else {
				int size =0;
				for (int i = 0; i < sp.length; i++) {
					if(sp[i].equals(")")){
						if(st.empty()) {
							chk = false;
							size --;
							break;
						}else {
							st.pop();
							size --;
						}
					}else {
						st.add(sp[i]);
						size++ ;
						chk = size==0? true:false;
					}
				}
			}
			bw.write((chk?"YES":"NO")+"\n");
			bw.flush();
		}
	}
}
