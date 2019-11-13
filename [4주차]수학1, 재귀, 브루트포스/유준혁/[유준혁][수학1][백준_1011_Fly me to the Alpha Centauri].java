package baekjoon_math1_yjh;
import java.util.*;
// acmicpc.net/problem/1011 Fly me to the Alpha Centauri
// **과제 문제 아님**
// 풀이 간단 설명
// 처음부터 시작해서 최고점을 찍고 점점 내려가는 방식으로 푼 게 아니고,
// 양쪽에서 동시에 출발시켜서 하나씩 증가시키는 방식을 사용했음.
public class baekjoon_1011 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int round = sc.nextInt();
        int arr[] = new int[round];
        for(int i = 0 ; i < round ; i ++) {
            arr[i] = (sc.nextInt()-sc.nextInt())*-1;
        }
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(num == 1){
                System.out.println(1);
                continue;
            }
            int cnt = 0;
            int n = 1;
            while(true) {
                cnt++;
                if(num - n <= 0)break;
                else num -= n;
                cnt++;
                if(num - n <= 0) break;
                else num -= n;
                n++;
            }
            System.out.println(cnt);
        }
    }
}
