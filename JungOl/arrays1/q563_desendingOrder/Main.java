package q563_desendingOrder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		for (int i=0; i<num.length;i++) {
			num[i] = sc.nextInt();
			System.out.print(num + " ");
		}
		sc.close();
		System.out.println();
		
		int Num[] = new int[10];
		for (int i=0; i<num.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j=0; j<num.length; j++) {
				if (max < num[i]) {
					max = num[i];
					Num[j] = max;
				}
				num[i] = Integer.MIN_VALUE;
			}
			System.out.print(Num[i] + " ");
		}
		System.out.println();
		
	}
}
