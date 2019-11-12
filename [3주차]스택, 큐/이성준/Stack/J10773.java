package Stack;
import java.util.*;
public class J10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //스텍에 k개가 들어노는대로 쌓자..
	      Scanner sc = new Scanner(System.in);
	      
	      Stack<Integer> stack = new Stack<>();
	      int k = sc.nextInt();
	      
	      for(int i =0; i < k; i++) {
	         int x = sc.nextInt();
	         if(x == 0) stack.pop();
	         else stack.push(x);         
	      }
	      int sum = 0;
	      for(Integer i : stack) {
	         sum += i;
	      }
	      System.out.println(sum);
	      sc.close();


	}

}
