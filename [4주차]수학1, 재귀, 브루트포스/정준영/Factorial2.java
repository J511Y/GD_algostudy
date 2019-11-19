package chap10;

import java.util.*;

public class Factorial2 {

   public static void main(String[] args) {
      
      int num = new Scanner(System.in).nextInt();
      int fac = 1;
      
      for(int i = num; i > 1; i--) {
         fac *= i;
      }
      if(num == 0 || num == 1) fac = 1;
      
      System.out.println(fac);

   }

}