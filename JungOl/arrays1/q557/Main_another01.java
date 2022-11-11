package q557;

import java.util.Scanner;

public class Main_another01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = new char[10];

		for (int i = 0; i < a.length; i++) {
			if (i % 3 == 0 && i <= 7) {
				a[i] = sc.next().charAt(0);
				
				System.out.printf("%c ", a[i]);
			} else {
				a[i] = sc.next().charAt(0);
			}
		}
		sc.close();
	}
}
