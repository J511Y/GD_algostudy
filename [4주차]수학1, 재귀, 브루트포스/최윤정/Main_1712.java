package baek;
//1000 70 170
//1:1070 170
//2:1140 340
//3:1210 510
//4:1380 680
//...
//10:1700 1700
//11:1770 1870
//정답 11
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1712 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] val = Arrays.stream(br.readLine().split(" "))
				.mapToInt(s -> Integer.parseInt(s))
				.toArray();
		long cost = val[0];
		long sale = 0;
		long cnt = 0;
		if(val[1]<val[2]) {
			while(cost>=sale) {
				cost+=val[1];
				sale =val[2] * (++cnt);
			}
			System.out.println(cnt);
		}else {
			System.out.println(-1);
		}
		
	}
}

//시간 초과 ㅜㅡㅜ
//		long[] val = Arrays.stream(br.readLine().split(" "))
//				.mapToLong(s -> Long.parseLong(s))
//				.toArray();
//		long cost = val[0];
//		long sale = 0;
//		int cnt = 0;
//		while(cost>=sale) {
//			cost+=val[1];
//			sale =val[2] * (++cnt);
//		}
