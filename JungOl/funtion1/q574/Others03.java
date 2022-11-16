package q574;

import java.util.Scanner;

public class Others03 {

   Scanner sc = new Scanner(System.in);
   static int arr[] = new int[3];

   int asd(int arr[]) {

      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }

      for (int i = 0; i < arr.length - 1; i++)
         for (int j = 0; j < arr.length - 1 - i; j++)
            if (arr[j] < arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
      int max = arr[0];
      return max;
   }

   public static void main(String[] args) {

      Others03 main = new Others03();
      int result = main.asd(arr);
      System.out.print(result);

   }
}