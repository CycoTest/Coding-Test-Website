package q562;

import java.util.Scanner;

public class Main_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];

		int i = 0;
		do {
			scores[i++] = sc.nextInt();
//			System.out.print(scores[i] + " ");
		} while (i < 10);
		sc.close();

		int sum1 = 0;
		for (int j = 0; j < scores.length; j++) {
			if (j % 2 == 1) {
				sum1 += scores[j];
			}
		}
		System.out.println("sum : " + sum1);

		double sum2 = 0, avg = 0;
		for (int j = 0; j < scores.length; j++) {
			if (j % 2 == 0) {
				sum2 += scores[j];
				avg = sum2 / (scores.length / 2);
			}
		}
		System.out.printf("avg : %.1f", avg);
	}
}
