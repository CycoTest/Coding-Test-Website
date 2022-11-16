package q120;

import java.util.Scanner;

public class Main {

	int minus(int x, int y) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int tmp;

		if (max < x && x > y) {
			max = x;
			tmp = max;
			x = tmp;
		} else if (x < y) {
			max = y;
			tmp = max;
			y = tmp;
		}

		if (min > x && x < y) {
			min = x;
			tmp = min;
			x = tmp;
		} else if (x > y) {
			min = y;
			tmp = min;
			y = tmp;
		}
		return max - min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(main.minus(x, y));
	}
}
