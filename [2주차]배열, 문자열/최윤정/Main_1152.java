package study2;


import java.io.*;
import java.util.*;
public class Main_1152 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer strtoken = new StringTokenizer(br.readLine(), " ");
		bw.write(strtoken.countTokens()+"");
		bw.flush();
	}
}

//public class Main_1152 {
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String str = br.readLine().trim();
//		String s[] = str.split(" ");
//		int cnt = s.length;
//		if(!str.isEmpty()) {
//			for (int i = 0; i < s.length; i++) {
//				if(s[i].equals("")) {
//					cnt--;
//				}
//			}
//		}else {
//			cnt=0;
//		}
//		bw.write(cnt+"");
//		bw.flush();
//		
//	}
//}


