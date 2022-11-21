package q597;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String w1 = sc.next();
		String w2 = sc.next();
		sc.close();

		int sum = w1.length() + w2.length();
		System.out.println(sum);
	}
}
