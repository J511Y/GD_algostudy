package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/10250 ACM호텔
/*
 * 문제 간단 해설
 * --------------------------------
 * 귀찮음이 몸에 밴 하숙객들은 엘리베이터에서 먼 객실을 싫어한다.
 * 높은건 어차피 엘리베이터가 빡셀 뿐이므로 엘베에서 가장 가까운 객실을 순서대로 배정해주면 된다.
 * 여러분이 생각한대로 n 번째 손님은 호텔의 높이로 나눈 몫의 층에, 나머지의 객실에 배정이 될 것이다.
 * 한 가지 특이 케이스로는 나머지가 0인, 딱 떨어지는 순번의 하숙객은 맨 꼭대기 층에 객실을 배정받게 될 것이다.
 * 
 * 마지막으로 출력값을 문제가 원하는대로 조정을 해주어야 한다는 것만 유의하자.
 */
public class baekjoon_10250 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			int h = sc.nextInt();
			sc.nextInt();
			int n = sc.nextInt();
			int nmg = n % h;
			if (nmg == 0)
				System.out.printf("%d%02d\n", h, n / h);
			else
				System.out.printf("%d%02d\n", n % h, n / h + 1);
		}
	}
}
