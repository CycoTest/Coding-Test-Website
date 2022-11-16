package q563_desendingOrder;

import java.util.Scanner;

public class others {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] input = new int[10];

      for(int i=0; i<input.length; i++) {
         input[i] = sc.nextInt();
      }
      sc.close();


      //버블정렬
      for(int i=0; i<input.length; i++) {
         boolean a = false;
         for(int j=0; j<input.length-1-i; j++) {
            if(input[j] < input[j+1]) {
               int tmp = input[j+1];
               input[j+1] = input[j];
               input[j] = tmp;
               a = true;
            }
         }
         if(!a) {
            break;
         }
      }
      for(int i=0; i<input.length; i++) {
         System.out.print(input[i] + " ");
      }
      // -----------------------------------------------------------------------------------

      // 선택정렬
      for(int j=0; j<input.length; j++) {
         int max = Integer.MIN_VALUE;
         for(int i=0; i<input.length; i++) {
            if(input[i] > max) {
               max = input[i];
            }
         }
         System.out.print(max + " ");
         for(int i=0; i<input.length; i++) {
            if(max == input[i]) {
               input[i] = Integer.MIN_VALUE;
            }
         }


      }

   }

}

