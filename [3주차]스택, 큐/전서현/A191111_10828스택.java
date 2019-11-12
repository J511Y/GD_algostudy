package algorism;

import java.util.Scanner;
import java.util.Stack;

public class A191111_10828Ω∫≈√ {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Stack<Integer> st = new Stack<>();
      while(n-->0) {
         String a = sc.next();
         if(a.startsWith("push")) {
            st.push(sc.nextInt());
         }else if(a.equals("pop")) {
            if(st.size()==0) {
               System.out.println(-1);
            }else {
               System.out.println(st.pop());
            }
         }else if(a.equals("top")) {
            if(st.size()==0) {
               System.out.println(-1);
            }else {
               System.out.println(st.peek());
            }
         }else if(a.equals("size")) {
            System.out.println(st.size());
         }else if(a.equals("empty")) {
            if(st.size()==0) {
               System.out.println(1);
            }else {
               System.out.println(0);
            }
         }
      }
   }
}