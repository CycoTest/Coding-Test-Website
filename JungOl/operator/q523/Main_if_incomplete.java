package q523;

import java.util.Scanner;

public class Main_if_incomplete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 > num2) {
			System.out.printf("%d > %d --- %b\n", num1, num2, num1 > num2);
		} else {
			System.out.printf("%d >= %d --- %b\n", num1, num2, num1 >= num2);
			System.out.printf("%d < %d --- %b\n", num1, num2, num1 < num2);
			System.out.printf("%d <= %d --- %b\n", num1, num2, num1 <= num2);			
		}
	}
}
