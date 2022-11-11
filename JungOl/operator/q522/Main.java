package q522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%b\n", r1==r2);
		System.out.printf("%b\n", r1!=r2);
	}
}
