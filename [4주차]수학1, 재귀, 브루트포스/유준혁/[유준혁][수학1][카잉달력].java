package baekjoon_math1_yjh;
import java.util.*;
// acmicpc.net/problem/6064
// 하나를 고정 시킨 상태로 반복을 시키는 방법.
// ** 과제 아님 **
public class baekjoon_6064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			int M = sc.nextInt(), N = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			int b = x, cnt = x;
			while (b > N) b -= N;
			if (x == y || b == y) System.out.println(cnt);
			else {
				for (int j = 0; j < N; j++) {
					cnt += M;
					b += M;
					while (b > N) b -= N;
					if (b == y) break;
				}
				if (cnt > M * N)
					System.out.println(-1);
				else
					System.out.println(cnt);
			}
		}
	}
}
