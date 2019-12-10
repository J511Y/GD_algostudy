package baekjoon_DFSBFS;
import java.util.*;
public class baekjoon_1260 {
	static int[][] map; // ���� ���
	static boolean[] vst; // �湮 ���� boolean �迭
	
	static void dfs(int v) { // ��������� Ž���ϴ� dfs
		vst[v] = true; System.out.print(v + " "); // �湮�ߴٰ� ����, ���
		for(int i = 1; i < map.length; i++) {  // ���� ����� v �� Ž��
			if(!vst[i] && map[v][i] == 1) dfs(i); // �湮���� �ʾҰ�, ����Ǿ� �ִٸ� ��� ����
		}
	}
	
	static void bfs(int v) { // Queue�� �̿��ϴ� bfs
		Queue<Integer> q = new LinkedList<>();
		q.add(v); vst[v] = true; // �������� ť�� �־��, �湮 ǥ��
		while(!q.isEmpty()) { // ť�� ���Ұ� �ִµ��� ��� Ž��
			int a = q.poll(); // �� �� ���� ����
			System.out.print(a+" "); // ���
			for(int i = 1; i < map.length; i++) { // ���� ����� a�� Ž��
				if(!vst[i] && map[a][i] == 1) {
					vst[i] = true;
					q.add(i); // ť �� �ڿ� �־���
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), v = sc.nextInt();
		map = new int[n+1][n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			map[a][b] = map[b][a] = 1; // ������̹Ƿ� a,b b,a �� �� 1�� �������
		}
		
		vst = new boolean[n+1]; dfs(v);
		System.out.println();
		vst = new boolean[n+1]; bfs(v);
	}
}
