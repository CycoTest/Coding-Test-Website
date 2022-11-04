package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ins = sc.nextInt();
		int sum = 0;
		sc.close();
		
		int i = 1;
		do {
			sum += i;
			System.out.println(sum);
		} while (i <= ins);
	}
}
