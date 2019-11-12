package algorism;

import java.util.LinkedList;
import java.util.Scanner;

public class A191111_10845ť {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         LinkedList<Integer> q = new LinkedList<>();
         while(n-->0) {
            String a = sc.next();
            if(a.startsWith("push")) {
               q.add(sc.nextInt());
            }else if(a.equals("pop")) {
               if(q.size()==0) {
                  System.out.println(-1);
               }else {
                  System.out.println(q.poll());
               }
            }else if(a.equals("size")) {
               System.out.println(q.size());
            }else if(a.equals("empty")) {
               if(q.size()==0) {
                  System.out.println(1);
               }else {
                  System.out.println(0);
               }
            }else if(a.equals("front")) {
               if(q.size()==0) {
                  System.out.println(-1);
               }else{
                  System.out.println(q.peek());
               }
            }else if(a.equals("back")) {
               if(q.size()==0) {
                  System.out.println(-1);
               }else{
                  System.out.println(q.peekLast());
               }
            }
         }
   }
}