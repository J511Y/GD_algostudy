import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<9; i++) {
			list.add(sc.nextInt());
		}
		int max = list.stream().max((o1,o2)->{return o1-o2;}).get();
		System.out.println(max);
		System.out.println(list.indexOf(max)+1);
	}
}