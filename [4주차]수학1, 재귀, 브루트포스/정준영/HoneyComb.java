package chap8;

import java.util.Scanner;

public class HoneyComb {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();
      int cnt = 0;
      int pattern = 6;
      int max = 1;
      
      while(num > max) {
         cnt++;
         max += pattern * cnt;
      }
      System.out.println(cnt + 1);
   }

}