package q563_desendingOrder;

import java.util.Scanner;

public class Main_Tutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		sc.close();
//		System.out.println();
		
		int Num[] = new int[10];
		for (int i=0; i< num.length; i++) {
			int max = Integer.MIN_VALUE;
			int pos = -1; // pos = position
			for (int j=0; j<num.length; j++) {
				if (num[j] > max) {
					max = num[j];
					pos = j;
				}				
			}
//			System.out.printf("[%d]", max);
			Num[i] = max;
			num[pos] = -1;
//			System.out.println();
			
//			for (int j=0; j<num.length; j++) {
//				System.out.print(num[j] + " ");
//			}
//			System.out.println();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(Num[i] + " ");
		}
	}
}
