package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		sc.close();
//		System.out.println();

		for (int i = 0; i < num.length; i++) {
			if (num[i] < 100 && max < num[i]) {
				max = num[i];
			} else if (num[i] >= 100 && min > num[i]) {
				min = num[i];
			}

		}

		if (max == Integer.MIN_VALUE) {
			max = 100;
		} else if (min == Integer.MAX_VALUE) {
			min = 100;
		}
		System.out.printf("%d %d", max, min);
	}
}
