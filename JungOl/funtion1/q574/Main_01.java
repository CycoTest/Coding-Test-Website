package q574;

import java.util.Scanner;

public class Main_01 {
	Scanner sc = new Scanner(System.in);
	static int x;
	static int y;
	static int z;

	int Max(int x, int y, int z) {
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();

		int max = 0;

		if (x >= y && x >= z) {
			max = x;
		} else if (y >= z && y >= x) {
			max = y;
		} else if (z >= x && z >= y) {
			max = z;
		}

		return max;
	}

	public static void main(String[] args) {
		Main_01 main = new Main_01();

		System.out.println(main.Max(x, y, z));
	}
}
// input = -10 115 33
// output = 115