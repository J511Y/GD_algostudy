package chap10;

import java.util.Scanner;

public class Factorial {

   public static void main(String[] args) {
   
      int num = new Scanner(System.in).nextInt();
      
      if(num >= 0 && num <= 12) System.out.println(Fac(num));
   
   }
   
   private static int Fac(int num) {
   
      if(num == 1 || num == 0) return 1;
      
      return num * Fac(num - 1);
   }
}