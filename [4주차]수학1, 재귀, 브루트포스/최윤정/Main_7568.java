package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_7568 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int w[] = new int[t];
		int h[] = new int[t];
		int r[] = new int[t];
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			h[i] = Integer.parseInt(st.nextToken());
			r[i]=1;
		}
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if((w[i]<w[j]) && (h[i]<h[j])) {
					r[i]+=1;
				}
			}
		}
		for (int i : r) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
