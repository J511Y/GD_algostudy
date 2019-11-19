package baek;
//이 달팽이는 높이가 V미터인 나무 막대
//낮에 +A미터 
//밤에 -B미터 
//나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램

//A<=B 절대 못올라감
//A>B
//	 V=(A-B)*d
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer : 간단하게 문자열을 토큰 단위로 나눠주는 함수
		// StringTokenizer(문자열," ") : 기본
		// StringTokenizer(문자열,토큰) : 기본
		StringTokenizer st = new StringTokenizer(br.readLine());
	    long A = Long.parseLong(st.nextToken());
	    long B = Long.parseLong(st.nextToken());
	    long V = Long.parseLong(st.nextToken());
		long d = (V-B-1)/(A-B)+1;
		System.out.println(d);	
	}
}
// 시간 초과
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int[] tree = Arrays.stream(br.readLine().split(" "))
//		.mapToInt(s -> Integer.parseInt(s))
//		.toArray();
//long A = tree[0];
//long B = tree[1];
//long V = tree[2];
//long d = 0;
//long result = 0;
//while(result!=V) {
//	d++;
//	result+=A;
//	if(result==V) break;
//	else result-=B;
//}
//System.out.println(d);