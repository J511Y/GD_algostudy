package baekjoon_math1_yjh;
import java.util.*;
// acmicpc.net/problem/2869
// ------------------------
// 손익분기점 문제와 비슷하다.
// 숏코딩을 노리던 시절이라 이런식으로 풀었는데 정석으로 풀어도 상관없다.
// 단. 입력이 10억 까지 들어오게 되므로 일반 반복문으로 풀게 되면 시간초과가 날테니 주의하자.
// 반복문의 횟수를 줄이도록 규칙을 단순화 시키는 방법을 생각해보면 된다.
public class baekjoon_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
		System.out.println((int) Math.ceil((double) (x - a) / (a - b)) + 1);
	}
}
