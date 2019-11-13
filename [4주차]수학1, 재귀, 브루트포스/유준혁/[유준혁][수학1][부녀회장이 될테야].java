package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/2775 부녀회장이 될테야
// 과제에는 없는 문제.
// 규칙 찾기 귀찮아서 애초에 모든 배열을 만들어놓고
// 입력받은 대로 꺼내주기만 했음.
public class baekjoon_2775 {
	public static int[][] hotel = new int[15][15];
	static {
		hotel[0] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i = 0; i < 15; i++)
			hotel[i][0] = 1;
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				hotel[i][j] = hotel[i][j - 1] + hotel[i - 1][j];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			System.out.println(hotel[sc.nextInt()][sc.nextInt() - 1]);
		}
	}
}
