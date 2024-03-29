package q574;

import java.util.Scanner;

public class Others01 {
   public int max(int[] num) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < num.length; i++) {
         max = max > num[i] ? max : num[i];
      }
      return max;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] inp = new int[3];

      for (int i = 0; i < 3; i++) {
         inp[i] = sc.nextInt();
      }
      sc.close();

      Others01 m = new Others01();
      int max = m.max(inp);

      System.out.println(max);
   }
}