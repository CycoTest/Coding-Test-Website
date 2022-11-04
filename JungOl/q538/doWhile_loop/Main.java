package doWhile_loop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("number? ");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("positive integer");
			} else if (num < 0) {
				System.out.println("negative integer");
			} else {
				break;
			}
		} while (num != 0);
		sc.close();
	}
}
