package baekjoon_math1_yjh;
import java.util.*;
// 설탕 배달 문제의 Recursion( 재귀함수 ) 버전이다.
// 문제의 자세한 풀이법은 일반 반복문 쪽에 설명을 해놨으니 참고하면 된다.
public class baekjoon_2839_recursion {
	static int func(int n) {
		if(n < 0) return -9999; 
		// return -1; 을 하게 되면 4를 입력했을 경우 기존 값인 2에서 -1 한 1의 값을 리턴한다. ( 정확한 확인 불가 )
		// 그래서 문제 조건에 나온 최대 1000개 보다 큰 -9999를 해줘서 확인 가능하도록 만들어줌.
		if(n % 5 == 0) return n / 5;
		return 1 + (func(n - 3));
	}
	public static void main(String[] args) {
		int cnt = func(new Scanner(System.in).nextInt());
		System.out.println(cnt < 0 ? -1 : cnt);
	}
}
