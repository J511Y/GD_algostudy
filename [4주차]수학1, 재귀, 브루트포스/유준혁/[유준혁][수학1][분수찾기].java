package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/1193 분수찾기
/*
 * 문제가 이해가 안가는 분들을 위해!
 * ---------------------
 * 문제에 나와있는 그림을 오른쪽으로 45도 꺾어보자.
 * 				1/1
 * 			2/1		1/2
 * 		3/1		2/2		1/3
 * 	4/1		3/2		2/3		1/4
 * 이런식으로 두고 나서 문제의 의미를 파악하면 된다.
 * 가장 왼쪽 위 부터 시작해서 ㄹ 모양으로 훑으면 된다.
 * ---------->┐
 * ┌<---------┘
 * └---------> 이렇게 진행을 하면서 x 번째에 해당하는 분수를 찾으면 된다.
 * 
 * 다음으로 각 행에 속하는 분수들을 보자.
 * 분모와 분자의 합이 늘 일정하다.
 * 1번째 행은 1 + 1 = 2
 * 2번째 행은 2 + 1 = 3, 1 + 2 = 3 으로 x번째 행의 분모 + 분자는 x + 1임을 알 수 있다.
 * 
 * 마지막으로 진행방향을 살펴보자.
 * 1번째와 3번째는 왼쪽에서 오른쪽으로. ( 분자가 점점 작아지는 방향으로 )
 * 2번째와 4번째는 오른쪽에서 왼쪽으로. ( 분자가 점점 커지는 방향으로 ) 진행하게 된다.
 * 
 * 이 세가지 규칙을 지키면서 코딩을 하게 되면 아래와 같이 나오게 된다.
 */
public class baekjoon_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), x = 1, sum = 0;
		while (sum + x < a)
			sum += x++;
		int y = a - sum;
		if (x % 2 == 0)
			System.out.println(y + "/" + (x - y + 1));
		else
			System.out.println((x - y + 1) + "/" + y);

	}
}
