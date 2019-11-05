package study2;


/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다
 * 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
 * 이어서 N명의 점수가 주어진다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여
 * 소수점 셋째 자리까지 출력한다.
 */
import java.io.*;

public class Main_4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());
		for (int i = 0; i < c; i++) {
			int sum = 0;
			double avg = 0.0;
			int cnt=0;
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			for (int j = 1; j < str.length; j++) {
				sum+=Integer.parseInt(str[j]);
			}
			avg = sum/n;
			for (int j = 1; j < str.length; j++) {
				double num = Integer.parseInt(str[j]);
				if(avg<num) {
					cnt++;
				}
			}
			double v = (double)cnt/n*100;
			bw.write(String.format("%.3f", v)+"%\n");
		}
		bw.flush();
	}
}
