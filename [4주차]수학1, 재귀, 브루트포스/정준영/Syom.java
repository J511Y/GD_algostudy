package chap11;

import java.util.Scanner;

public class Syom {

   public static void main(String[] args) {
      
      int num = new Scanner(System.in).nextInt();
      int movie = 666;
      int cnt = 1;
      
      while(num != cnt) {
    	  movie++;
    	  if(String.valueOf(movie).contains("666")) {
    		  cnt++;
    	  }
      }
      System.out.println(movie);

   }
}
