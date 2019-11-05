import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] a) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		while(true) {
			try {
				int [] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.parseInt(s)).toArray();
				arr=Arrays.copyOfRange(arr, 1, arr.length);
				double avg = Arrays.stream(arr).average().getAsDouble();
				double cnt = 0;
				for(int i : arr)cnt+=i>avg?1:0;
				System.out.printf("%.3f",cnt/arr.length*100);
				System.out.println("%");
			}catch(Exception e) {break;}
		}
		
	}
}