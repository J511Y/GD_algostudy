package study2;

import java.io.*;
import java.util.*;

public class Main_2908 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] number = br.readLine().split(" ");
		int num1 =0;
		int num2 =0;
		for (int i = 0; i < number.length; i++) {
			String result="";
			char arr[] = number[i].toCharArray();
			for (int j = arr.length-1; j >= 0; j--) {
				result +=arr[j];
				number[i]=result;
			}
			num1 = Integer.parseInt(number[0]);
			num2 = Integer.parseInt(number[1]);
		}
		bw.write((num1>num2?num1:num2)+"");
		bw.flush();
	}
}
