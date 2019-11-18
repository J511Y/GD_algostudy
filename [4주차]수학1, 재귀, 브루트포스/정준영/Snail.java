package chap8;
import java.util.Scanner;

public class Snail {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String[] str = sc.nextLine().split(" ");
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);
      int V = Integer.parseInt(str[2]);
      
      V = V - A;
      if(V % (A - B) != 0) {
         System.out.println((V / (A - B)) + 2);
      }
      else {
         System.out.println((V / (A - B)) + 1);
      }

   }

}