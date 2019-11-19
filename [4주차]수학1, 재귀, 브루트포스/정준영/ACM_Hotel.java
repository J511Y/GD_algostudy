package chap8;

import java.util.Scanner;

public class ACM_Hotel {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int testcase = sc.nextInt();
      
      while(testcase --> 0) {
         int h = sc.nextInt();
         int w = sc.nextInt();
         int n = sc.nextInt();
         StringBuffer sb = new StringBuffer();
         
         int floor = n % h;
         int room = (n / h) + 1;
         
         if(n % h == 0) {
            floor = h;
            room = n / h;
         }
         
         sb.append(floor * 100 + room);
         
         System.out.println(sb.toString());
      }

   }

}
