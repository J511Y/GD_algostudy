package baekjoon_recursion_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/10872 팩토리얼
// 재귀 함수 연습 문제.
// 기본적인 재귀의 사용법과 재귀를 반복문으로 변환하는 연습을 해보시면 됩니다.
// ** 0! = 1 입니다.
// ** 1! = 1 입니다.
public class baekjoon_10872 {
	// 재귀를 사용한 방식.
	static int fact(int i) {
		if (i < 2) return 1;
		return i * fact(i - 1);
	}
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		System.out.println(fact(x));
		
		//반복문을 사용한 방식. 사용하는 변수가 조금 늘었다.
		int rst = 1;
		for(int i = 1; i <= x; i++) rst *= i;
		System.out.println(rst);
	}
}
