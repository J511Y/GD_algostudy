import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int round = sc.nextInt();
        int cnt = 0;
        for(int r=0; r<round; r++) {
        	String [] arr = sc.next().split("");
        	boolean chk=true;
        	for(int i=0; i<arr.length; i++) {
        		String s = arr[i];
        		chk=true;
        		boolean going=true;
        		for(int j=i+1; j<arr.length; j++) {
        			if(s.equals(arr[j])&&chk)continue;
        			if(s.equals(arr[j])&&!chk) {
        				going=false;
        				break;
        			}
        			if(!s.equals(arr[j]))chk=false;
        		}
        		if(!going)break;
        	}
        	if(chk)cnt++;
        }
        System.out.println(cnt);
    }
}