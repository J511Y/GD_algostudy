package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//테스트 케이스
		
		for (int i = 0; i < t; i++) {
			//공백을 기준으로 문자열을 자름
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());//층
			int w = Integer.parseInt(st.nextToken());//방
			int n = Integer.parseInt(st.nextToken());//n번째 사람
			int cnt = 0;//방의 횟수를 저장
			for (int j = 1; j <= w; j++) {
				for (int k = 1; k <= h; k++) {
					cnt++;
					if(n==cnt) {
						System.out.println(k*100+j);
					}
				}
			}
		}
	}
}
