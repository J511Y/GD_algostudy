import java.util.*;
class Main {
	public static void main(String[] a){
        		Scanner s = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for (int i=0; i<10; i++) set.add(s.nextInt() % 42);
		System.out.println(set.size());
	}
}