package q573;

import java.util.Scanner;

public class Others02 {
   public void quada(int n) {
      int[] ar = new int[n * n];
      for (int i = 0; i < ar.length; i++) {
         ar[i] = i + 1;
      }
      for (int i = 0; i < ar.length; i++) {
         System.out.print(ar[i] + " ");
         if (i % n == (n - 1)) {
            System.out.println();
         }
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();

      Others02 main = new Others02();
      main.quada(n);
   }
}
