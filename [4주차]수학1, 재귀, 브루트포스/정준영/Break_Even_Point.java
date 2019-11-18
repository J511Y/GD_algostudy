package chap8;

import java.util.Scanner;

public class Break_Even_Point {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

         String[] str = sc.nextLine().split(" ");
         long fix = Integer.parseInt(str[0]);
         long cha = Integer.parseInt(str[1]);
         long pri = Integer.parseInt(str[2]);
         

         if (cha >= pri) {
            System.out.println(-1);
         } else {
            System.out.println(fix / (pri - cha) + 1);
         }
   }
}
