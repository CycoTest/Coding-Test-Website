package q573;

import java.util.Scanner;

public class Others01 {
   int[][] square;

   public void square(int inp) {
      this.square = new int[inp][inp];
   }

   public int[][] arrPrint(int inp) { // 리턴 타입 -> int[][], int타입의 2차원 배열로 리턴
// public void arrPrint(int inp) { 라고 해도 상관 무
      for (int i = 0, num = 1; i < inp; i++) {
         for (int j = 0; j < inp; j++) {
            square[i][j] = num++;
            System.out.print(square[i][j] + " ");
         }
         System.out.println();
      }
      return square;
//    public void arrPrint(int inp) { 로 할 경우, return문을 생략해도 됨
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = sc.nextInt();
      sc.close();

      Others01 arr = new Others01();
      
      arr.square(inp);
      arr.arrPrint(inp);
   }
}