package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] w = new char[10];

		for (int i = 0; i < w.length; i++) {
//			char wx = sc.next().charAt(0);
//			w[i] = wx;
			w[i] = sc.next().charAt(0);
		}
		sc.close();

		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i]);
		}
	}
}
