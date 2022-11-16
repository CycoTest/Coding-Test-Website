package q573;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void dimensional() {
		int num = sc.nextInt();
		sc.close();

		int n[][] = new int[num][num];
		for (int i = 0; i < n.length; i++) {
			n[i][0] = 1 + i * num;
			System.out.print(n[i][0] + " ");

			for (int j = 1; j < n.length; j++) {
				n[i][j] += n[i][0] + j;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i<n.length; i++) {
//			for (int j = 1; j < n.length; j++) {
//				n[i][j] += n[i][0] + j; 
//				System.out.print(n[i][j] + " ");
//			}			
//			System.out.println();
//		}
	}

	public static void main(String[] args) {
		Main a = new Main();
		a.dimensional();
	}
}
