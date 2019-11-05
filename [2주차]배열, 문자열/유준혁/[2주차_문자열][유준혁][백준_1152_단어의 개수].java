import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		if(s.equals(" "))System.out.println(0);
		else System.out.println(s.trim().split(" ").length);
	}
}