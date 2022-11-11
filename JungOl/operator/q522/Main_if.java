package q522;

import java.util.Scanner;

public class Main_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 == num2) {
			System.out.printf("%b\n", num1 == num2);
			System.out.printf("%b\n", num1 != num2);
		} else {
			System.out.printf("%b\n", num1 == num2);
			System.out.printf("%b\n", num1 != num2);
		}
	}
}
