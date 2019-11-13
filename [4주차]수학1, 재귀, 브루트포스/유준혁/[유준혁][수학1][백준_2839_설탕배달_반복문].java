package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/submit/2839/16081331 설탕배달
// 설탕배달 문제를 푸는 기본적인 방법 ( 반복문 사용 )
public class baekjoon_2839_normal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while (n > 0) { // n 이 0 보다 클 동안 반복한다.
			if (n % 5 == 0) { // n이 5로 나누어진다면, 5만큼의 봉지로 다 드는게 최소개의 봉지를 사용하게 된다.
				cnt += n / 5;
				break;
			}
			n -= 3; // 5로 나누어지지 않는다면 3을 뺀다.
			cnt++; // 3만큼의 봉지를 하나 사용했으니 cnt++
		}
		System.out.println(n < 0 ? -1 : cnt);
		/*
		 * 위 조건문을 다 돌고 나왔다면 두 가지의 경우가 존재함.
		 * 1. n이 0인 경우.
		 *   - 조건문 중에는 n에서 3을 빼거나, 5를 뺴기만 (if문에서 5를 계속 빼기 귀찮아서 그냥 나눈 몫을 가져옴 ) 한다.
		 *   - 따라서 3과 5를 적절하게 섞어서 n만큼의 크기를 맞출 수 있는 경우가 된다.
		 *   
		 * 2. n이  음수인 경우.
		 *   - 음수가 되는 경우는 한 가지 경우만 존재한다.
		 *   - 3을 계속 빼는데도 5로 나누어 떨어지지 않아서
		 *   - n이 1 or 2 일 때도 3을 뺀 경우. ( -2, -1 )
		 *   - 이럴 경우엔 3과 5로 만들 수 없는 수 이므로 -1을 출력한다.
		 */
	}
}
