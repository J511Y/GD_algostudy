package study2;

import java.util.Arrays;

class Solution1 {
    public boolean solution(String[] phone_book) {
    	Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
        	if(phone_book[i].indexOf(phone_book[0])!=-1 ) {
        		return false;
        	}
		}
        return true;
    }
}

public class Pro_42577 {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String[] phone_book = {"119","97674223","1195524421"};
		System.out.println(s.solution(phone_book));
	}
}
