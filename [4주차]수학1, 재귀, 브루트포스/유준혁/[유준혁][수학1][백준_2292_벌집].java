package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/2292 벌집
/*
 * 본문의 문제를 보면 정 가운데 1에서부터 회오리 모양으로 숫자가 진행되는데,
 * 1, 6, 12, 18 개의 겹으로 둘러쌓여있다.
 * 
 * 맞닿아 있는 겹끼리는 1개의 방만 지나가면 된다.
 *  
 * 본문 그림의 66, 67, 68을 두고 테스트를 해보자.
 * 모두 똑같이 5개의 방을 지나야 한다는 걸 알 수 있다.
 * 그리고 66, 67, 68은 같은 겹에 속해있는 수이다.
 * 
 * 
 * => n번째 겹으로 가는 최소경로는 n-1개의 방을 지나면 된다.
 * => 1 + 6 + 12 + 18 + 24 		= 61 5번째 겹
 * => 1 + 6 + 12 + 18 + 24 + 30 = 91 6번째 겹
 * 66, 67, 68은 6번째 겹에 속해있는 수 이므로
 * 1번째 겹에서 5번의 방을 지나가야 한다.
 * 
 * 코드는 아래와 같다.
 */
public class baekjoon_2292 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int i = 1;
		int r = 1;
		while (r < n)
			r += 6 * i++;
		System.out.println(i);
	}
}
