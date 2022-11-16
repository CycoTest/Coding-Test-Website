package q120;

import java.util.Scanner;

public class Others03 {
   public int bigger(int n1, int n2) {
      int result = Math.abs(n1 - n2);
      return result;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.close();

      Others03 main = new Others03();
      int big = main.bigger(a, b);
      System.out.print(big);
   }
}
