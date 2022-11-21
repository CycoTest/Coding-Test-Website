package q125;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 0; i < num; i++) {
			int result = i + 1;
			System.out.print(result + " ");
		}
	}
}
